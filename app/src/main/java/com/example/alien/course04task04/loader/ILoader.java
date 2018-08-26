package com.example.alien.course04task04.loader;

import android.arch.lifecycle.MutableLiveData;
import android.widget.ImageView;

public interface ILoader {
    void loadImage(String uri, ImageView container);
    MutableLiveData<String> getLoadTime();
}
