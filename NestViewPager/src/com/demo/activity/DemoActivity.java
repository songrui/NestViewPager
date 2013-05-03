package com.demo.activity;

import android.support.v4.app.FragmentActivity;

import com.demo.adapter.FirstPagerAdapter;
import com.demo.view.FirstViewPager;
import com.example.nestviewpager.R;

public class DemoActivity extends FragmentActivity {

	private FirstViewPager mPager;
	private FirstPagerAdapter mAdapter;

	protected void onCreate(android.os.Bundle arg0) {
		super.onCreate(arg0);
		setContentView(R.layout.main);

		mPager = (FirstViewPager) findViewById(R.id.firstPager);
		mPager.setPageMargin(10);

		mAdapter = new FirstPagerAdapter(getSupportFragmentManager(), mPager);
		mPager.setAdapter(mAdapter);
	}
}
