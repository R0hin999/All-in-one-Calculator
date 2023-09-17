package com.example.allinone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        int SPLASH_ACTIVITY = 2000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent inext = new Intent(splashscreen.this,MainActivity.class);
                startActivity(inext);
                finish();

            }
        },SPLASH_ACTIVITY);
    }
}