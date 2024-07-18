package com.example.lab_567;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.lab_567.Lab5.Lab5;
import com.example.lab_567.Lab6.Lab6;
import com.example.lab_567.Lab7.Lab7;

public class MainActivity extends AppCompatActivity {
    Button lab5, lab6 , lab7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        lab5 = findViewById(R.id.lab5);
        lab6 = findViewById(R.id.lab6);
        lab7 = findViewById(R.id.lab7);

        lab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lab5.class);
                startActivity(intent);
            }
        });
        lab6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lab6.class);
                startActivity(intent);
            }
        });
        lab7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lab7.class);
                startActivity(intent);
            }
        });
    }
}