package com.example.solarsports;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class SolarRegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_solar_registration);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        String[] type = {"Cancha de Fútbol","Cancha Micro-Fútbol","Gimnasio"};
        String[] power = {"200W","250W","300W","350W","400W","450W","500W"};

        Spinner spinnerType = findViewById(R.id.spinnerType);
        Spinner spinnerPower = findViewById(R.id.spinnerPower);
        Button buttonSave = findViewById(R.id.buttonSave);

        spinnerType.setAdapter(new ArrayAdapter<>(SolarRegistrationActivity.this, android.R.layout.simple_spinner_item, type));
        spinnerPower.setAdapter(new ArrayAdapter<>(SolarRegistrationActivity.this, android.R.layout.simple_spinner_item, power));

        buttonSave.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), "El registro se ha realizado correctamente.", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(SolarRegistrationActivity.this, MenuActivity.class);
            startActivity(intent);
        });

    }
}