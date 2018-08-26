package com.example.alien.course04task04.loader;

import android.arch.lifecycle.MutableLiveData;

public class BaseLoader {
    private MutableLiveData<String> mLoadTime = new MutableLiveData<>();

    public BaseLoader() {
        mLoadTime.postValue("Время загрузки: в процессе");
    }

    public MutableLiveData<String> getLoadTime() {
        return mLoadTime;
    }
}
