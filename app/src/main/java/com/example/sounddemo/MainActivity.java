package com.example.sounddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.*;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.media.AudioManager;

public class MainActivity extends AppCompatActivity {

    MediaPlayer Mplayer;
    AudioManager audioManager;

    public void playAudio(View view){


        Mplayer.start();

    }

    public void pauseAudio(View view){

        Mplayer.pause();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mplayer = MediaPlayer.create(this,R.raw.tobeinlovemisia);

        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);

        int maxVolume = audioManager.getStreamMaxVolume(audioManager.STREAM_MUSIC);
        int curVolume = audioManager.getStreamVolume(audioManager.STREAM_MUSIC);


        SeekBar volumeControl = (SeekBar)findViewById(R.id.seekBar);
        volumeControl.setMax(maxVolume);
        volumeControl.setProgress(curVolume);

        volumeControl.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

              audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,progress,0);
            }


    });

    }

}
