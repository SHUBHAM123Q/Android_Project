package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUserName, txtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUserName = (EditText) findViewById(R.id.txtUserName);
        txtPassword = (EditText) findViewById(R.id.txtPassword);

        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(view -> {
            if (TextUtils.isEmpty(txtUserName.getText().toString().trim())) {
                txtUserName.setError("Please enter Username");
            } else if (TextUtils.isEmpty(txtPassword.getText().toString().trim())){
                txtPassword.setError("Please enter your Password");
            } else if (!txtUserName.getText().toString().trim().equals("user")) {
                txtUserName.setError("Invalid Username");
            } else if (!txtPassword.getText().toString().trim().equals("12345")) {
                txtPassword.setError("Invalid Password");
            } else {
                txtUserName.setError(null);
                txtPassword.setError(null);
                Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(), Nextpage.class);
                startActivity(intent);
            }
        });

    }
}