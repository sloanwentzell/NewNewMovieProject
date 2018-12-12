package com.example.paxton_wentzell.newnewmovieproject;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Controller {





        private TextView appTextView;
        private TextView movieTitleTextView;
        private TextView rgrSideTextView;
        private TextView synopsisTextView;
        private Button previousButton;
        private Button nextButton;



        private Movie movie;

        Controller(Movie m, TextView apt, TextView mttv, TextView rstv, TextView stv, Button pv, Button nb) {
            appTextView = apt;
            movieTitleTextView = mttv;
            rgrSideTextView = rstv;
            synopsisTextView = stv;
            movie = m;
            previousButton = pv;
            nextButton = nb:


            updateText();

            previousButton.setOnClickListener(new View.OnClickListener() {
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
            });
        }

        private void updateText() {

            //movie.description(0);
            movie.description(0);
            movie.genre(0);
            movie.runTime(0);
            movie.title(0);
            movie.rating(0);
        }




        private void previous() {
//            .previous();
        }

        private void next() {
//            .next();
        }

    }


}
