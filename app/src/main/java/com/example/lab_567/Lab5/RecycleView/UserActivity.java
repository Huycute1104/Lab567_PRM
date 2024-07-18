package com.example.lab_567.Lab5.RecycleView;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lab_567.R;

import java.util.ArrayList;
import java.util.List;

public class UserActivity extends AppCompatActivity {
    List<User> users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user);
        RecyclerView rvUserList = findViewById(R.id.rvUserList);

        users = new ArrayList<>();
        users.add(new User("Huy", "Pham Tran Huy", "huyptse160548@gmail.com"));
        users.add(new User("Phuoc", "Nguyen Huu Phuoc", "phuocnhse160557@gmail.com"));
        users.add(new User("Tuan", "Nguyen Van Tuan", "tuannvse160549@gmail.com"));
        users.add(new User("Tri", "Huynh Truong Minh Tri", "triSE171368@gmail.com"));
        users.add(new User("Quan", "Pham Anh Quan", "quanpvse160568@gmail.com"));

        UserAdapter userAdapter = new UserAdapter(users);
        rvUserList.setAdapter(userAdapter);
        rvUserList.setLayoutManager(new LinearLayoutManager(this));
    }
}