package com.example.myapplication07_07;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Main");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id =item.getItemId();
        if (id==R.id.menu_item1){
            Intent intent = new Intent(MainActivity.this, ImageActivity.class);
            startActivity(intent);
        } else if (id==R.id.menu_item2) {
            Toast.makeText(MainActivity.this, "Video ", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, vid_Activity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);

    }
}