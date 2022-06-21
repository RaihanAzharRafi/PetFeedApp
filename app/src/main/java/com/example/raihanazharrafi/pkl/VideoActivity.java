package com.example.raihanazharrafi.pkl;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity implements View.OnClickListener {
    private VideoView videoView;
    private Button btnLogin;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoView = (VideoView)findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.alam_dunia);

        videoView.setVideoURI(uri);
        videoView.start();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);

            }
        });

        btnLogin = (Button)findViewById(R.id.Login);
        btnLogin.setOnClickListener(this);
        btnRegister = (Button)findViewById(R.id.Register);
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.Login:
                Intent loginIntent = new Intent(VideoActivity.this, LoginActivity.class);
                startActivity(loginIntent);
                break;

            case R.id.Register:
                Intent registerIntent = new Intent(VideoActivity.this, RegisterActivity.class);
                startActivity(registerIntent);
                break;

        }
    }
}

