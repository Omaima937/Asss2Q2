package com.example.assignment2q2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity  {
    private Button button;
    private Button button1;
    private Button button2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivity2();
            }


        });
        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivity3();
            }


        });





}

    public void openActivity2() {
        Intent intent = new Intent(this, activity2.class);
        startActivity(intent);
    }
    public void openActivity3() {
        Intent intent1 = new Intent(this, activity3.class);
        startActivity(intent1);
    }




}


