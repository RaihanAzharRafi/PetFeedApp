package com.example.raihanazharrafi.pkl;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class HalamanUtamaAnjing extends AppCompatActivity implements View.OnClickListener {
    private Button btnJantan;
    private Button btnBetina;
    RelativeLayout huAnjing;
    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama_anjing);


        huAnjing = (RelativeLayout)findViewById(R.id.hu_anjing);
        btnJantan = (Button)findViewById(R.id.btn_jantan);
        btnJantan.setOnClickListener(this);
        btnBetina = (Button)findViewById(R.id.btn_betina);
        btnBetina.setOnClickListener(this);

        animationDrawable = (AnimationDrawable) huAnjing.getBackground();
        animationDrawable.setEnterFadeDuration(10);
        animationDrawable.setExitFadeDuration(4500);
        animationDrawable.start();
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_jantan:
                Intent jantanIntent = new Intent(HalamanUtamaAnjing.this, AnjingActivity.class);
                startActivity(jantanIntent);
                break;

            case R.id.btn_betina:
                Intent betinaIntent = new Intent(HalamanUtamaAnjing.this, Anjing2Activity.class);
                startActivity(betinaIntent);
                break;
        }
    }
}
