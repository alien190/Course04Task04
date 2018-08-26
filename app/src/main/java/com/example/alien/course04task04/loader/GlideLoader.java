package com.example.alien.course04task04.loader;

import android.content.Context;
import android.widget.ImageView;

public class GlideLoader extends BaseLoader implements ILoader {

    private Context mContext;

    public GlideLoader(Context context) {
        super();
        mContext = context;
    }

    @Override
    public void loadImage(String uri, ImageView container) {

    }


}
