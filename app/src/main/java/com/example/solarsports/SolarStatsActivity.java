package com.example.solarsports;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class SolarStatsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_solar_stats);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        BarChart barchartStats = findViewById(R.id.BarchartStats);

        List<BarEntry> stats = new ArrayList<>();

        stats.add(new BarEntry(8f, 2));
        stats.add(new BarEntry(1f, 4));
        stats.add(new BarEntry(2f, 5));
        stats.add(new BarEntry(3f, 8));
        stats.add(new BarEntry(4f, 3));
        stats.add(new BarEntry(5f, 1));

        BarDataSet data = new BarDataSet(stats, "PRODUCCIÓN DE ENERGÍA");
        BarData bardata = new BarData(data);

        data.setColors(ColorTemplate.COLORFUL_COLORS);

        bardata.setBarWidth(8.9f);
        barchartStats.setData(bardata);
        barchartStats.setFitBars(true);
        barchartStats.invalidate();

    }
}