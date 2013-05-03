package com.demo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nestviewpager.R;

public class SubFragment extends Fragment {

	private TextView mText;
	private int mIndex;

	public SubFragment() {
		// TODO Auto-generated constructor stub
	}

	public static SubFragment newInstance(int index) {
		SubFragment f = new SubFragment();
		Bundle args = new Bundle();
		args.putInt("index", index);
		f.setArguments(args);
		return f;
	}

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mIndex = getArguments() == null ? 0 : getArguments().getInt("index");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.second_pager_fragment, null);
		mText = (TextView) view.findViewById(R.id.subPagerTextView);
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		mText.setText("" + mIndex);
	}
}
