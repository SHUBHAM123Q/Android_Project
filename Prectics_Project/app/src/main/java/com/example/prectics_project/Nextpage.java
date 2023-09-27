package com.example.prectics_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nextpage extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nextpage);

        button = (Button) findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Submitpage();
            }
        });
    }
    public void  Submitpage(){
        Intent intent = new Intent(this,Submitpage.class);
        startActivity(intent);
    }
}