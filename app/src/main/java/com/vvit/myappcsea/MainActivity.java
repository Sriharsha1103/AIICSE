package com.vvit.myappcsea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new MyAsyncTask().execute(NetworkUtils.buildURL("popular",true));
        new MyAsyncTask().execute(NetworkUtils.buildURL("top_rated",true));
    }
}