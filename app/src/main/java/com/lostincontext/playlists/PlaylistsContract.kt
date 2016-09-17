package com.lostincontext.playlists

import com.lostincontext.commons.BasePresenter
import com.lostincontext.commons.BaseView
import com.lostincontext.commons.list.EmptyListCallback
import com.lostincontext.data.playlist.Playlist


object PlaylistsContract {


    const val EXTRA_PLAYLIST = "playlist"

    const val EXTRA_USER_ID = "user"
    const val NO_USER = 0L

    interface View : BaseView<PlaylistsContract.Presenter> {

        fun setPlaylists(playlists: List<Playlist>)

        fun openDeezerFor(playlist: Playlist)

        fun returnResult(playlist: Playlist)
    }

    interface Presenter : BasePresenter, EmptyListCallback, PlaylistViewHolder.Callback {

        override fun start()

    }
}
