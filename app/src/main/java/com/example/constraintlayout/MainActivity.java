package com.example.constraintlayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnBlog, btnSerie, btnConcurso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBlog = findViewById(R.id.btnBlog);
        btnSerie = findViewById(R.id.btnSerie);
        btnConcurso = findViewById(R.id.btnConcurso);

        btnBlog.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, BlogPostActivity.class);
            startActivity(intent);
        });

        // Activities futuras
        btnSerie.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SerieActivity.class);
            startActivity(intent);
        });

        btnConcurso.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ConcursoActivity.class);
            startActivity(intent);
        });
    }
}