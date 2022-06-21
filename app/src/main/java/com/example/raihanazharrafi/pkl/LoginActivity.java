package com.example.raihanazharrafi.pkl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = (Button) findViewById(R.id.btn_Login);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_Login:
                Intent loginIntent = new Intent(LoginActivity.this, HalamanUtamaActivity.class);
                Toast.makeText(getApplicationContext(), "Hai Rafi", Toast.LENGTH_LONG).show();
                startActivity(loginIntent);
                break;
        }
    }
}
