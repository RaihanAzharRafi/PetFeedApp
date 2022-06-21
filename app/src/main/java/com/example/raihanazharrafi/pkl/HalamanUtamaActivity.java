package com.example.raihanazharrafi.pkl;



import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class HalamanUtamaActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
                if (item.getItemId() == R.id.action_list) {
                    startActivity(new Intent(HalamanUtamaActivity.this, ContactActivity.class));
                    return true;
                }
                return super.onOptionsItemSelected(item);
        }


    public void pindah(View view) {
        Intent intent = new Intent(HalamanUtamaActivity.this, HalamanUtamaKucing.class);
        startActivity(intent);
    }

    public void pindah2(View view) {
        Intent intent = new Intent(HalamanUtamaActivity.this, HalamanUtamaAnjing.class);
        startActivity(intent);
    }

    public void pindah3(View view) {
        Intent intent = new Intent(HalamanUtamaActivity.this, InformasiAnjingActivity.class);
        startActivity(intent);
    }
}







