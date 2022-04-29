package com.daelim.leejunggon;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CalActivity extends AppCompatActivity {
    public TextView t_View;
    public TextView s_View;
    public char Operator;
    public boolean intnext;
    public boolean operatornext;
    public char intger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        t_View = findViewById(R.id.View);
        s_View = findViewById(R.id.Sideview);
        intnext = true;
        operatornext = true;

    }

    public void OnClick(View v) {
        String tView = t_View.getText().toString();
        String SView =s_View.getText().toString() ;
        if(tView.isEmpty()){
            intnext = false;
        }else{
            intnext = true;
        }
        if (operatornext == true) {
            switch (v.getId()) {
                case R.id.btn0:
                    t_View.setText(tView + "0");
                    break;
                case R.id.btn1:
                    t_View.setText(tView + "1");
                    break;
                case R.id.btn2:
                    t_View.setText(tView + "2");
                    break;
                case R.id.btn3:
                    t_View.setText(tView + "3");
                    break;
                case R.id.btn4:
                    t_View.setText(tView + "4");
                    break;
                case R.id.btn5:
                    t_View.setText(tView + "5");
                    break;
                case R.id.btn6:
                    t_View.setText(tView + "6");
                    break;
                case R.id.btn7:
                    t_View.setText(tView + "7");
                    break;
                case R.id.btn8:
                    t_View.setText(tView + "8");
                    break;
                case R.id.btn9:
                    t_View.setText(tView + "9");
                    break;
            }
        }else{
            switch (v.getId()){
                case R.id.btndiv:
                    Toast.makeText(getApplicationContext(), "숫자를 먼저 입력하세요", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnmp:
                    Toast.makeText(getApplicationContext(), "숫자를 먼저 입력하세요", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnminus:
                    Toast.makeText(getApplicationContext(), "숫자를 먼저 입력하세요", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnplus:
                    Toast.makeText(getApplicationContext(), "숫자를 먼저 입력하세요", Toast.LENGTH_SHORT).show();
                    break;
                }
            }
        }

    public void Clickop(View v){
        String tView = t_View.getText().toString();
        String SView =s_View.getText().toString() ;
        if(SView.isEmpty()){
            operatornext = false;
        }else{
            operatornext = true;
        }
        if(intnext == true){
            switch(v.getId()){
                case R.id.btndiv:
                    s_View.setText(tView + SView + "/");
                    t_View.setText(null);
                    tView = null;
                    break;
                case R.id.btnmp:
                    s_View.setText(tView + SView + "*");
                    t_View.setText(null);
                    tView = null;
                    break;
                case R.id.btnminus:
                    s_View.setText(tView + SView + "-");
                    t_View.setText(null);
                    tView = null;
                    break;
                case R.id.btnplus:
                    s_View.setText(tView + SView + "+");
                    t_View.setText(null);
                    tView = null;
                    break;
            }
        }
    }
    public void result(View v){

    }
    public void clear(View v){

    }
}