package com.vvit.myappcsea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondScreen extends AppCompatActivity {
    TextView resultView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        resultView = findViewById(R.id.id_second_result);

        String result = getIntent().getStringExtra("result");
        resultView.setText(result);
    }
}