package com.example.alien.course04task04;

import android.app.Application;

import com.squareup.picasso.Picasso;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Picasso.Builder builder = new Picasso.Builder(this);
        Picasso.setSingletonInstance(builder.build());
    }
}
