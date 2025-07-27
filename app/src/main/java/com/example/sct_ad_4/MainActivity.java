package com.example.sct_ad_4;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnScan, btnGenerate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnScan = findViewById(R.id.btnScan);
        btnGenerate = findViewById(R.id.btnGenerate);

        btnScan.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ScanActivity.class));
        });

        btnGenerate.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, GenerateActivity.class));
        });
    }
}