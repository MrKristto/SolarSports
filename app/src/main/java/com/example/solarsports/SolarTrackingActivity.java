package com.example.solarsports;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SolarTrackingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_solar_tracking);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button buttonSoccer = findViewById(R.id.buttonSoccer);
        Button buttonMiniSoccer = findViewById(R.id.buttonMiniSoccer);
        Button buttonGyms = findViewById(R.id.buttonGyms);

        buttonSoccer.setOnClickListener(v -> {
            Intent intent = new Intent(SolarTrackingActivity.this, SolarTrackingListActivity.class);
            intent.putExtra("Type", "Soccer");
            startActivity(intent);
        });

        buttonMiniSoccer.setOnClickListener(v -> {
            Intent intent = new Intent(SolarTrackingActivity.this, SolarTrackingListActivity.class);
            intent.putExtra("Type", "MiniSoccer");
            startActivity(intent);
        });

        buttonGyms.setOnClickListener(v -> {
            Intent intent = new Intent(SolarTrackingActivity.this, SolarTrackingListActivity.class);
            intent.putExtra("Type", "Gyms");
            startActivity(intent);
        });

    }
}