package com.example.novelnestadmin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {
   private TextInputEditText email_input, password_input;
   private TextView textViewForgetPassword;
   private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        email_input = findViewById(R.id.email_input);
        password_input = findViewById(R.id.password_input);
        textViewForgetPassword = findViewById(R.id.textViewForgetPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, AdminDashboard.class);
            startActivity(intent);
            finish();
        });

    }
}