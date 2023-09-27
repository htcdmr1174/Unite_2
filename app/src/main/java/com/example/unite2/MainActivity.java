package com.example.unite2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void uyg2Goster(View view) {
        Intent i = new Intent(MainActivity.this, Uyg2Activity.class);
        startActivity(i);


    }

    public void Uyg4Goster(View view) {
        Intent i = new Intent  ( MainActivity.this, Uyg4Activity.class);
        startActivity(i);
    }
    public void ss64(View view) {
        Intent i = new Intent(MainActivity.this, SS64Activity.class);
        startActivity(i);
    }
}