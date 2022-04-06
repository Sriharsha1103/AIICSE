package com.vvit.myappcsea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstScreen extends AppCompatActivity {
    //1.Create objects for components/Views/Widgets
    EditText input1, input2;
    Button addButton;
    TextView resultView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);
        setTitle(R.string.first_screen_title);
        //2. Link/Map/ Relate components with objects
              input1 = findViewById(R.id.id_first_value1);
              input2 = findViewById(R.id.id_first_value2);
              addButton = findViewById(R.id.id_first_button);
              resultView = findViewById(R.id.id_first_result);


        //3. Define functionality or logic

            addButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   int value1 = Integer.parseInt(input1.getText().toString());
                   int value2 = Integer.parseInt(input2.getText().toString());
                   int answer = value1 + value2;
                   resultView.setText(String.valueOf(answer));

                   Intent intent = new Intent(FirstScreen.this,SecondScreen.class);
                   intent.putExtra("result",String.valueOf(answer));
                   startActivity(intent);
                }


            });
    }

    //3.
}