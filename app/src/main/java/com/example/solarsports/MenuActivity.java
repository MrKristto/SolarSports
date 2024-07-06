package com.example.solarsports;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button buttonRegister = findViewById(R.id.buttonRegister);
        Button buttonTracking = findViewById(R.id.buttonTracking);
        Button buttonStats = findViewById(R.id.buttonStats);
        Button buttonTips = findViewById(R.id.buttonTips);

        buttonRegister.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, SolarRegistrationActivity.class);
            startActivity(intent);
        });

        buttonTracking.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, SolarTrackingActivity.class);
            startActivity(intent);
        });

        buttonStats.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, SolarStatsActivity.class);
            startActivity(intent);
        });

        buttonTips.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, SolarTipsActivity.class);
            startActivity(intent);
        });
    }
}