package com.example.infogram.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.example.infogram.R;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        showToolbar("", true);
    }

    public void showToolbar(String titulo, Boolean botonSubir) {
        Toolbar toolbar = findViewById(R.id.toolbar_image_detail);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle(titulo);
        getSupportActionBar().setDisplayHomeAsUpEnabled(botonSubir);
    }
}