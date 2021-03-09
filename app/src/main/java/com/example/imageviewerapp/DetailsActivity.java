package com.example.imageviewerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView imageView = (ImageView) findViewById(R.id.image_details);

        Intent intent = getIntent();
        int data = intent.getIntExtra("data", 0);

        //System.out.println("DEBUG: data = " + data);
        imageView.setImageResource(data);
    }

    public void onClick(View v) {
        finish();
    }
}