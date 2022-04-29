package com.daelim.leejunggon;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;
import android.widget.Button;
import android.widget.EditText;

public class SheardPreferenceActivity extends AppCompatActivity {
    private EditText Edit;
    private Button Save,r_c;
    private SharedPreferences preferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sheard_preference);
        Edit = findViewById(R.id.Edit);
        Save = findViewById(R.id.Save);
        r_c = findViewById(R.id.result_confirm);
        preferences = getSharedPreferences("result", MODE_PRIVATE);
        

    }
    public class t_save {

    }
    public class t_result{

    }
}