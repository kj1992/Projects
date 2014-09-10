package com.example.form;



import com.example.adapter.harrishipfragment;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class harrishipmain extends ActionBarActivity  {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.harrishipmain);
		
		
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.harrishipcontainer, new harrishipfragment()).commit();
			
		}

}
}