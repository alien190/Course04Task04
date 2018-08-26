package com.example.alien.course04task04.ui;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.alien.course04task04.R;
import com.example.alien.course04task04.ui.common.SingleFragmentActivity;

public class MainActivity extends SingleFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected Fragment getFragment() {
        return MainFragment.newInstance();
    }
}
