package com.example.scarlet.song;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Scarlet on 07.01.2017.
 */

public class Sound extends Service {
    @Nullable
    @Override //перевизначення метода для Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    MediaPlayer player;// підключення та ініціалізація MediaPlayer

    @Override
    public void onCreate() {

        player = MediaPlayer.create(this, R.raw.sound_nature);//створення(загрузка) мелодії
        player.setLooping(true);// зациклення мелодії
    }

    @Override
    public void onStart(Intent intent, int startid) {
        player.start();
    }//запуск MediaPlayer

    @Override
    public void onDestroy() { //зупинка MediaPlayer
        player.release();
        player = null;
        super.onDestroy();

    }

}
