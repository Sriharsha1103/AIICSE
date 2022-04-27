package com.vvit.myappcsea;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ARecyclerViewDemo extends AppCompatActivity {
    RecyclerView myFruitList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arecycler_view_demo);
        myFruitList = findViewById(R.id._fruit_list);

        List<String> myList = new ArrayList<>();
        myList.addAll(Arrays.asList(getResources().getStringArray(R.array.my_fruit_list)));
        FruitAdapter adapter = new FruitAdapter(myList);

        myFruitList.setLayoutManager(new LinearLayoutManager(this));
        myFruitList.setAdapter(adapter);
    }
}