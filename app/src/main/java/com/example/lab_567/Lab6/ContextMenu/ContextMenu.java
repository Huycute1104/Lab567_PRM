package com.example.lab_567.Lab6.ContextMenu;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.lab_567.R;

public class ContextMenu extends AppCompatActivity {
    Button btnChonMau;
    ConstraintLayout manHinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_context_menu);
        btnChonMau = findViewById(R.id.button_Chonmau);
        manHinh = findViewById(R.id.manHinh);

        // Đăng ký view cho context menu
        registerForContextMenu(btnChonMau);

        // Đặt sự kiện click vào nút để mở context menu
        btnChonMau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openContextMenu(v);
            }
        });
    }

    @Override
    public void onCreateContextMenu(android.view.ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_context, menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
//            case R.id.menuDo:
//                manHinh.setBackgroundColor(Color.RED);
//                return true;
//            case R.id.menuVang:
//                manHinh.setBackgroundColor(Color.YELLOW);
//                return true;
//            case R.id.menuXanh:
//                manHinh.setBackgroundColor(Color.BLUE);
//                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
