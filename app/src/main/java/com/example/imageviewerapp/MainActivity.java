package com.example.imageviewerapp;

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

    public void onClick(View v) {
        // Start new activity when first screen is touched
        Intent onClickINT = new Intent(MainActivity.this, ImagesActivity.class);
        startActivity(onClickINT);
    }
}