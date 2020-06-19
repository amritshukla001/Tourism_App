package com.example.travel_guide_final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class rate extends AppCompatActivity {
    RatingBar bar;
    Button rate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        rate = findViewById(R.id.brate);
        bar = findViewById(R.id.bar);

        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float rating = bar.getRating();
                Toast.makeText(rate.this,"You" + "rated"+ rating + "stars",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
