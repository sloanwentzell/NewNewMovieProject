package com.example.paxton_wentzell.newnewmovieproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    Controller controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView movieTitleTextView = findViewById(R.id.movieTitleTextView);
        TextView genreTextView = findViewById(R.id.genreTextView);
        TextView synopsisTextView = findViewById(R.id.synopsµtView);
        TextView runtimeTextView = findViewById(R.id.runtimeTextView);
        ImageView posterImageView = findViewById(R.id.poster);

        controller = new Controller(getApplicationContext(), movieTitleTextView, genreTextView, synopsisTextView, ratingTextView, runtimeTextView, posterImageView);
    }
}
