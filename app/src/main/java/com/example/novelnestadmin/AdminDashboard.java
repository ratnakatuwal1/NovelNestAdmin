package com.example.novelnestadmin;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AdminDashboard extends AppCompatActivity {
    private CardView cardViewAddNovel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_admin_dashboard);

        cardViewAddNovel = findViewById(R.id.cardViewAddNovel);

        cardViewAddNovel.setOnClickListener(v -> {
            Intent intent = new Intent(AdminDashboard.this, AddNovelActivity.class);
            startActivity(intent);
        });
    }
}