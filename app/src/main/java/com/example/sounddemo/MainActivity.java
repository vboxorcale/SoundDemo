package com.example.sounddemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.*;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public abstract class MainActivity extends AppCompatActivity {

    MediaPlayer Mplayer;

    public void playAudio(View view){
        Mplayer = MediaPlayer.create(this,R.raw.tobeinlovemisia);

        Mplayer.start();

    }

    public void pauseAudio(View view){

        Mplayer.pause();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}
