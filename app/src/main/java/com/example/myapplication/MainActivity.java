package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        Button btnChangeText = findViewById(R.id.button);
        Button btnChangeTextColor = findViewById(R.id.button2);
        Button btnChangeBgColor = findViewById(R.id.button3);

        // 1 mygtukas: pakeičia tekstą
        btnChangeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Labukas");
            }
        });

        // 2 mygtukas: pakeičia teksto spalvą į raudoną
        btnChangeTextColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setTextColor(Color.RED);
            }
        });

        // 3 mygtukas: pakeičia fono spalvą į geltoną
        btnChangeBgColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setBackgroundColor(Color.YELLOW);
            }
        });
    }
}