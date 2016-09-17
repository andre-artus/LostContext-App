package com.lostincontext.data.playlist.repo


import android.content.res.Resources
import com.lostincontext.R
import com.lostincontext.data.playlist.Playlist
import com.lostincontext.data.playlist.PlaylistsData
import com.lostincontext.utils.enqueue
import com.squareup.moshi.Moshi
import okio.Okio
import retrofit2.Response
import java.io.InputStream
import javax.inject.Inject

class PlaylistsRepository
@Inject constructor(val playlistsEndPoint: DeezerPlaylistsEndPoint,
                    private val resources: Resources,
                    private val moshi: Moshi) {

    interface Callback {
        fun onPlaylistsLoaded(playlists: List<Playlist>)
        fun onPlaylistsLoadFailed()
    }


    inline fun queryPlaylists(userId: Long,
                              crossinline success: (response: Response<PlaylistsData>) -> Unit,
                              crossinline failure: (t: Throwable) -> Unit) {
        playlistsEndPoint.getUserPlaylists(userId).enqueue(success,
                                                           failure)
    }


    fun getHardcodedPlaylists(callback: PlaylistsRepository.Callback) {
        val data = resources.openRawResource(R.raw.playlists)

        val playlistDataAdapter = moshi.adapter(PlaylistsData::class.java)

        val deezerData = playlistDataAdapter.fromJson(data.toBufferedSource())


        callback.onPlaylistsLoaded(deezerData.playlists)
    }

    private fun InputStream.toBufferedSource() = Okio.buffer(Okio.source(this))
}
      