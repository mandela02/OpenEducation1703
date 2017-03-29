package com.example.brucewayne.facebook;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Bruce Wayne on 3/29/2017.
 */

public class PagerAdapter extends FragmentPagerAdapter
{
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment frag=null;
        switch (position)
        {
            case 0:
                frag = new WallFragment();
                break;
            case 1:
                frag = new FriendFragment();
                break;
            case 2:
                frag = new NoticeFragment();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }

}
