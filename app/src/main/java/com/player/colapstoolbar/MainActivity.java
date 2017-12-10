package com.player.colapstoolbar;


import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


import com.player.colapstoolbar.adapters.SectionsPagerAdapter;

/**
 * Created by narek.ayvazyan on 04.07.2016.
 */

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private FloatingActionButton fab;
    private AppBarLayout appbar;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        fab = (FloatingActionButton) findViewById(R.id.fabMain);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        appbar = (AppBarLayout)findViewById(R.id.appbar);


        setSupportActionBar(toolbar);

        setSupportActionBar(toolbar);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());


        mViewPager = (ViewPager)findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

//        toolbar.setTitleTextColor(getResources().getColor(android.R.color.black));
        getSupportActionBar().setTitle(getString(R.string.tab_text_1));



        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        getSupportActionBar().setTitle(getString(R.string.tab_text_1));
                        fab.show();
                        break;
                    case 1:
                        getSupportActionBar().setTitle(getString(R.string.tab_text_2));
                        fab.show();
                        break;

                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

}
