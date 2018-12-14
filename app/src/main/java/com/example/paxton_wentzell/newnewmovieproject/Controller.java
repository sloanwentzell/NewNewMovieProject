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
        private ImageView posterImageView;



        private Movie movie;

        Controller(Context context, TextView mttv, TextView rstv, TextView stv, TextView rtv, TextView rnt, ImageView img) {
            movieTitleTextView = mttv;
            genreTextView = rstv;
            synopsisTextView = stv;
            ratingTextView = rtv;
            runtimeTextView = rnt;
            posterImageView = img;

            movie = new Movie(context, this);


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

        public void updateText() {

            //movie.description(0);


            synopsisTextView.setText(movie.description(0));
            genreTextView.setText(movie.genre(0));
            runtimeTextView.setText(movie.runTime(0));
            movieTitleTextView.setText(movie.title(0));
            ratingTextView.setText(movie.rating(0));

            try {
                Bitmap bitmap = BitmapFactory.decodeStream((InputStream)new URL(movie.image(0)).getContent());
                posterImageView.setImageBitmap(bitmap);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }




        private void previous() {
//            .previous();
        }

        private void next() {
//            .next();
        }
}

