package com.example.hellogit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Hello GitHub", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello GitHub2", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello GitHub3", Toast.LENGTH_SHORT).show();
    }
}