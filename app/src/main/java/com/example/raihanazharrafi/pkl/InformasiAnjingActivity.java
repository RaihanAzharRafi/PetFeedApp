package com.example.raihanazharrafi.pkl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformasiAnjingActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi_anjing);

        btnNext = (Button) findViewById(R.id.btn_next);
        btnNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btn_next:
                Intent btnNext = new Intent(InformasiAnjingActivity.this, InformasiKucingActivity.class);
                startActivity(btnNext);
                break;
        }
    }
}
