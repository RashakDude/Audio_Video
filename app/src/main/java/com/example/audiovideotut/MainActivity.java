package com.example.audiovideotut;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;
    MediaPlayer mediaPlayer;

    public void play(View view) {
        videoView.start();
        mediaPlayer.start();
    }

    public void pause(View view) {
        videoView.pause();
        mediaPlayer.pause();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.videoplayback);
        mediaPlayer = MediaPlayer.create(this,R.raw.music);
    }
}