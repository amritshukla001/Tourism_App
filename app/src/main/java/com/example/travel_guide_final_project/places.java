package com.example.travel_guide_final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class places extends AppCompatActivity {
    ImageView imageView_large;
    ImageView imageView_large1;
    ImageView imageView_large2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        imageView_large = findViewById(R.id.imageView_large);
        imageView_large1 = findViewById(R.id.imageView_large1);
        imageView_large2 = findViewById(R.id.imageView_large2);
        imageView_large.setImageResource(R.drawable.lake);
        imageView_large1.setImageResource(R.drawable.zuluk);
        imageView_large2.setImageResource(R.drawable.northsikkim);


    }
}
