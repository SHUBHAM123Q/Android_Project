package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText logintext , passwordtext;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logintext = (EditText) findViewById(R.id.login);
        passwordtext = (EditText) findViewById(R.id.password);

        btnlogin = (Button) findViewById(R.id.btn);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = logintext.getText().toString();
                String password = passwordtext.getText().toString();

                if (username.equals("user") && (password.equals("12345")))
                {
                    Toast.makeText( MainActivity.this,  "Welcome" , Toast.LENGTH_SHORT) .show();
                    Intent intent = new Intent(getApplicationContext(),Nextpage.class);
                    startActivity(intent);
                }
                else
                {
                  Toast.makeText(MainActivity.this, "invalidpassword" , Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}