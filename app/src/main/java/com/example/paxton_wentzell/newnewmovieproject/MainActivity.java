package com.example.paxton_wentzell.newnewmovieproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Controller controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Movie movie = new Movie(getApplicationContext());

        TextView movieTitleTextView = findViewById(R.id.movieTitleTextView);
        TextView rgrSideTextView = findViewById(R.id.rgrSideTextView);
        TextView synopsisTextView = findViewById(R.id.synopsisTextView);

        controller = new Controller(movie, movieTitleTextView, rgrSideTextView, synopsisTextView);
    }
}
