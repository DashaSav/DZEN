package com.example.dzen.onBoarding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dzen.R;
import com.example.dzen.login.Login;
import com.example.dzen.register.Register;

public class OnBoarding extends AppCompatActivity {
    public AppCompatButton login;
    public TextView registration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);
        login = findViewById(R.id.login);
        registration = findViewById(R.id.registration);
        login.setOnClickListener(view -> {
            Intent log = new Intent(OnBoarding.this, Login.class);
            startActivity(log);
        });
        registration.setOnClickListener(view -> {
            Intent reg = new Intent(OnBoarding.this, Register.class);
            startActivity(reg);
        });
    }
}