package com.example.paxton_wentzell.newnewmovieproject;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.*;
import java.net.*;


public class Controller {
    private TextView movieTitleTextView;
    private TextView runtimeTextView;
    private TextView synopsisTextView;
    private TextView ratingTextView;
    private TextView genreTextView;
    private Button  previousButton;
    private Button nextButton;
    private ImageView poster;
    private MainActivity activity;

    private int movieNumber = 0;



    private Movie movie;

    Controller(Context context, TextView mttv, TextView rstv, TextView stv, TextView rtv, TextView rnt, Button pv, Button nv, ImageView p, MainActivity a) {
        movieTitleTextView = mttv;
        genreTextView = rstv;
        synopsisTextView = stv;
        ratingTextView = rtv;
        runtimeTextView = rnt;
        previousButton = pv;
        nextButton = nv;
        poster = p;
        activity = a;

        movie = new Movie(context, this, activity, poster);


        updateText();

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previous();
                updateText();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
                updateText();
            }
        });
    }

    public void updateText() {
        movie.getImage(movieNumber);
        synopsisTextView.setText(movie.description(movieNumber));
        genreTextView.setText(movie.genre(movieNumber));
        runtimeTextView.setText(movie.runTime(movieNumber));
        movieTitleTextView.setText(movie.title(movieNumber));
        ratingTextView.setText(movie.rating(movieNumber));
    }





    private void previous() {
        if (movieNumber >= 0) {
            movieNumber--;
        }


    }

    private void next() {
        if(movieNumber<=9){
            movieNumber++;
        }
    }
}

