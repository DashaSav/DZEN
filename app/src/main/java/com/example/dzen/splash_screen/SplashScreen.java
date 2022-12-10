package com.example.dzen.splash_screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.dzen.R;
import com.example.dzen.onBoarding.OnBoarding;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_logo);

        Intent intent = new Intent(SplashScreen.this, OnBoarding.class);
        startActivity(intent);
    }
}