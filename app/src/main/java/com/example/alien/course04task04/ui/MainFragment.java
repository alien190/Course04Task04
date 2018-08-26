package com.example.alien.course04task04.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alien.course04task04.R;
import com.example.alien.course04task04.loader.GlideLoader;
import com.example.alien.course04task04.loader.ILoader;
import com.example.alien.course04task04.loader.PicassoLoader;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainFragment extends Fragment {

    private View mView;

    @BindView(R.id.ivFirst)
    public ImageView mIvFirst;
    @BindView(R.id.ivSecond)
    public ImageView mIvSecond;
    @BindView(R.id.ivThird)
    public ImageView mIvThird;
    @BindView(R.id.ivFourth)
    public ImageView mIvFourth;

    @BindView(R.id.tvFirst)
    public TextView mTvFirst;
    @BindView(R.id.tvSecond)
    public TextView mTvSecond;
    @BindView(R.id.tvThird)
    public TextView mTvThird;
    @BindView(R.id.tvFourth)
    public TextView mTvFourth;

    private ILoader mPicassoLocalLoader = new PicassoLoader();
    private ILoader mPicassoRemoteLoader = new PicassoLoader();
    private ILoader mGlideLocalLoader = new GlideLoader(getContext());
    private ILoader mGlideRemoteLoader = new GlideLoader(getContext());


    public static MainFragment newInstance() {

        Bundle args = new Bundle();

        MainFragment fragment = new MainFragment();
        fragment.setArguments(args);
        fragment.setRetainInstance(true);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (mView == null) {
            mView = inflater.inflate(R.layout.fr_main, container, false);
            ButterKnife.bind(this, mView);
            startLoading();
        }
        return mView;
    }

    private void startLoading() {
        mPicassoLocalLoader.loadImage("", mIvFirst);
        mPicassoLocalLoader.getLoadTime().observe(this, mTvFirst::setText);

        mPicassoRemoteLoader.loadImage("", mIvSecond);
        mPicassoRemoteLoader.getLoadTime().observe(this, mTvSecond::setText);

        mGlideLocalLoader.loadImage("", mIvThird);
        mGlideLocalLoader.getLoadTime().observe(this, mTvThird::setText);

        mGlideRemoteLoader.loadImage("", mIvFourth);
        mGlideRemoteLoader.getLoadTime().observe(this, mTvFourth::setText);
    }

    @Override
    public void onDestroy() {

        mPicassoLocalLoader = null;
        mPicassoRemoteLoader = null;
        mGlideLocalLoader = null;
        mGlideRemoteLoader = null;

        mIvFirst = null;
        mIvSecond = null;
        mIvThird = null;
        mIvFourth = null;

        mTvFirst = null;
        mTvSecond = null;
        mTvThird = null;
        mTvFourth = null;

        super.onDestroy();
    }
}
