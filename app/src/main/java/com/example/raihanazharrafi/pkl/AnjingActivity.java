package com.example.raihanazharrafi.pkl;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class AnjingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anjing);

        Button btnNotif = (Button) findViewById(R.id.btn_monitor);

        btnNotif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notificationcall();
            }
        });

    }

    public void notificationcall() {
        NotificationCompat.Builder notificatiolnBuider = (NotificationCompat.Builder) new NotificationCompat.Builder(this)
                .setDefaults(NotificationCompat.DEFAULT_ALL)
                .setSmallIcon(R.drawable.coklat)
                .setContentTitle("Pet Feed")
                .setContentText("Mulai Sekarang Anjing Kamu Kami Monitoring");

        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(1, notificatiolnBuider.build());
    }
}
