package com.example.practica1_oswarnaalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView nameUSer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle Valores = getIntent().getExtras();
        String user = Valores.getString("Usuario");

        nameUSer = findViewById(R.id.tvuser);
        nameUSer.setText(user);
    }
}