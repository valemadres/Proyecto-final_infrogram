package com.example.infogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.DrawableContainer;
import android.os.Bundle;
import android.view.View;

import com.example.infogram.view.CotainerActivity2;
import com.example.infogram.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void goCreateAccount(View view) {
        Intent intent = new Intent(this , CreateAccountActivity.class);
        startActivity(intent);

    }

    public void login(View view) {
        Intent intent = new Intent(this, CotainerActivity2.class);
        startActivity(intent);
    }
}