package com.daelim.leejunggon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        TextView tv_value = findViewById(R.id.name);
        TextView tv_value2 = findViewById(R.id.year);

        Intent intent = getIntent();
        String str = intent.getStringExtra("data");
        String str2 = intent.getStringExtra("data2");

        tv_value.setText("이름은 "+str);
        tv_value2.setText("나이는 "+str2);

    }
    @Override
    public void startActivityForResult(Intent intent, int requestCode, @Nullable Bundle options) {
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        Intent i = new Intent();
        i.putExtra("data2","00000");
        setResult(RESULT_OK,i);
    }
    public void cut(View v){
        finish();
    }
}