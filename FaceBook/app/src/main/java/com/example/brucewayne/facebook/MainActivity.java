package com.example.brucewayne.facebook;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPage;
    private PagerAdapter mPagerAdapter;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPage = (ViewPager) findViewById(R.id.view_pager_question);
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        FragmentManager fragment = getSupportFragmentManager();
        mPagerAdapter = new PagerAdapter(fragment);
        mViewPage.setAdapter(mPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPage);
        mViewPage.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.setTabsFromPagerAdapter(mPagerAdapter);
        mTabLayout.getTabAt(1).setIcon(R.mipmap.ic_launcher);
        mTabLayout.getTabAt(2).setIcon(R.mipmap.ic_launcher);
        mTabLayout.getTabAt(0).setIcon(R.mipmap.ic_launcher);

    }
}
