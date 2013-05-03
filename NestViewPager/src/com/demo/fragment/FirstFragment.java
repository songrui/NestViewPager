package com.demo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.demo.adapter.SubPagerAdapter;
import com.demo.view.SubViewPager;
import com.example.nestviewpager.R;

public class FirstFragment extends Fragment {

	private ViewPager mParentPager;

	private SubViewPager mSubPager;
	private TextView mText;

	private int mIndex;
	private SubPagerAdapter mAdapter;

	public static FirstFragment newInstance(int arg0, ViewPager mPager) {
		FirstFragment f = new FirstFragment();
		Bundle args = new Bundle();
		args.putInt("index", arg0);
		f.mParentPager = mPager;
		f.setArguments(args);
		return f;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		mIndex = getArguments() == null ? 0 : getArguments().getInt("index");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.first_pager_fragment, null);
		mText = (TextView) view.findViewById(R.id.firstPagerTextView);
		mSubPager = (SubViewPager) view.findViewById(R.id.subPager);
		mSubPager.setParentViewPager(mParentPager);
		mSubPager.setPageMargin(5);
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		mText.setText("" + mIndex);
		mAdapter = new SubPagerAdapter(getChildFragmentManager());
		mSubPager.setAdapter(mAdapter);

	}

}
