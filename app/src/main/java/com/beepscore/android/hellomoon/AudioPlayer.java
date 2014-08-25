package com.beepscore.android.hellomoon;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by stevebaker on 8/24/14.
 */
public class AudioPlayer {
     private MediaPlayer mPlayer;

    public void stop() {
        if (mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }
    }

    public void play(Context c) {
        mPlayer = MediaPlayer.create(c, R.raw.one_small_step);
        mPlayer.start();
    }
}
