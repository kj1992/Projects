package com.example.form;

import com.example.adapter.nonarthoplastyfragment;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;



public class nonarthoplasty extends ActionBarActivity  {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nonarthoplastymain);
		
		
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.nonarthoplastycontainer, new nonarthoplastyfragment()).commit();
			
		}

}
}