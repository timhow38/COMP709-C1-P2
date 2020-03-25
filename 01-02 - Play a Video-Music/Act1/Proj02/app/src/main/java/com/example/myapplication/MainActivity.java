package com.example.myapplication;
/** Description: Pass Variables*/

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/** ImportLib {@Button,@Intent,@View,@EditText}. */
import android.widget.MediaController;
import android.widget.VideoView;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.video_view);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
    }
}