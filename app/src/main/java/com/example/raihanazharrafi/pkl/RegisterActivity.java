package com.example.raihanazharrafi.pkl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnRegister = (Button)findViewById(R.id.btn_Register);
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_Register:
                Intent registerIntent = new Intent(RegisterActivity.this, HalamanUtamaActivity.class);
                Toast.makeText(getApplicationContext(), "Selamat Datang :)", Toast.LENGTH_LONG).show();
                startActivity(registerIntent);
                break;
        }
    }
}
