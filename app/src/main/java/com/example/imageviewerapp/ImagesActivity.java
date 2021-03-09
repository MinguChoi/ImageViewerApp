package com.example.imageviewerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

import static java.lang.String.valueOf;

public class ImagesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);
    }

    public void onClick(View v) {
        Intent onClickINT = new Intent(ImagesActivity.this, DetailsActivity.class);
        int resID = v.getResources().getIdentifier(String.valueOf(v.getTag()),"drawable", getPackageName());

        //System.out.println("DEBUG: resID = " + resID);
        onClickINT.putExtra("data", resID);
        startActivity(onClickINT);
    }
}