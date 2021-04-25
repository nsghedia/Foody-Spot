package com.builddream.basicinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;


public class MainActivity extends AppCompatActivity {
    private  static final long  S_Time = 600000;
    private CountDownTimer CountTime ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CountDownTimer timer = new CountDownTimer(3000, 1000) {
            public void onTick(long millisUntilFinished) {
                int seconds = (int) (millisUntilFinished / 1000);
            }
            public void onFinish() {
                Intent intent = new Intent(getApplicationContext(), GuestList.class);
                startActivity(intent);
            }
        }.start();

    }

}