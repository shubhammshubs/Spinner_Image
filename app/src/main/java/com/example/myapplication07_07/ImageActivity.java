package com.example.myapplication07_07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class ImageActivity extends AppCompatActivity {

    private Spinner spinner;
    private ImageView image;


    private final int[] images = {R.drawable.one, R.drawable.three, R.drawable.two};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        spinner = findViewById(R.id.spinner);
        image = findViewById(R.id.image);

        String[] number = {"Select one","One", "Two", "Three"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, number);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position){
                    case 1:
                        image.setImageResource(R.drawable.one);
                        Toast.makeText(ImageActivity.this,"Hello",Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        image.setImageResource(R.drawable.two);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.three);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    };
}