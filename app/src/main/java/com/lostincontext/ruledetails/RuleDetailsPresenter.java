package com.lostincontext.ruledetails;

import com.google.android.gms.maps.model.LatLng;
import com.lostincontext.R;
import com.lostincontext.commons.list.Section;
import com.lostincontext.data.GridBottomSheetItem;
import com.lostincontext.data.RuleDetails;
import com.lostincontext.data.location.LocationModel;
import com.lostincontext.data.location.repo.LocationRepository;
import com.lostincontext.data.playlist.Playlist;
import com.lostincontext.data.rules.CompositeFenceVM;
import com.lostincontext.data.rules.CompositeFenceVM.Operator;
import com.lostincontext.data.rules.DetectedActivityFenceVM;
import com.lostincontext.data.rules.FenceVM;
import com.lostincontext.data.rules.HeadphoneFenceVM;
import com.lostincontext.data.rules.LocationFenceVM;
import com.lostincontext.data.rules.NotFenceVM;
import com.lostincontext.data.rules.Rule;
import com.lostincontext.ruledetails.items.FenceItem;
import com.lostincontext.ruledetails.items.FenceItem.Link;
import com.lostincontext.ruledetails.pick.BottomSheetItemSection;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import static com.google.common.collect.Lists.newArrayList;
import static com.lostincontext.ruledetails.items.FenceItem.Link.AND;
import static com.lostincontext.ruledetails.items.FenceItem.Link.AND_NOT;
import static com.lostincontext.ruledetails.items.FenceItem.Link.IF;
import static com.lostincontext.ruledetails.items.FenceItem.Link.OR_NOT;

public class RuleDetailsPresenter implements RuleDetailsContract.Presenter {


    private static final String TAG = RuleDetailsPresenter.class.getSimpleName();

    private final RuleDetailsContract.View view;

    private final RuleDetails ruleDetails = new RuleDetails();

    private final LocationRepository locationRepository;

    private List<FenceItem> items = new ArrayList<>();
    private Playlist playlist;


    @Inject RuleDetailsPresenter(RuleDetailsContract.View view,
                                 LocationRepository locationRepository) {
        this.view = view;
        this.locationRepository = locationRepository;
    }

    @Inject void setup() {
        view.setPresenter(this);
    }


    @Override public void start() {
        view.setItems(items);
        view.setRuleDetails(ruleDetails);
    }

    @Override public void onLinkClick(FenceItem item) {
        toggleLink(item);
    }

    @Override public void onPlaylistPickerClick() {

    }


    public void toggleLink(FenceItem item) {
        switch (item.link) {
            case AND:
                item.link = Link.OR;
                break;
            case OR:
                item.link = AND_NOT;
                break;
            case AND_NOT:
                item.link = OR_NOT;
                break;
            case OR_NOT:
                item.link = AND;
                break;
            case IF:
                break;
        }

        view.notifyItemChanged(items.indexOf(item));


    }

    @Override public void onPlusButtonClick() {
        view.displayFenceChoice();
    }

    public enum Picker {
        WALK,
        RUN,
        BIKE,
        CAR,
        PLUG_IN,
        PLUG_OUT,
        HOME,
        WORK,
        PLAYLIST
    }

    @Override public List<Section> provideFenceChoices() {

        List<GridBottomSheetItem> choices = newArrayList(new GridBottomSheetItem("Walking",
                                                                                 R.drawable.ic_walk_24,
                                                                                 Picker.WALK),
                                                         new GridBottomSheetItem("Running",
                                                                                 R.drawable.ic_run_24,
                                                                                 Picker.RUN),
                                                         new GridBottomSheetItem("On bicycle",
                                                                                 R.drawable.ic_bike_24,
                                                                                 Picker.BIKE),
                                                         new GridBottomSheetItem("In vehicle",
                                                                                 R.drawable.ic_car_24,
                                                                                 Picker.CAR),
                                                         new GridBottomSheetItem("Plugged in",
                                                                                 R.drawable.ic_headset_24,
                                                                                 Picker.PLUG_IN),
                                                         new GridBottomSheetItem("Plugged out",
                                                                                 R.drawable.ic_headset_24,
                                                                                 Picker.PLUG_OUT),
                                                         new GridBottomSheetItem("At home",
                                                                                 R.drawable.ic_home_24,
                                                                                 Picker.HOME),
                                                         new GridBottomSheetItem("At work",
                                                                                 R.drawable.ic_work_24,
                                                                                 Picker.WORK));

        BottomSheetItemSection fencesSection = new BottomSheetItemSection("Pick a condition", choices);


        List<GridBottomSheetItem> playlistPickers = newArrayList(new GridBottomSheetItem("Playlist",
                                                                                         R.drawable.ic_music_note_24,
                                                                                         Picker.PLAYLIST));

        BottomSheetItemSection mediaPickSection = new BottomSheetItemSection("Pick a playlist", playlistPickers);

        return Arrays.<Section>asList(fencesSection,
                                      mediaPickSection);
    }


    @Override public void onGridBottomSheetItemClick(GridBottomSheetItem item) {
        switch (item.picker) {

            case WALK:
            case RUN:
            case BIKE:
            case CAR:
            case PLUG_IN:
            case PLUG_OUT:
                FenceItem fenceItem = FenceItem.createFromPick(item, getFenceVMForPick(item), items.isEmpty());
                items.add(fenceItem);
                view.notifyItemInserted(items.indexOf(fenceItem));
                break;

            case HOME:
            case WORK:
                handleLocationItemClick(item);
                break;

            case PLAYLIST:
                view.pickAPlaylist();
                break;
        }
    }


    private void handleLocationItemClick(GridBottomSheetItem item) {
        String name = item.picker.name();
        LocationModel locationModel = getLocation(name);
        if (locationModel == null) view.showLocationPicker(name);
        else addLocationFence(item, locationModel);
    }

    private void addLocationFence(GridBottomSheetItem item, LocationModel locationModel) {
        FenceVM fenceVM = new LocationFenceVM(locationModel.placeName, locationModel.getLatLng());
        FenceItem fenceItem = FenceItem.createFromPick(item, fenceVM, items.isEmpty());
        items.add(fenceItem);
        view.notifyItemInserted(items.indexOf(fenceItem));

    }

    private LocationModel getLocation(String locationName) {
        LocationModel location = null;
        try {
            location = locationRepository.getLocation(locationName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return location;
    }


    private FenceVM getFenceVMForPick(GridBottomSheetItem pick) {
        switch (pick.picker) {

            case WALK:
                return new DetectedActivityFenceVM(DetectedActivityFenceVM.Type.WALKING,
                                                   DetectedActivityFenceVM.State.DURING);

            case RUN:
                return new DetectedActivityFenceVM(DetectedActivityFenceVM.Type.RUNNING,
                                                   DetectedActivityFenceVM.State.DURING);
            case BIKE:
                return new DetectedActivityFenceVM(DetectedActivityFenceVM.Type.ON_BICYCLE,
                                                   DetectedActivityFenceVM.State.DURING);
            case CAR:
                return new DetectedActivityFenceVM(DetectedActivityFenceVM.Type.IN_VEHICLE,
                                                   DetectedActivityFenceVM.State.DURING);

            case PLUG_IN:
                return new HeadphoneFenceVM(HeadphoneFenceVM.State.PLUGGED_IN);

            case PLUG_OUT:
                return new HeadphoneFenceVM(HeadphoneFenceVM.State.PLUGGED_OUT);

        }
        throw new RuntimeException("surprise !");
    }

    @Override public void onPlaylistPicked(Playlist playlist) {
        this.playlist = playlist;
        view.showPlaylist(playlist);
    }

    @Override public void onPlacePicked(String placeName, LatLng latLng) {
        locationRepository.saveLocation(placeName, latLng);
    }


    @Override public boolean onMenuItemClick(int itemId) {
        switch (itemId) {
            case R.id.action_delete:
                deleteRule();
                return true;

            case R.id.action_save:
                saveRule();
                return true;
        }
        return false;
    }

    private void deleteRule() { }

    // todo validate input and diplay snackbar when there is an issue
    private void saveRule() {
        Rule rule = new Rule();

        if (items.isEmpty()) return;
        if (playlist == null) return;

        rule.setName(ruleDetails.name);
        rule.setPlaylist(playlist);

        FenceVM fenceVM = extractFenceForRule();
        rule.setFenceVM(fenceVM);


    }


    private FenceVM extractFenceForRule() {
        FenceVM completedFence = null;
        FenceVM fenceToAccumulate;
        List<FenceItem> list = getCleanedList();
        for (int i = 0, count = list.size(); i < count; i++) {
            FenceItem item = list.get(i);

            // first, we regroup the next compatible fences together in a composite blob :
            int j = i + 1;
            List<FenceVM> similarItems = new ArrayList<>();
            Link link = null;
            while (j < count) {
                FenceItem nextItem = list.get(j);
                if (item.link.equals(IF) && (link == null || link == nextItem.link)
                        || nextItem.link.equals(item.link)) {
                    similarItems.add(nextItem.fenceVM);
                    link = nextItem.link;
                    j++;
                } else break;
            }

            if (similarItems.isEmpty()) fenceToAccumulate = item.fenceVM;
            else {
                i = j - 1;
                similarItems.add(0, item.fenceVM);
                Operator op = link == Link.OR ? Operator.OR : Operator.AND;
                fenceToAccumulate = new CompositeFenceVM(similarItems, op);
            }

            // then we assemble with the existing result :

            if (completedFence == null) completedFence = fenceToAccumulate;
            else {
                Operator op = link == Link.OR ? Operator.OR : Operator.AND;
                completedFence = new CompositeFenceVM(Arrays.asList(completedFence, fenceToAccumulate), op);
            }

        }
        return completedFence;
    }

    List<FenceItem> getCleanedList() {
        List<FenceItem> cleanedItems = new ArrayList<>(items.size());


        for (FenceItem item : items) {
            switch (item.link) {

                case AND:
                case OR:
                case IF:
                    cleanedItems.add(item);
                    break;

                case AND_NOT:
                case OR_NOT:
                    FenceItem duplicate = new FenceItem(new NotFenceVM(item.fenceVM),
                                                        item.name,
                                                        item.drawableRes,
                                                        false);
                    duplicate.link = item.link == AND_NOT ? AND : Link.OR;
                    cleanedItems.add(duplicate);
                    break;
            }
        }
        return cleanedItems;
    }
}
