package com.example.solarsports;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;

public class SolarTrackingListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_solar_tracking_list);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        String type = getIntent().getStringExtra("Type");

        ArrayList<String> fields = new ArrayList<>();

        for (int i = 0; i <= 25; i++) {
            fields.add(type + " " + i);
        }

        ListView listviewFields = findViewById(R.id.ListViewFields);

        listviewFields.setAdapter(new ArrayAdapter<>(SolarTrackingListActivity.this, android.R.layout.simple_list_item_1, fields));

    }
}