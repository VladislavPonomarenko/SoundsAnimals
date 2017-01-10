package com.example.scarlet.song;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash); //підключення Splash Screen

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //затримка для Splash Screen на 4 секунди
                Intent i = new Intent(MainActivity.this, Home_Activity.class);// відкриття за допомогою Intent Home_Activity
                startActivity(i);//запуск Home_Activity
                finish();//закінчення роботи
            }
        }, 4 * 1000);

    }
}
