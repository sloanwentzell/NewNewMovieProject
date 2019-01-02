package com.example.paxton_wentzell.newnewmovieproject;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.io.*;
import java.net.*;

public class Image implements Runnable { // Todo: pass activity.
    private String imageURL;
    private MainActivity activity;
    private Context context;
    private ImageView poster;
    private Bitmap image;

    Image(String URL, MainActivity a, ImageView p, Context c) {
        activity = a;
        imageURL = URL;
        context = c;
        poster = p;
    }

    public Bitmap getImage() {
        try {
            URL url = new URL(imageURL);
            return BitmapFactory.decodeStream((InputStream) url.getContent());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void run() {
        image = getImage();
        activity.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                poster.setImageBitmap(image);
            }
        });
    }
}
