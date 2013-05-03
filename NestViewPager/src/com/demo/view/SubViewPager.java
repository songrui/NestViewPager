package com.demo.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class SubViewPager extends ViewPager {

	private boolean mIntercept = false;
	private ViewPager mParentViewPager;

	public SubViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		if (!mIntercept)
			mParentViewPager.requestDisallowInterceptTouchEvent(true);// 上层viewpager不拦截事件
		else
			mParentViewPager.requestDisallowInterceptTouchEvent(false);
		return super.dispatchTouchEvent(ev);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent arg0) {
		if (!mIntercept)
			mParentViewPager.requestDisallowInterceptTouchEvent(true);// 上层viewpager不拦截事件
		else
			mParentViewPager.requestDisallowInterceptTouchEvent(false);
		return super.onInterceptTouchEvent(arg0);
	}

	@Override
	public boolean onTouchEvent(MotionEvent arg0) {
		if (!mIntercept)
			mParentViewPager.requestDisallowInterceptTouchEvent(true);// 上层viewpager不拦截事件
		else
			mParentViewPager.requestDisallowInterceptTouchEvent(false);
		return super.onTouchEvent(arg0);
	}

	public ViewPager getParentViewPager() {
		return mParentViewPager;
	}

	public void setParentViewPager(ViewPager mParentViewPager) {
		this.mParentViewPager = mParentViewPager;
	}

	public boolean isIntercept() {
		return mIntercept;
	}

	public void setIntercept(boolean mIntercept) {
		this.mIntercept = mIntercept;
	}
}
