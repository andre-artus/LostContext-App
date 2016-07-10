package com.lostincontext.data;


import com.lostincontext.commons.images.DeezerImage;
import com.lostincontext.commons.images.DeezerImageUrlGenerator.DeezerImageType;

public class Playlist implements DeezerImage {

    private int id;
    private String title;
    private String coverMd5;
    @DeezerImageType private int imageType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getCoverMd5() {
        return coverMd5;
    }

    public void setCoverMd5(String coverMd5) {
        this.coverMd5 = coverMd5;
    }

    @Override
    @DeezerImageType
    public int getImageType() {
        return imageType;
    }

    public void setImageType(@DeezerImageType int imageType) {
        this.imageType = imageType;
    }

    public static String JSON = "{\"data\":[{\"id\":1549683151,\"title\":\"- Ecouter Plus Tard\",\"duration\":276,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":0,\"nb_tracks\":1,\"fans\":1,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/1549683151\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/1549683151\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/e5112921e0627e754ea1c1f6bbe137c3\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/e5112921e0627e754ea1c1f6bbe137c3\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/e5112921e0627e754ea1c1f6bbe137c3\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"072740cfeb7ca1a034bb3b06ff4c232a\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/1549683151\\/tracks\",\"creation_date\":\"2016-01-06 11:45:55\",\"time_add\":1452080755,\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":160504851,\"title\":\"- SKI -\",\"duration\":3343,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":0,\"nb_tracks\":13,\"fans\":16,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/160504851\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/160504851\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/playlist\\/b767939d4707e2c7c11d3ca95ac0297e\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/playlist\\/b767939d4707e2c7c11d3ca95ac0297e\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/playlist\\/b767939d4707e2c7c11d3ca95ac0297e\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"0ef9759299e96960441f98cc800dc071\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/160504851\\/tracks\",\"creation_date\":\"0000-00-00 00:00:00\",\"time_add\":1437055297,\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":609456965,\"title\":\"-- OLD Favourites --\",\"duration\":322,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":0,\"nb_tracks\":1,\"fans\":0,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/609456965\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/609456965\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/47f2aae6bd4b82f9d7d5940e7a4b2f3c\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/47f2aae6bd4b82f9d7d5940e7a4b2f3c\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/47f2aae6bd4b82f9d7d5940e7a4b2f3c\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"0d7597c64b5d4b10df0595abd3a017b2\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/609456965\\/tracks\",\"creation_date\":\"0000-00-00 00:00:00\",\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":252588531,\"title\":\"---- A d\\u00e9couvrir\",\"duration\":2326,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":0,\"nb_tracks\":10,\"fans\":5,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/252588531\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/252588531\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/playlist\\/8961c80799a4d93cba20abf3b1aa0648\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/playlist\\/8961c80799a4d93cba20abf3b1aa0648\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/playlist\\/8961c80799a4d93cba20abf3b1aa0648\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"48b8c11f87a694baf577dc57a9c769e3\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/252588531\\/tracks\",\"creation_date\":\"0000-00-00 00:00:00\",\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":105641411,\"title\":\"---- Marion\",\"duration\":2867,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":0,\"nb_tracks\":10,\"fans\":3,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/105641411\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/105641411\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/2d9bf7658e6423266db891eb27b9bda7-523d599d081885748839f02c29f037a3-3d5ef81b8e6c4b5c35ebe1dfa69a0463-d692f346174cdb895bf0dff826cb072b\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/2d9bf7658e6423266db891eb27b9bda7-523d599d081885748839f02c29f037a3-3d5ef81b8e6c4b5c35ebe1dfa69a0463-d692f346174cdb895bf0dff826cb072b\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/2d9bf7658e6423266db891eb27b9bda7-523d599d081885748839f02c29f037a3-3d5ef81b8e6c4b5c35ebe1dfa69a0463-d692f346174cdb895bf0dff826cb072b\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"f837f58ae9c5ceaeb1b27521feb47960\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/105641411\\/tracks\",\"creation_date\":\"0000-00-00 00:00:00\",\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":45683464,\"title\":\"00 - Soir\\u00e9e\",\"duration\":6433,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":5,\"nb_tracks\":26,\"fans\":37,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/45683464\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/45683464\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/de9913ead924d56ec69f8334df3c48c4-b233c03772265361eb5f16412199229f-caa13d41a175d0c10489f9f2c4b7b10f-7800081d4d217c2bd45aceeed5b927a0\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/de9913ead924d56ec69f8334df3c48c4-b233c03772265361eb5f16412199229f-caa13d41a175d0c10489f9f2c4b7b10f-7800081d4d217c2bd45aceeed5b927a0\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/de9913ead924d56ec69f8334df3c48c4-b233c03772265361eb5f16412199229f-caa13d41a175d0c10489f9f2c4b7b10f-7800081d4d217c2bd45aceeed5b927a0\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"750b9499112a66b8c546d31a8491da54\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/45683464\\/tracks\",\"creation_date\":\"0000-00-00 00:00:00\",\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":57652430,\"title\":\"000-  WORK\",\"duration\":1213,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":0,\"nb_tracks\":6,\"fans\":1,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/57652430\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/57652430\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/0c0491e53616b75dc4bdf6268d9b8a85-ec7471fd39b26b70b367f3025c8701e0-70523554654c4831a55d42128e4448d3-51483d73a0e2397e1217b317fabee9d1\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/0c0491e53616b75dc4bdf6268d9b8a85-ec7471fd39b26b70b367f3025c8701e0-70523554654c4831a55d42128e4448d3-51483d73a0e2397e1217b317fabee9d1\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/0c0491e53616b75dc4bdf6268d9b8a85-ec7471fd39b26b70b367f3025c8701e0-70523554654c4831a55d42128e4448d3-51483d73a0e2397e1217b317fabee9d1\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"5909d514c18007db010c1eef94f9974e\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/57652430\\/tracks\",\"creation_date\":\"0000-00-00 00:00:00\",\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":58286310,\"title\":\"0000  - MIX\",\"duration\":1805,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":3,\"nb_tracks\":6,\"fans\":0,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/58286310\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/58286310\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/128122ef025ca8fbe5a443bb3c927fbc\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/128122ef025ca8fbe5a443bb3c927fbc\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/128122ef025ca8fbe5a443bb3c927fbc\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"fd7f72969963bdacca42ed1a324b1be1\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/58286310\\/tracks\",\"creation_date\":\"0000-00-00 00:00:00\",\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":884145871,\"title\":\"0000000000 - mariage anna\",\"duration\":1382,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":0,\"nb_tracks\":5,\"fans\":1,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/884145871\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/884145871\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/b4ff500ac3523e2ce881818f9ffb1879-85ee033f327cf4612259d0ab8eb0f14d-b298094528702627877720d0be4448b5-4874217307fae554c3e695e7bb813b9c\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/b4ff500ac3523e2ce881818f9ffb1879-85ee033f327cf4612259d0ab8eb0f14d-b298094528702627877720d0be4448b5-4874217307fae554c3e695e7bb813b9c\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/b4ff500ac3523e2ce881818f9ffb1879-85ee033f327cf4612259d0ab8eb0f14d-b298094528702627877720d0be4448b5-4874217307fae554c3e695e7bb813b9c\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"8b51d3ca2cacb5d4dc00f01db38ff6ed\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/884145871\\/tracks\",\"creation_date\":\"2014-05-31 18:14:41\",\"time_add\":1401623166,\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":29070708,\"title\":\"01 - From radio\",\"duration\":4025,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":0,\"nb_tracks\":19,\"fans\":7,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/29070708\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/29070708\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/aa0945d48f529a03694fae188116f3c4-08f1fc5be4c2fa25b7e191b20d949802-8edea087f65bafb27873bc3b0eae37ec-4d18ab73d45617eddcb936ccd0e8c2cc\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/aa0945d48f529a03694fae188116f3c4-08f1fc5be4c2fa25b7e191b20d949802-8edea087f65bafb27873bc3b0eae37ec-4d18ab73d45617eddcb936ccd0e8c2cc\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/aa0945d48f529a03694fae188116f3c4-08f1fc5be4c2fa25b7e191b20d949802-8edea087f65bafb27873bc3b0eae37ec-4d18ab73d45617eddcb936ccd0e8c2cc\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"200247abcd4ed57d0804e5a1cd3e532f\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/29070708\\/tracks\",\"creation_date\":\"0000-00-00 00:00:00\",\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":52354392,\"title\":\"01 - Radio Deezer\",\"duration\":8432,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":0,\"nb_tracks\":41,\"fans\":48,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/52354392\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/52354392\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/a31c779d5a4ac2ae4909fad56ebc6ebc-195d3d2c1196b20711cfb6ad76e1c2ba-25a496e47564fa0d1f6394a1728b82a3-9409f835427edca9a97b6f9c1e43e004\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/a31c779d5a4ac2ae4909fad56ebc6ebc-195d3d2c1196b20711cfb6ad76e1c2ba-25a496e47564fa0d1f6394a1728b82a3-9409f835427edca9a97b6f9c1e43e004\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/a31c779d5a4ac2ae4909fad56ebc6ebc-195d3d2c1196b20711cfb6ad76e1c2ba-25a496e47564fa0d1f6394a1728b82a3-9409f835427edca9a97b6f9c1e43e004\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"1fd9782eb32a0314aefd12f76033b7aa\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/52354392\\/tracks\",\"creation_date\":\"0000-00-00 00:00:00\",\"time_add\":1388455802,\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":757807,\"title\":\"a decouvrir\",\"duration\":636,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":5,\"nb_tracks\":3,\"fans\":8,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/757807\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/757807\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/0a72fa334ad5b0e8bc9ca30aed4d4240\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/0a72fa334ad5b0e8bc9ca30aed4d4240\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/0a72fa334ad5b0e8bc9ca30aed4d4240\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"77fefec04ee16c64212528341a0d3147\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/757807\\/tracks\",\"creation_date\":\"0000-00-00 00:00:00\",\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":60934426,\"title\":\"A decouvrir!\",\"duration\":220,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":0,\"nb_tracks\":1,\"fans\":1,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/60934426\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/60934426\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/playlist\\/ff5ad18a07556f8090182c5fe898e3fd\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/playlist\\/ff5ad18a07556f8090182c5fe898e3fd\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/playlist\\/ff5ad18a07556f8090182c5fe898e3fd\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"64e43b870ec23fabdc168be4190ee40f\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/60934426\\/tracks\",\"creation_date\":\"0000-00-00 00:00:00\",\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":1163208791,\"title\":\"A Ecouter\",\"duration\":3269,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":0,\"nb_tracks\":12,\"fans\":0,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/1163208791\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/1163208791\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/05824ccb680834aa30f1940e91327dfd-a50e935bbcf83ef3cbb7ab9eabcd69ba-e93a7b83dd069b3f79de199bffdcb75b-d50ad68c7b1fd18882f4e85f0aadc7b9\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/05824ccb680834aa30f1940e91327dfd-a50e935bbcf83ef3cbb7ab9eabcd69ba-e93a7b83dd069b3f79de199bffdcb75b-d50ad68c7b1fd18882f4e85f0aadc7b9\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/05824ccb680834aa30f1940e91327dfd-a50e935bbcf83ef3cbb7ab9eabcd69ba-e93a7b83dd069b3f79de199bffdcb75b-d50ad68c7b1fd18882f4e85f0aadc7b9\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"f249c37735f27318c6fa20050e31e047\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/1163208791\\/tracks\",\"creation_date\":\"2015-02-26 19:34:04\",\"time_add\":1425061825,\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":7068135,\"title\":\"A ecouter\",\"duration\":591,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":5,\"nb_tracks\":2,\"fans\":4,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/7068135\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/7068135\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/739639eecef303491bd17f520a1d5e61\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/739639eecef303491bd17f520a1d5e61\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/739639eecef303491bd17f520a1d5e61\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"ac96d988a7e1e8b9c0d8c6ec0fd2f085\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/7068135\\/tracks\",\"creation_date\":\"0000-00-00 00:00:00\",\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":984435191,\"title\":\"Alex Croiseaux - TOP TRACK\",\"duration\":23531,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":0,\"nb_tracks\":97,\"fans\":0,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/984435191\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/984435191\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/3c54f8ba898634fd607338081c91daf1-17bbedbd2485295e5d66c0ab94e8136f-aea2762cde366070009b38a39a1b7426-06798142667e0213f9921bc1886992a1\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/3c54f8ba898634fd607338081c91daf1-17bbedbd2485295e5d66c0ab94e8136f-aea2762cde366070009b38a39a1b7426-06798142667e0213f9921bc1886992a1\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/3c54f8ba898634fd607338081c91daf1-17bbedbd2485295e5d66c0ab94e8136f-aea2762cde366070009b38a39a1b7426-06798142667e0213f9921bc1886992a1\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"e03b57a18a261283b001922beea14122\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/984435191\\/tracks\",\"creation_date\":\"2014-09-13 13:15:03\",\"time_add\":1410614127,\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":38559351,\"title\":\"All Good\",\"duration\":13027,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":0,\"nb_tracks\":58,\"fans\":8,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/38559351\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/38559351\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/5646492f1aec0168e52814d27d2d9a67-5d52028c2f550e1265335ea6cb5e37ff-739639eecef303491bd17f520a1d5e61-3a7920aa3e6656d6e292b3ab9ebb9ffe\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/5646492f1aec0168e52814d27d2d9a67-5d52028c2f550e1265335ea6cb5e37ff-739639eecef303491bd17f520a1d5e61-3a7920aa3e6656d6e292b3ab9ebb9ffe\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/5646492f1aec0168e52814d27d2d9a67-5d52028c2f550e1265335ea6cb5e37ff-739639eecef303491bd17f520a1d5e61-3a7920aa3e6656d6e292b3ab9ebb9ffe\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"2832a680822e6e85ebde29d2af0cb2c9\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/38559351\\/tracks\",\"creation_date\":\"0000-00-00 00:00:00\",\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":51724984,\"title\":\"All Good - 2\",\"duration\":1585,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":4,\"nb_tracks\":8,\"fans\":2,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/51724984\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/51724984\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/4d18ab73d45617eddcb936ccd0e8c2cc-54cdba395f35eaffda0a87b7a36d6ba4-193e711e6c403120f2848bd33cd23f21-37acd6281e025ef26debc837de52dc17\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/4d18ab73d45617eddcb936ccd0e8c2cc-54cdba395f35eaffda0a87b7a36d6ba4-193e711e6c403120f2848bd33cd23f21-37acd6281e025ef26debc837de52dc17\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/4d18ab73d45617eddcb936ccd0e8c2cc-54cdba395f35eaffda0a87b7a36d6ba4-193e711e6c403120f2848bd33cd23f21-37acd6281e025ef26debc837de52dc17\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"4a390a9327b4733982be3076ca791886\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/51724984\\/tracks\",\"creation_date\":\"0000-00-00 00:00:00\",\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":799155301,\"title\":\"Annif 2014\",\"duration\":23747,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":0,\"nb_tracks\":100,\"fans\":3,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/799155301\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/799155301\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/e3044b30d6303f41a7602566df8313a2-f296c6e47146090a6599d03cb48c017d-5bde88b05d8ab5f521952617cd35ead8-78c29902fe76da239d678c4bfed40464\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/e3044b30d6303f41a7602566df8313a2-f296c6e47146090a6599d03cb48c017d-5bde88b05d8ab5f521952617cd35ead8-78c29902fe76da239d678c4bfed40464\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/e3044b30d6303f41a7602566df8313a2-f296c6e47146090a6599d03cb48c017d-5bde88b05d8ab5f521952617cd35ead8-78c29902fe76da239d678c4bfed40464\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"9a0008bf6132de42822c9dd83d3d3ae6\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/799155301\\/tracks\",\"creation_date\":\"2014-03-01 20:39:00\",\"time_add\":1393706341,\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":4341978,\"title\":\"Archive\",\"duration\":56977,\"public\":true,\"is_loved_track\":false,\"collaborative\":true,\"rating\":2,\"nb_tracks\":251,\"fans\":4,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/4341978\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/4341978\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/913bda16f1f59968ff9be47f4f27253c-6dc2fe89c8cb9945dd52f94eadb751aa-5239f56718e2031a2c10f085cde1b130-fd2527ef88277b4ae179da6cdbb57c2d\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/913bda16f1f59968ff9be47f4f27253c-6dc2fe89c8cb9945dd52f94eadb751aa-5239f56718e2031a2c10f085cde1b130-fd2527ef88277b4ae179da6cdbb57c2d\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/913bda16f1f59968ff9be47f4f27253c-6dc2fe89c8cb9945dd52f94eadb751aa-5239f56718e2031a2c10f085cde1b130-fd2527ef88277b4ae179da6cdbb57c2d\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"5f60b5e70acb4c96f9c1d4ab9c920a24\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/4341978\\/tracks\",\"creation_date\":\"0000-00-00 00:00:00\",\"time_add\":1428422258,\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":30595446,\"title\":\"Best Playlist EVER !!\",\"duration\":38555,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":0,\"nb_tracks\":175,\"fans\":418,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/30595446\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/30595446\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/1e6f6130ca0ccbdd0cde4dc2b05e6df9-bb48c0adecc8b5e2e91d25d2d2e9abec-dfb035455e0b19765b7cce24c5a7577c-94e70bf1e28b98cd6dcc97aa881b4072\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/1e6f6130ca0ccbdd0cde4dc2b05e6df9-bb48c0adecc8b5e2e91d25d2d2e9abec-dfb035455e0b19765b7cce24c5a7577c-94e70bf1e28b98cd6dcc97aa881b4072\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/1e6f6130ca0ccbdd0cde4dc2b05e6df9-bb48c0adecc8b5e2e91d25d2d2e9abec-dfb035455e0b19765b7cce24c5a7577c-94e70bf1e28b98cd6dcc97aa881b4072\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"ed4c9984be3db94020b25f6c34cb2213\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/30595446\\/tracks\",\"creation_date\":\"0000-00-00 00:00:00\",\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":33136192,\"title\":\"BOULOT\",\"duration\":335,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":0,\"nb_tracks\":2,\"fans\":0,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/33136192\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/33136192\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/84006cd363cbc168061484a3a2d546ef\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/84006cd363cbc168061484a3a2d546ef\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/84006cd363cbc168061484a3a2d546ef\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"f83467e739cdcc7b623bcc35f2b7925e\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/33136192\\/tracks\",\"creation_date\":\"0000-00-00 00:00:00\",\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":55027024,\"title\":\"Commit Suicide when you Listen To\",\"duration\":2639,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":0,\"nb_tracks\":9,\"fans\":0,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/55027024\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/55027024\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/22db0558c07250365900761e16bf92c4\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/22db0558c07250365900761e16bf92c4\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/22db0558c07250365900761e16bf92c4\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"aa8497aa7483eaf65e0b5e70470fafbb\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/55027024\\/tracks\",\"creation_date\":\"0000-00-00 00:00:00\",\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":791327901,\"title\":\"daft punk - get Lucky.mp3\",\"duration\":248,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":0,\"nb_tracks\":1,\"fans\":0,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/791327901\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/791327901\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/bc49adb87758e0c8c4e508a9c5cce85d\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/bc49adb87758e0c8c4e508a9c5cce85d\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/bc49adb87758e0c8c4e508a9c5cce85d\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"8c069d3b6a73ecd0dd238da32dc0c444\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/791327901\\/tracks\",\"creation_date\":\"2014-02-21 10:46:57\",\"time_add\":1392979617,\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"},{\"id\":374755225,\"title\":\"DaftPunk-RAM\",\"duration\":4464,\"public\":true,\"is_loved_track\":false,\"collaborative\":false,\"rating\":0,\"nb_tracks\":13,\"fans\":0,\"link\":\"http:\\/\\/www.deezer.com\\/playlist\\/374755225\",\"picture\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/374755225\\/image\",\"picture_small\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/b298094528702627877720d0be4448b5\\/56x56-000000-80-0-0.jpg\",\"picture_medium\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/b298094528702627877720d0be4448b5\\/250x250-000000-80-0-0.jpg\",\"picture_big\":\"http:\\/\\/cdn-images.deezer.com\\/images\\/cover\\/b298094528702627877720d0be4448b5\\/500x500-000000-80-0-0.jpg\",\"checksum\":\"9d9e70f1341dc4f78b0ebacbc00050e8\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/playlist\\/374755225\\/tracks\",\"creation_date\":\"0000-00-00 00:00:00\",\"creator\":{\"id\":2529,\"name\":\"dadbond\",\"tracklist\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/flow\",\"type\":\"user\"},\"type\":\"playlist\"}],\"checksum\":\"2e9163a88bf343d8a628be6acabb84a948ff08e743dda65eb4073bcdfd1914ca\",\"total\":113,\"next\":\"http:\\/\\/api.deezer.com\\/2.0\\/user\\/2529\\/playlists?index=25\"}";

}