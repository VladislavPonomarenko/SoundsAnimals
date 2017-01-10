package com.example.scarlet.song;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;
// ДАНИЙ КЛАС схожий до класа QuizActivity, так що думаю нема сенсу його коментувати
//тут лише добавлено ще один ImageButton, функціонал такий самий, і при досягнені лічильника числа 10
// здійснюється перехід до Home_Activity.class
public class QuizActivity1 extends AppCompatActivity {
    private ImageButton imageButton01;
    private ImageButton imageButton02;
    private ImageButton imageButton03;
    private Button yellowButton;


    SoundPool sp;
    int elephant, monkey, horse, frog,tiger,cat,lion,pig,cow,chicken,dog,sheep;
    int c = 1, cnt = 0, number, over = 0, pix,com;
    int right, wrong,win,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);



        imageButton01 = (ImageButton) findViewById(R.id.buttonImage01);
        imageButton02 = (ImageButton) findViewById(R.id.buttonImage02);
        imageButton03 = (ImageButton) findViewById(R.id.buttonImage03);


        sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);

        tiger = sp.load(this, R.raw.tiger_1, 1);
        monkey = sp.load(this, R.raw.monkey_1, 1);
        horse = sp.load(this, R.raw.horse_1, 1);
        frog = sp.load(this, R.raw.frog_1, 1);
        elephant = sp.load(this, R.raw.elephant_1, 1);
        cat = sp.load(this, R.raw.cat_1, 1);
        lion = sp.load(this, R.raw.lion_1, 1);
        pig = sp.load(this, R.raw.pig_1, 1);
        cow = sp.load(this, R.raw.cow_1, 1);
        chicken = sp.load(this, R.raw.chicken_1, 1);
        dog = sp.load(this, R.raw.dog_1, 1);
        sheep = sp.load(this, R.raw.sheep_1, 1);

        right = sp.load(this, R.raw.right, 1);
        wrong = sp.load(this, R.raw.wrong, 1);
        win = sp.load(this, R.raw.saxophonia, 1);


        yellowButton = (Button) findViewById(R.id.buttonYellow);


    }


    public void onButtonClick1(View view) {

        int min = 1, max = 12;
        Random random = new Random();
        number = random.nextInt(max - min + 1) + min;
        over = number;
        com=pix-1;
        if ((com != over)&&(pix!=over)) {

            c = number;
            yellowButton.setText("Далі");
            switch (c) {
                case 1:
                    imageButton01.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton02.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton03.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton01.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_02_big_size_150x150));
                    imageButton02.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_03_big_size_150x150));
                    imageButton03.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_08_big_size_150x150));
                    sp.play(sheep, 1, 1, 0, 0, 1);
                    imageButton01.setClickable(true);
                    imageButton02.setClickable(true);
                    imageButton03.setClickable(true);
                    break;

                case 2:
                    imageButton01.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton02.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton03.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton01.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_04_big_size_150x150));
                    imageButton02.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_10_big_size_150x150));
                    imageButton03.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_07_big_size_150x150));
                    sp.play(chicken, 1, 1, 0, 0, 1);
                    imageButton01.setClickable(true);
                    imageButton02.setClickable(true);
                    imageButton03.setClickable(true);
                    break;

                case 3:
                    imageButton01.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton02.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton03.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton01.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_05_big_size_150x150));
                    imageButton02.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_09_big_size_150x150));
                    imageButton03.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_11_big_size_150x150));
                    sp.play(cow, 1, 1, 0, 0, 1);
                    imageButton01.setClickable(true);
                    imageButton02.setClickable(true);
                    imageButton03.setClickable(true);
                    break;

                case 4:
                    imageButton01.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton02.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton03.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton01.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_06_big_size_150x150));
                    imageButton02.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_12_big_size_150x150));
                    imageButton03.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_08_big_size_150x150));
                    sp.play(lion, 1, 1, 0, 0, 1);
                    imageButton01.setClickable(true);
                    imageButton02.setClickable(true);
                    imageButton03.setClickable(true);
                    break;
                case 5:
                    imageButton01.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton02.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton03.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton01.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_05_big_size_150x150));
                    imageButton02.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_07_big_size_150x150));
                    imageButton03.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_01_big_size_150x150));
                    sp.play(pig, 1, 1, 0, 0, 1);
                    imageButton01.setClickable(true);
                    imageButton02.setClickable(true);
                    imageButton03.setClickable(true);
                    break;
                case 6:
                    imageButton01.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton02.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton03.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton01.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_02_big_size_150x150));
                    imageButton02.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_10_big_size_150x150));
                    imageButton03.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_09_big_size_150x150));
                    sp.play(monkey, 1, 1, 0, 0, 1);
                    imageButton01.setClickable(true);
                    imageButton02.setClickable(true);
                    imageButton03.setClickable(true);
                    break;
                case 7:
                    imageButton01.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton02.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton03.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton01.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_07_big_size_150x150));
                    imageButton02.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_04_big_size_150x150));
                    imageButton03.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_08_big_size_150x150));
                    sp.play(frog, 1, 1, 0, 0, 1);
                    imageButton01.setClickable(true);
                    imageButton02.setClickable(true);
                    imageButton03.setClickable(true);
                    break;
                case 8:
                    imageButton01.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton02.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton03.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton01.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_12_big_size_150x150));
                    imageButton02.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_11_big_size_150x150));
                    imageButton03.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_07_big_size_150x150));
                    sp.play(cat, 1, 1, 0, 0, 1);
                    imageButton01.setClickable(true);
                    imageButton02.setClickable(true);
                    imageButton03.setClickable(true);
                    break;
                case 9:
                    imageButton01.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton02.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton03.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton01.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_04_big_size_150x150));
                    imageButton02.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_01_big_size_150x150));
                    imageButton03.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_10_big_size_150x150));
                    sp.play(tiger, 1, 1, 0, 0, 1);
                    imageButton01.setClickable(true);
                    imageButton02.setClickable(true);
                    imageButton03.setClickable(true);
                    break;
                case 10:
                    imageButton01.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton02.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton03.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton01.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_05_big_size_150x150));
                    imageButton02.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_06_big_size_150x150));
                    imageButton03.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_02_big_size_150x150));
                    sp.play(horse, 1, 1, 0, 0, 1);
                    imageButton01.setClickable(true);
                    imageButton02.setClickable(true);
                    imageButton03.setClickable(true);
                    break;
                case 11:
                    imageButton01.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton02.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton03.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton01.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_03_big_size_150x150));
                    imageButton02.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_07_big_size_150x150));
                    imageButton03.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_12_big_size_150x150));
                    sp.play(elephant, 1, 1, 0, 0, 1);
                    imageButton01.setClickable(true);
                    imageButton02.setClickable(true);
                    imageButton03.setClickable(true);
                    break;
                case 12:
                    imageButton01.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton02.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton03.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton01.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_03_big_size_150x150));
                    imageButton02.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_06_big_size_150x150));
                    imageButton03.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_09_big_size_150x150));
                    sp.play(dog, 1, 1, 0, 0, 1);
                    imageButton01.setClickable(true);
                    imageButton02.setClickable(true);
                    imageButton03.setClickable(true);
                    break;

                default:
                    break;
            }
        }else if((pix==number)&&(number>=12)){number=number-1;}
        else if((pix==number)&&(number<=1)){number=number+1;}
        else if((pix!=number)&&(number<=1)&&(number>=12)){number=number+1;}
        else number=number-1;
        pix = number;
        if (cnt == 10) {
            sp.play(win, 1, 1, 1, 0, 1);
            setContentView(R.layout.content_win);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent i = new Intent(QuizActivity1.this,Home_Activity.class);
                    startActivity(i);
                    finish();
                }
            }, 7*1000);
            sp.stop(stop);
            startService(new Intent(this, Sound.class));

        }

    }
    @Override
    public void onBackPressed() {
        startService(new Intent(this, Sound.class));
        setContentView(R.layout.activity_home_);
        super.onBackPressed();

    }

    public void onClickImBtn01(View view) {
        switch (c) {
            case 1:
                imageButton01.setBackgroundColor(Color.RED);
                imageButton02.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;

            case 2:
                imageButton01.setBackgroundColor(Color.RED);
                imageButton02.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;

            case 3:
                imageButton01.setBackgroundColor(Color.RED);
                imageButton02.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;

            case 4:
                imageButton01.setBackgroundColor(Color.RED);
                imageButton02.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;

            case 5:
                imageButton01.setBackgroundColor(Color.GREEN);
                imageButton02.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;

            case 6:
                imageButton01.setBackgroundColor(Color.GREEN);
                imageButton02.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;

            case 7:
                imageButton01.setBackgroundColor(Color.RED);
                imageButton02.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;

            case 8:
                imageButton01.setBackgroundColor(Color.RED);
                imageButton02.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;
            case 9:
                imageButton01.setBackgroundColor(Color.RED);
                imageButton02.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;
            case 10:
                imageButton01.setBackgroundColor(Color.RED);
                imageButton02.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;
            case 11:
                imageButton01.setBackgroundColor(Color.GREEN);
                imageButton02.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;
            case 12:
                imageButton01.setBackgroundColor(Color.RED);
                imageButton02.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;
            default:
                break;
        }

    }

    public void onClickImBtn02(View view) {

        switch (c) {
            case 1:
                imageButton02.setBackgroundColor(Color.RED);
                imageButton01.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;

            case 2:
                imageButton02.setBackgroundColor(Color.GREEN);
                imageButton01.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;

            case 3:
                imageButton02.setBackgroundColor(Color.RED);
                imageButton01.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;

            case 4:
                imageButton02.setBackgroundColor(Color.GREEN);
                imageButton01.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;

            case 5:
                imageButton02.setBackgroundColor(Color.RED);
                imageButton01.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;
            case 6:
                imageButton02.setBackgroundColor(Color.RED);
                imageButton01.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;
            case 7:
                imageButton02.setBackgroundColor(Color.GREEN);
                imageButton01.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;
            case 8:
                imageButton02.setBackgroundColor(Color.RED);
                imageButton01.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;
            case 9:
                imageButton02.setBackgroundColor(Color.GREEN);
                imageButton01.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;
            case 10:
                imageButton02.setBackgroundColor(Color.GREEN);
                imageButton01.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;
            case 11:
                imageButton02.setBackgroundColor(Color.RED);
                imageButton01.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;
            case 12:
                imageButton02.setBackgroundColor(Color.RED);
                imageButton01.setClickable(false);
                imageButton03.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;
            default:
                break;
        }

    }
    public void onClickImBtn03(View view) {

        switch (c) {
            case 1:
                imageButton03.setBackgroundColor(Color.GREEN);
                imageButton02.setClickable(false);
                imageButton01.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;

            case 2:
                imageButton03.setBackgroundColor(Color.RED);
                imageButton02.setClickable(false);
                imageButton01.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;
            case 3:
                imageButton03.setBackgroundColor(Color.GREEN);
                imageButton02.setClickable(false);
                imageButton01.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;
            case 4:
                imageButton03.setBackgroundColor(Color.RED);
                imageButton02.setClickable(false);
                imageButton01.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;
            case 5:
                imageButton03.setBackgroundColor(Color.RED);
                imageButton02.setClickable(false);
                imageButton01.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                break;
            case 6:
                imageButton03.setBackgroundColor(Color.RED);
                imageButton02.setClickable(false);
                imageButton01.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;
            case 7:
                imageButton03.setBackgroundColor(Color.RED);
                imageButton02.setClickable(false);
                imageButton01.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                break;
            case 8:
                imageButton03.setBackgroundColor(Color.GREEN);
                imageButton02.setClickable(false);
                imageButton01.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;
            case 9:
                imageButton03.setBackgroundColor(Color.RED);
                imageButton02.setClickable(false);
                imageButton01.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;
            case 10:
                imageButton03.setBackgroundColor(Color.RED);
                imageButton02.setClickable(false);
                imageButton01.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;
            case 11:
                imageButton03.setBackgroundColor(Color.RED);
                imageButton02.setClickable(false);
                imageButton01.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt=0;
                break;
            case 12:
                imageButton03.setBackgroundColor(Color.GREEN);
                imageButton02.setClickable(false);
                imageButton01.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;
        }
    }
}
