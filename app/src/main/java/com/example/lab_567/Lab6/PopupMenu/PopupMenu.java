package com.example.lab_567.Lab6.PopupMenu;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_567.R;

public class PopupMenu extends AppCompatActivity {
    Button btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_popup_menu);
        btnMenu = findViewById(R.id.btnMenu);

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showMenu();
            }
        });
    }

    // Function to show the popup menu
    private void showMenu() {
        android.widget.PopupMenu popupMenu = new android.widget.PopupMenu(this, btnMenu);
        popupMenu.getMenuInflater().inflate(R.menu.menu_popup, popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new android.widget.PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
//                    case R.id.menuThem:
//                        btnMenu.setText("Menu Them");
//                        return true;
//                    case R.id.menuSua:
//                        btnMenu.setText("Menu Sua");
//                        return true;
//                    case R.id.menuXoa:
//                        btnMenu.setText("Menu Xoa");
//                        return true;
                    default:
                        return false;
                }
            }
        });
        popupMenu.show();
    }
}
