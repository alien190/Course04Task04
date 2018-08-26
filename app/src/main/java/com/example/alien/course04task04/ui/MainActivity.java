package com.example.alien.course04task04.ui;

import android.support.v4.app.Fragment;
import com.example.alien.course04task04.ui.common.SingleFragmentActivity;

public class MainActivity extends SingleFragmentActivity {
    @Override
    protected Fragment getFragment() {
        return MainFragment.newInstance();
    }
}
