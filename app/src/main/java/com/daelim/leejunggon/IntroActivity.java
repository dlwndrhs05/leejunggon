package com.daelim.leejunggon;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class IntroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity=this;
        setContentView(R.layout.activity_intro);

    }
    public IntroActivity(){
        super();
    }
    private IntroActivity activity;
    public void CalActivity(View view) {
        Intent intent = new Intent(activity, CalActivity.class);
        startActivity(intent);
    }public void NextActivity(View view) {
        Intent intent = new Intent(activity, NextActivity.class);
        startActivityForResult(intent,12345);
    }public void ResearchActivity(View view) {
        Intent intent = new Intent(activity, ResearchActivity.class);
        startActivityForResult(intent,12345);
    }public void ListActivity(View view) {
        Intent intent = new Intent(activity, ListActivity.class);
        startActivityForResult(intent,12345);
    }public void ListCustomActivity(View view) {
        Intent intent = new Intent(activity, ListCustomActivity.class);
        startActivityForResult(intent,12345);
    }






    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if( data != null){
            Log.e("null",data.getStringExtra("data"));
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    @Override
    protected void onPause() {
        super.onPause();
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
}