package com.example.solarsports;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SolarRegistrationSoccerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_solar_registration_soccer);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        String[] power = {"200W","250W","300W","350W","400W","450W","500W"};

        Spinner spinnerPower = findViewById(R.id.spinnerPower);

        spinnerPower.setAdapter(new ArrayAdapter<>(SolarRegistrationSoccerActivity.this, android.R.layout.simple_spinner_item, power));

    }
}