package com.example.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class pageradapter extends FragmentPagerAdapter {

	
	public pageradapter(FragmentManager fm) {
		super(fm);
	}



	@Override
	public Fragment getItem(int index) {

		switch (index) {
		
		case 0:
			
			return new ihot12fragment();
		case 1:
			
			return new eq5dfragment();
		
		}
          return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 2;
	}

}
