package com.bridgeismute;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.media.AudioManager;
import com.facebook.react.bridge.ReactApplicationContext;

@SuppressLint("ValidFragment")
public class AndroidMuteCtrl  extends Fragment{
    private ReactApplicationContext myContext;
    public  AndroidMuteCtrl(ReactApplicationContext context) {
        myContext = context;
    }
    public boolean isMuted(){
        AudioManager audio = (AudioManager) myContext.getSystemService(myContext.AUDIO_SERVICE);
        if (audio.getRingerMode() ==  AudioManager.RINGER_MODE_NORMAL) return false;
        else return true;
    }
}
