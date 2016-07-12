package com.lostincontext.mainscreen;

import android.app.PendingIntent;

import com.lostincontext.commons.BasePresenter;
import com.lostincontext.commons.BaseView;


public interface MainScreenContract {

    interface View extends BaseView<Presenter> {

        PendingIntent getPendingIntent();

        void openPlaylistsScreen();

        void getLatLng();
    }

    interface Presenter extends BasePresenter {

        void onFabClicked();
    }
}
