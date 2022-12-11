package com.example.dzen.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dzen.R;
import com.example.dzen.main.MainActivity;

public class Login extends AppCompatActivity {
    AppCompatButton Sign;
    TextView email;
    TextView password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        password = findViewById(R.id.Password);
        email = findViewById(R.id.Email);
        Sign = findViewById(R.id.Sign);
        Sign.setOnClickListener(view -> {
            String realEmail = email.getText().toString();
            String realPass = password.getText().toString();
            if (realEmail.contains("@")&& !realPass.isEmpty()) {
                Intent good = new Intent(Login.this, MainActivity.class);
                startActivity(good);
            }else{
                Toast.makeText(this, "Email without '@' or Password empty", Toast.LENGTH_SHORT).show();
            }
        });
    }
}