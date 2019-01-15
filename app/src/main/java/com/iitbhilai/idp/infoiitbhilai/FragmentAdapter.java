package com.iitbhilai.idp.infoiitbhilai;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by LENOVO on 15-01-2017.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ttcse();
        } else if (position == 1) {
            return new ttee();
        } else {
            return new ttme();
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "CSE";
        } else if (position == 1) {
            return "EE";
        } else {
            return "ME";
        }


    }

}