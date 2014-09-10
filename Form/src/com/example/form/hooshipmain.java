package com.example.form;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.example.adapter.harrishipfragment;

public class hooshipmain extends ActionBarActivity  {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hooshipmain);
		
		
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.hooshipcontainer, new harrishipfragment()).commit();
			
		}

}
}