package com.example.lab_567.Lab5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_567.Lab5.RecycleView.UserActivity;
import com.example.lab_567.Lab5.RecycleView2.ModuleActivity;
import com.example.lab_567.R;

public class Lab5 extends AppCompatActivity {
    Button recycle, recycle2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab5);
        recycle = findViewById(R.id.recycle);
        recycle2 = findViewById(R.id.recycle2);

        recycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lab5.this, UserActivity.class);
                startActivity(intent);
            }
        });
        recycle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lab5.this, ModuleActivity.class);
                startActivity(intent);
            }
        });

    }
}