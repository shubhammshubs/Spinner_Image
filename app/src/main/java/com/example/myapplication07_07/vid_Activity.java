package com.example.myapplication07_07;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;

public class vid_Activity extends AppCompatActivity {

        private ImageView image1;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vid);

        image1 = findViewById(R.id.get_image);

        // Set the image programmatically
        image1.setImageResource(R.drawable.one);
    }




}