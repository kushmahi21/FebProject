package com.example.febproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
    private Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Next = findViewById(R.id.button4);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });

    }

    public void openNewActivity() {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);

    }
    public void Showalerts(View view) {
        AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
        builder2.setTitle("Fact");
        builder2.setMessage("Maharajas' Express");
        AlertDialog alertDialog = builder2.create();
        alertDialog.show();
    }
}
