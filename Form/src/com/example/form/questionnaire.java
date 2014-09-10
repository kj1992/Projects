package com.example.form;

import com.example.adapter.pageradapter;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.app.ActionBar;

public class questionnaire extends FragmentActivity implements android.app.ActionBar.TabListener, OnPageChangeListener
{
	
	private ViewPager viewPager;
	private pageradapter mAdapter;
	private ActionBar actionBar;
	// Tab titles
	private String[] tabs = { "iHOT12", "EQ5D"};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.questionnairemain);

		// Initilization
		viewPager = (ViewPager) findViewById(R.id.pager);
		actionBar = this.getActionBar();
		mAdapter = new pageradapter(getSupportFragmentManager());
		viewPager.setOnPageChangeListener(this);
		viewPager.setAdapter(mAdapter);
		actionBar.setHomeButtonEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);		
		// Adding Tabs
		for (String tab_name : tabs) {
			actionBar.addTab(actionBar.newTab().setText(tab_name)
					.setTabListener(this));
	
		}
	}

	@Override
	public void onTabSelected(android.app.ActionBar.Tab tab,
			android.app.FragmentTransaction ft) {
		if(tab.getText().toString().equalsIgnoreCase("EQ5D"))
		{
			viewPager.setCurrentItem(1);
		}
		if(tab.getText().toString().equalsIgnoreCase("IHOT12"))
		{
			viewPager.setCurrentItem(0);
		}
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTabUnselected(android.app.ActionBar.Tab tab,
			android.app.FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onTabReselected(android.app.ActionBar.Tab tab,
			android.app.FragmentTransaction ft) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageSelected(int arg0) {
		if(actionBar.getTabAt(0)!=null){
		if(arg0==0)
			actionBar.selectTab(actionBar.getTabAt(0));
		else
			actionBar.selectTab(actionBar.getTabAt(1));}
		
	}

	

}
