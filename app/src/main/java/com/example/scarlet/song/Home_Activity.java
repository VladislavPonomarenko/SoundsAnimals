package com.example.scarlet.song;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Home_Activity extends AppCompatActivity implements View.OnClickListener { //підключаємо слухача

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);

        startService(new Intent(this, Sound.class));//запуск фонової музики


        ImageView imageView0 = (ImageView) findViewById(R.id.ImageBottom0);//пошук View елементів
        ImageView imageView1 = (ImageView) findViewById(R.id.ImageBottom1);
        imageView0.setOnClickListener(this);//задання елементам клікабельності
        imageView1.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) { //перевизначення метода
        switch (view.getId()) { //передавання id елемента і виклик відповідного класа
            case R.id.ImageBottom0:
                Intent intent = new Intent(this, TabsActivity.class);
                startActivity(intent);
                break;
            case R.id.ImageBottom1:
                Intent i = new Intent(this, QuizActivity.class);
                startActivity(i);
                break;
            default:
                break;

        }
    }

    @Override
    public void onBackPressed() { //при натисненні на клавішу BackPressed
        stopService(new Intent(this, Sound.class));//зупиняємо фонову музику та завуершуємо роботу додатка
        super.onBackPressed();

    }


}
