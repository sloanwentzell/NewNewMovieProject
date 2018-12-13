package com.example.paxton_wentzell.newnewmovieproject;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Controller {





        private TextView movieTitleTextView;
        private TextView runtimeTextView;
        private TextView synopsisTextView;
        private TextView ratingTextView;
        private TextView genreTextView;



        private Movie movie;

        Controller(Movie m, TextView mttv, TextView rstv, TextView stv, TextView rtv, TextView rnt) {
            movieTitleTextView = mttv;
            genreTextView = rstv;
            synopsisTextView = stv;
            movie = m;
            ratingTextView = rtv;
            runtimeTextView = rnt;


            updateText();

            /*previousButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
 //                   previous();
                    updateText();
                }
            });

            nextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
 //                   next();
                    updateText();
                }
            });*/
        }

        private void updateText() {

            //movie.description(0);
            System.out.println("updateText()" + movie.description(0));
            synopsisTextView.setText(movie.description(0));
            genreTextView.setText(movie.genre(0));
            runtimeTextView.setText(movie.runTime(0));
            movieTitleTextView.setText(movie.title(0));
            ratingTextView.setText(movie.rating(0));







        }




        private void previous() {
//            .previous();
        }

        private void next() {
//            .next();
        }
}

