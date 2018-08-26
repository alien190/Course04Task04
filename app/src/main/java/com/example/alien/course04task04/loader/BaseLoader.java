package com.example.alien.course04task04.loader;

import android.arch.lifecycle.MutableLiveData;

import java.util.Date;

public class BaseLoader {
    private MutableLiveData<String> mLoadTime = new MutableLiveData<>();
    private Date mDate;

    public BaseLoader() {
        mLoadTime.postValue("Время загрузки: в процессе");
    }

    public MutableLiveData<String> getLoadTime() {
        return mLoadTime;
    }

    protected void startTimer(){
        mDate = new Date();
    }
    protected void stopTimer(){
        long diff;
        Date curDate = new Date();
        diff = curDate.getTime() - mDate.getTime();
        mLoadTime.postValue("Время загрузки: " + diff + " сек.");
    }

    protected void onLoadError(){
        mLoadTime.postValue("сбой загрузки");
    }
}
