package com.daelim.leejunggon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class ListCustomActivity extends AppCompatActivity {
    ListView Lvc = findViewById(R.id.ListViewCustom);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_custom);
    }

}