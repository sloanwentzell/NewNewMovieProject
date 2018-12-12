package com.example.paxton_wentzell.newnewmovieproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Controller controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Movie movie = new Movie(getApplicationContext());

        controller = new Controller(movie,);
    }
}
