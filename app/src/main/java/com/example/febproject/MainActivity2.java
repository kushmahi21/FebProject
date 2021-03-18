package com.example.febproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button KnowMoreAboutMe;
    private TextView textView2;
    private TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        KnowMoreAboutMe = findViewById(R.id.button2);
        KnowMoreAboutMe.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

    }
    public void openNewActivity(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}