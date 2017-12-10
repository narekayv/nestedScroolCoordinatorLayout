package com.player.colapstoolbar.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.player.colapstoolbar.fragments.FirstFragment;
import com.player.colapstoolbar.fragments.ProfileFragment;


/**
 * Created by narek.ayvazyan on 04.07.2016.
 */

public class SectionsPagerAdapter extends FragmentPagerAdapter {


    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return FirstFragment.newInstance();
            case 1:
                return ProfileFragment.newInstance();
        }
        return null;
    }




    @Override
    public int getCount() {
        return 2;
    }


}
