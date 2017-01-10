package com.example.scarlet.song;


import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.TabHost;

public class TabsActivity extends ActionBarActivity { //підключення  ActionBarActivity для Tabs
    TabHost.TabSpec tabSpec;// створення корінного елемента
    SoundPool sp;

    int elephant0, elephant1, monkey0, monkey_1, lion0, lion1, frog0, frog1, cat0, cat1;
    int tiger0, tiger1, chicken0, chicken1, cow0, cow1, dog0, dog1, pig0, pig1, sheep0, sheep1, horse0, horse1;
    int policeCar, ambulance, fire_engine, rocket, airplane, helicopter, train, car, motorcycle, bus, bicycle, ship;
    int cnt0 = 0, cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0, cnt5 = 0, cnt6 = 0, cnt7 = 0, cnt8 = 0, cnt9 = 0, cnt10 = 0, cnt11 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        stopService(new Intent(this, Sound.class));//зупиняємо сервіс для програвання фонової мелодії,
        // тому що звуки тварин не будуть добре гармонізувати з фоновою мелодією
        sp = new SoundPool(1, AudioManager.STREAM_MUSIC, 0); // створення  SoundPool та перечада даних
        //максимальна к-сть одночасно відтворюваних файлів, аудіо потік який буде відтворюватися, параметр якості

        tiger0 = sp.load(this, R.raw.tiger_1, 1);// завантаження файлів
        tiger1 = sp.load(this, R.raw.tiger_2, 1);//на кожну тварину по два файли
        monkey0 = sp.load(this, R.raw.monkey_1, 1);
        monkey_1 = sp.load(this, R.raw.monkey_2, 1);
        elephant0 = sp.load(this, R.raw.elephant_1, 1);
        elephant1 = sp.load(this, R.raw.elephant_2, 1);
        frog0 = sp.load(this, R.raw.frog_1, 1);
        frog1 = sp.load(this, R.raw.frog_2, 1);
        pig0 = sp.load(this, R.raw.pig_1, 1);
        pig1 = sp.load(this, R.raw.pig_2, 1);
        horse0 = sp.load(this, R.raw.horse_1, 1);
        horse1 = sp.load(this, R.raw.horse_2, 1);
        cat0 = sp.load(this, R.raw.cat_1, 1);
        cat1 = sp.load(this, R.raw.cat_2, 1);
        sheep0 = sp.load(this, R.raw.sheep_1, 1);
        sheep1 = sp.load(this, R.raw.sheep_2, 1);
        dog0 = sp.load(this, R.raw.dog_1, 1);
        dog1 = sp.load(this, R.raw.dog_2, 1);
        chicken0 = sp.load(this, R.raw.chicken_1, 1);
        chicken1 = sp.load(this, R.raw.chicken_2, 1);
        cow0 = sp.load(this, R.raw.cow_1, 1);
        cow1 = sp.load(this, R.raw.cow_2, 1);
        lion0 = sp.load(this, R.raw.lion_1, 1);
        lion1 = sp.load(this, R.raw.lion_2, 1);


        policeCar = sp.load(this, R.raw.police_car, 1);//для транспорту однин файл
        ambulance = sp.load(this, R.raw.ambulance, 1);
        fire_engine = sp.load(this, R.raw.fire_engine, 1);
        rocket = sp.load(this, R.raw.rocket, 1);
        airplane = sp.load(this, R.raw.airplane, 1);
        helicopter = sp.load(this, R.raw.helicopter, 1);
        train = sp.load(this, R.raw.train, 1);
        car = sp.load(this, R.raw.car, 1);
        motorcycle = sp.load(this, R.raw.motorcycle, 1);
        bicycle = sp.load(this, R.raw.bicycle, 1);
        bus = sp.load(this, R.raw.bus, 1);
        ship = sp.load(this, R.raw.ship, 1);

        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);
        // ініціалізація
        tabHost.setup();
       // створюємо закладку и вказуємо тег
        tabSpec = tabHost.newTabSpec("tag1");
        //назва закладки
        tabSpec.setIndicator("Тварини");
        // вказуємо id компонента з FrameLayout,і він стане звідповідним вмістом
        tabSpec.setContent(R.id.tab1);
        //додаємо до корінного елемента
        tabHost.addTab(tabSpec);

        tabSpec = tabHost.newTabSpec("tag2");
        tabSpec.setIndicator("Транспорт");
        tabSpec.setContent(R.id.tab2);
        tabHost.addTab(tabSpec);

        // перша вкладка по замовчуванню активна
        tabHost.setCurrentTabByTag("tag1");


    }

    @Override
    public void onBackPressed() { // при переході на попередній Layout
        startService(new Intent(this, Sound.class));// запускаємо сервіс для програвання фонової мелодії
        setContentView(R.layout.activity_home_);//переходимо до  Layout activity_home_
        super.onBackPressed();

    }


    public void onClick(View view) { // підключення слухача
        switch (view.getId()) {
            case R.id.image1:
                if (cnt0 == 0) {                    //при виборі певного зображення
                    sp.play(lion0, 1, 1, 0, 0, 1);  // буде програватися відповідний звук
                    cnt0++;                         // у лічильник додаємо +1
                    break;
                }
                if (cnt0 == 1) {
                    sp.play(lion1, 1, 1, 0, 0, 1);
                    cnt0--;                         // або -1 , щоб кожного разу програвався інший звук
                    break;
                }
            case R.id.image2:
                if (cnt1 == 0) {
                    sp.play(monkey0, 1, 1, 0, 0, 1);
                    cnt1++;
                    break;
                }
                if (cnt1 == 1) {
                    sp.play(monkey_1, 1, 1, 0, 0, 1);
                    cnt1--;
                    break;
                }
            case R.id.image3:
                if (cnt2 == 0) {
                    sp.play(elephant0, 1, 1, 0, 0, 1);
                    cnt2++;
                    break;
                }
                if (cnt2 == 1) {
                    sp.play(elephant1, 1, 1, 0, 0, 1);
                    cnt2--;
                    break;
                }
            case R.id.image4:
                if (cnt3 == 0) {
                    sp.play(frog0, 1, 1, 0, 0, 1);
                    cnt3++;
                    break;
                }
                if (cnt3 == 1) {
                    sp.play(frog1, 1, 1, 0, 0, 1);
                    cnt3--;
                    break;
                }
            case R.id.image5:
                if (cnt4 == 0) {
                    sp.play(pig0, 1, 1, 0, 0, 1);
                    cnt4++;
                    break;
                }
                if (cnt4 == 1) {
                    sp.play(pig1, 1, 1, 0, 0, 1);
                    cnt4--;
                    break;
                }
            case R.id.image6:
                if (cnt5 == 0) {
                    sp.play(horse0, 1, 1, 0, 0, 1);
                    cnt5++;
                    break;
                }
                if (cnt5 == 1) {
                    sp.play(horse1, 1, 1, 0, 0, 1);
                    cnt5--;
                    break;
                }
            case R.id.image7:
                if (cnt6 == 0) {
                    sp.play(cat0, 1, 1, 0, 0, 1);
                    cnt6++;
                    break;
                }
                if (cnt6 == 1) {
                    sp.play(cat1, 1, 1, 0, 0, 1);
                    cnt6--;
                    break;
                }
            case R.id.image8:
                if (cnt7 == 0) {
                    sp.play(sheep0, 1, 1, 0, 0, 1);
                    cnt7++;
                    break;
                }
                if (cnt7 == 1) {
                    sp.play(sheep1, 1, 1, 0, 0, 1);
                    cnt7--;
                    break;
                }
            case R.id.image9:
                if (cnt8 == 0) {
                    sp.play(dog0, 1, 1, 0, 0, 1);
                    cnt8++;
                    break;
                }
                if (cnt8 == 1) {
                    sp.play(dog1, 1, 1, 0, 0, 1);
                    cnt8--;
                    break;
                }
            case R.id.image10:
                if (cnt9 == 0) {
                    sp.play(chicken0, 1, 1, 0, 0, 1);
                    cnt9++;
                    break;
                }
                if (cnt9 == 1) {
                    sp.play(chicken1, 1, 1, 0, 0, 1);
                    cnt9--;
                    break;
                }
            case R.id.image11:
                if (cnt10 == 0) {
                    sp.play(cow0, 1, 1, 0, 0, 1);
                    cnt10++;
                    break;
                }
                if (cnt10 == 1) {
                    sp.play(cow1, 1, 1, 0, 0, 1);
                    cnt10--;
                    break;
                }
            case R.id.image12:
                if (cnt11 == 0) {
                    sp.play(lion0, 1, 1, 0, 0, 1);
                    cnt11++;
                    break;
                }
                if (cnt11 == 1) {
                    sp.play(lion1, 1, 1, 0, 0, 1);
                    cnt11--;
                    break;
                }


            case R.id.image01:                      // тут простіше
                sp.play(policeCar, 1, 1, 0, 0, 1);      //в даному випадку програємо лише одни звук
                break;
            case R.id.image02:
                sp.play(ambulance, 1, 1, 0, 0, 1);
                break;
            case R.id.image03:
                sp.play(fire_engine, 1, 1, 0, 0, 1);
                break;
            case R.id.image04:
                sp.play(rocket, 1, 1, 0, 0, 1);
                break;
            case R.id.image05:
                sp.play(airplane, 1, 1, 0, 0, 1);
                break;
            case R.id.image06:
                sp.play(helicopter, 1, 1, 0, 0, 1);
                break;
            case R.id.image07:
                sp.play(train, 1, 1, 0, 0, 1);
                break;
            case R.id.image08:
                sp.play(car, 1, 1, 0, 0, 1);
                break;
            case R.id.image09:
                sp.play(motorcycle, 1, 1, 0, 0, 1);
                break;
            case R.id.image010:
                sp.play(bicycle, 1, 1, 0, 0, 1);
                break;
            case R.id.image011:
                sp.play(ship, 1, 1, 0, 0, 1);
                break;
            case R.id.image012:
                sp.play(bus, 1, 1, 0, 0, 1);
                break;
            default:
                break;
        }
    }
}

//P.S. Це моя перша робота такого маштабу. Дякую, що дали скористатися такою можливістю.