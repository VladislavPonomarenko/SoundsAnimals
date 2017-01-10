package com.example.scarlet.song;


import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class QuizActivity extends AppCompatActivity {
    private ImageButton imageButton0;
    private ImageButton imageButton1;
    private Button buttonClick_quiz;


    SoundPool sp;
    //додаємо змінні
    int elephant, monkey, horse, frog, tiger, cat, lion, pig, cow, chicken, dog, sheep;
    int c = 1, cnt = 0, number, over = 0, pix, com;
    int right, wrong, win, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        stopService(new Intent(this, Sound.class));

        //пошук View елементів
        imageButton0 = (ImageButton) findViewById(R.id.buttonIm0);
        imageButton1 = (ImageButton) findViewById(R.id.buttonIm1);
        buttonClick_quiz = (Button) findViewById(R.id.buttonClick_quiz);
        // створення  SoundPool та перечада даних
        sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);

        // завантаження файлів зі звуками
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
        // завантаження файлів для правильних, не правильних відповідей
        right = sp.load(this, R.raw.right, 1);
        wrong = sp.load(this, R.raw.wrong, 1);
        win = sp.load(this, R.raw.saxophonia, 1);//і фонової мелодії





    }


    public void onButtonClick01(View view) {
        // запук функції рандома
        int min = 1, max = 12;
        Random random = new Random();
        number = random.nextInt(max - min + 1) + min;
        over = number;

        if (pix != over)  {// перевірка чи являється згенероване число таке ж як і попереднє
                                                                //         ПОПЕРЕДЖЕННЯ
            c = number;                                     //   Далі іде повторювання коду так як я, покищо,
            //передає для кнопки текст "Далі"               // не знаю як це зробити компактніше.
            buttonClick_quiz.setText("Далі");
            //далі іде вибір зображень
            switch (c) {
                case 1:
                    imageButton0.setBackgroundColor(getResources().getColor(R.color.orange));//установлює оранжевий колір для фонів ImageButton
                    imageButton1.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton0.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_01_big_size_150x150));
                    imageButton1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_03_big_size_150x150));
                    sp.play(tiger, 1, 1, 0, 0, 1); //програє звук              ↑↑↑ Завантаження зображень, імена не встиг пообрізати↑↑↑
                    imageButton0.setClickable(true);//назначаємо кнопкам клікабельность
                    imageButton1.setClickable(true);
                    break;
                case 2:
                    imageButton0.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton1.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton0.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_05_big_size_150x150));
                    imageButton1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_02_big_size_150x150));
                    sp.play(monkey, 1, 1, 0, 0, 1);
                    imageButton0.setClickable(true);
                    imageButton1.setClickable(true);
                    break;
                case 3:
                    imageButton0.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton1.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton0.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_06_big_size_150x150));
                    imageButton1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_09_big_size_150x150));
                    sp.play(horse, 1, 1, 0, 0, 1);
                    imageButton0.setClickable(true);
                    imageButton1.setClickable(true);
                    break;
                case 4:
                    imageButton0.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton1.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton0.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_04_big_size_150x150));
                    imageButton1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_08_big_size_150x150));
                    sp.play(frog, 1, 1, 0, 0, 1);
                    imageButton0.setClickable(true);
                    imageButton1.setClickable(true);
                    break;
                case 5:
                    imageButton0.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton1.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton0.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_10_big_size_150x150));
                    imageButton1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_03_big_size_150x150));
                    sp.play(elephant, 1, 1, 0, 0, 1);
                    imageButton0.setClickable(true);
                    imageButton1.setClickable(true);
                    break;
                case 6:
                    imageButton0.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton1.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton0.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_12_big_size_150x150));
                    imageButton1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_07_big_size_150x150));
                    sp.play(cat, 1, 1, 0, 0, 1);
                    imageButton0.setClickable(true);
                    imageButton1.setClickable(true);
                    break;
                case 7:
                    imageButton0.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton1.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton0.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_03_big_size_150x150));
                    imageButton1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_08_big_size_150x150));
                    sp.play(sheep, 1, 1, 0, 0, 1);
                    imageButton0.setClickable(true);
                    imageButton1.setClickable(true);
                    break;
                case 8:
                    imageButton0.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton1.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton0.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_11_big_size_150x150));
                    imageButton1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_05_big_size_150x150));
                    sp.play(cow, 1, 1, 0, 0, 1);
                    imageButton0.setClickable(true);
                    imageButton1.setClickable(true);
                    break;
                case 9:
                    imageButton0.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton1.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton0.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_09_big_size_150x150));
                    imageButton1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_04_big_size_150x150));
                    sp.play(dog, 1, 1, 0, 0, 1);
                    imageButton0.setClickable(true);
                    imageButton1.setClickable(true);
                    break;
                case 10:
                    imageButton0.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton1.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton0.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_05_big_size_150x150));
                    imageButton1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_09_big_size_150x150));
                    sp.play(pig, 1, 1, 0, 0, 1);
                    imageButton0.setClickable(true);
                    imageButton1.setClickable(true);
                    break;
                case 11:
                    imageButton0.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton1.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton0.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_03_big_size_150x150));
                    imageButton1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_10_big_size_150x150));
                    sp.play(chicken, 1, 1, 0, 0, 1);
                    imageButton0.setClickable(true);
                    imageButton1.setClickable(true);
                    break;
                case 12:
                    imageButton0.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton1.setBackgroundColor(getResources().getColor(R.color.orange));
                    imageButton0.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_12_big_size_150x150));
                    imageButton1.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.mipmap.animal_icon_05_big_size_150x150));
                    sp.play(lion, 1, 1, 0, 0, 1);
                    imageButton0.setClickable(true);
                    imageButton1.setClickable(true);
                    break;
                default:
                    break;
            }
            //написав такий обробник для рандома, щоб вибиралось кожного разу по різному
        }else if((pix==number)&&(number>=12)){number=number-1;}
        else if((pix==number)&&(number<=1)){number=number+1;}
        else if((pix!=number)&&(number<=1)&&(number>=12)){number=number+1;}
        else number=number-1;
        pix = number;
        if (cnt == 3) { // якщо лічильний = 3
            sp.play(win, 1, 1, 1, 0, 1); //програється мелодія переходу на новий рівень
            setContentView(R.layout.content_win);//завантажує відповідний layout-файл
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {//встановлюємо затримку 7 секунд

                    Intent i = new Intent(QuizActivity.this, QuizActivity1.class);
                    startActivity(i);//та викликаємо наступний клас
                    finish();
                }
            }, 7 * 1000);
            sp.stop(stop);//зупиняємо SoundPool
        }

    }

    @Override
    public void onBackPressed() {// при переході на попередній Layout
        startService(new Intent(this, Sound.class));// знову запускаємо сервіс для програвання фонової мелодії
        setContentView(R.layout.activity_home_);//та переходимо до  Layout activity_home_
        super.onBackPressed();

    }

    public void onClickImBtn0(View view) { //функція клікабельності для першого зображення

        switch (c) {
            case 1:
                imageButton0.setBackgroundColor(Color.GREEN); // встановлення зеленого фону
                imageButton1.setClickable(false); // другий ImageButton становиться не клікабельним
                sp.play(right, 1, 1, 0, 0, 1);//запускаємо звук для правильної відповіді
                cnt++;//у лічильник добавляємо +1
                break;
            case 2:

                imageButton0.setBackgroundColor(Color.RED);// а тут уже встановлення червоного фону
                imageButton1.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);// і звук для неправильного вибора
                cnt = 0;// при цьому обнуляємо лічильник
                break;
            case 3:

                imageButton0.setBackgroundColor(Color.GREEN);
                imageButton1.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;

                break;
            case 4:
                imageButton0.setBackgroundColor(Color.GREEN);
                imageButton1.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;
            case 5:
                imageButton0.setBackgroundColor(Color.RED);
                imageButton1.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt = 0;
                break;
            case 6:
                imageButton0.setBackgroundColor(Color.RED);
                imageButton1.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt = 0;
                break;
            case 7:
                imageButton0.setBackgroundColor(Color.RED);
                imageButton1.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt = 0;
                break;
            case 8:
                imageButton0.setBackgroundColor(Color.GREEN);
                imageButton1.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;
            case 9:
                imageButton0.setBackgroundColor(Color.GREEN);
                imageButton1.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;
            case 10:
                imageButton0.setBackgroundColor(Color.GREEN);
                imageButton1.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;
            case 11:
                imageButton0.setBackgroundColor(Color.RED);
                imageButton1.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt = 0;
                break;
            case 12:
                imageButton0.setBackgroundColor(Color.GREEN);
                imageButton1.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;
            default:
                break;
        }
    }


    public void onClickImBtn1(View view) {


        switch (c) {
            case 1:

                imageButton1.setBackgroundColor(Color.RED);
                imageButton0.setClickable(false);
                cnt = 0;
                sp.play(wrong, 1, 1, 0, 0, 1);
                break;
            case 2:

                imageButton1.setBackgroundColor(Color.GREEN);
                imageButton0.setClickable(false);
                cnt++;
                sp.play(right, 1, 1, 0, 0, 1);
                break;
            case 3:

                imageButton1.setBackgroundColor(Color.RED);
                imageButton0.setClickable(false);
                cnt = 0;
                sp.play(wrong, 1, 1, 0, 0, 1);

                break;
            case 4:
                imageButton1.setBackgroundColor(Color.RED);
                imageButton0.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt = 0;
                break;
            case 5:
                imageButton1.setBackgroundColor(Color.GREEN);
                imageButton0.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;
            case 6:
                imageButton1.setBackgroundColor(Color.GREEN);
                imageButton0.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;
            case 7:
                imageButton1.setBackgroundColor(Color.GREEN);
                imageButton0.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;
            case 8:
                imageButton1.setBackgroundColor(Color.RED);
                imageButton0.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt = 0;
                break;
            case 9:
                imageButton1.setBackgroundColor(Color.RED);
                imageButton0.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt = 0;
                break;
            case 10:
                imageButton1.setBackgroundColor(Color.RED);
                imageButton0.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt = 0;
                break;
            case 11:
                imageButton1.setBackgroundColor(Color.GREEN);
                imageButton0.setClickable(false);
                sp.play(right, 1, 1, 0, 0, 1);
                cnt++;
                break;
            case 12:
                imageButton1.setBackgroundColor(Color.RED);
                imageButton0.setClickable(false);
                sp.play(wrong, 1, 1, 0, 0, 1);
                cnt = 0;
                break;
            default:
                break;
        }


    }
}





