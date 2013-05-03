package com.demo.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

import com.demo.fragment.FirstFragment;

public class FirstPagerAdapter extends FragmentStatePagerAdapter {

	private ViewPager mPager;

	public FirstPagerAdapter(FragmentManager fm, ViewPager pager) {
		super(fm);
		mPager = pager;
	}

	@Override
	public Fragment getItem(int arg0) {
		return FirstFragment.newInstance(arg0, mPager);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 5;
	}

}
