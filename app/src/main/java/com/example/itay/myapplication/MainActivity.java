package com.example.itay.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Switch SW;
    ToggleButton TB;
    Button btn;
    LinearLayout L;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.btn);
        SW=(Switch) findViewById(R.id.SW);
        TB=(ToggleButton) findViewById(R.id.TB);
        L=(LinearLayout) findViewById(R.id.L);
    }


    public void btn(View view) {
        if(SW.isChecked()&& TB.isChecked()) {
        L.setBackgroundColor(Color.RED);
        }
        if(SW.isChecked()&& !TB.isChecked()) {
            L.setBackgroundColor(Color.BLACK);
        }
        if(!SW.isChecked()&& TB.isChecked()) {
            L.setBackgroundColor(Color.BLUE);
        }
        if(!SW.isChecked()&& !TB.isChecked()) {
            L.setBackgroundColor(Color.GRAY);
        }
        }
    }

