package com.player.colapstoolbar.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.player.colapstoolbar.fragments.UserFragment;

/**
 * Created by narek.ayvazyan on 08.07.2016.
 */


public class ProfilePagerAdapter extends FragmentStatePagerAdapter {

    public ProfilePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return UserFragment.newInstance();
    }


    @Override
    public int getCount() {
        return 2;
    }


}

