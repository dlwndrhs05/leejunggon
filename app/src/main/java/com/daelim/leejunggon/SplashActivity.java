package com.daelim.leejunggon;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        activity=this;
        move(2);

    }
    public SplashActivity(){
        super();
    }
    private SplashActivity activity;
    private void move(int sec){
        Handler h = new Handler();
        h.postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent = new Intent(activity, IntroActivity.class);
                startActivity(intent);
                finish();
            }
        },1000*sec);
    }
}