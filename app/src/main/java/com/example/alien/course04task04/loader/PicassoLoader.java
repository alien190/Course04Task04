package com.example.alien.course04task04.loader;

import android.widget.ImageView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import timber.log.Timber;

public class PicassoLoader extends BaseLoader implements ILoader {

    private Callback mCallback = new Callback() {
        @Override
        public void onSuccess() {
            stopTimer();
        }

        @Override
        public void onError(Exception e) {
            Timber.e(e);
            onLoadError();
        }
    };

    @Override
    public void loadImage(String uri, ImageView container) {
        startTimer();
        Picasso.get()
                .load(uri)
                .into(container, mCallback);
    }



}
