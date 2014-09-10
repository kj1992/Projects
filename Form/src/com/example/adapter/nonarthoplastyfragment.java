package com.example.adapter;

import com.example.form.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class nonarthoplastyfragment extends Fragment implements OnCheckedChangeListener, OnClickListener {

	CheckBox nonarthoplastys1q1c1, nonarthoplastys1q1c2, nonarthoplastys1q1c3, nonarthoplastys1q1c4, nonarthoplastys1q1c5, nonarthoplastys1q2c1, nonarthoplastys1q2c2, nonarthoplastys1q2c3, nonarthoplastys1q2c4, nonarthoplastys1q2c5, nonarthoplastys1q3c1, nonarthoplastys1q3c2, nonarthoplastys1q3c3, nonarthoplastys1q3c4,nonarthoplastys1q3c5,nonarthoplastys1q4c1, nonarthoplastys1q4c2, nonarthoplastys1q4c3, nonarthoplastys1q4c4, nonarthoplastys1q4c5, nonarthoplastys1q5c1, nonarthoplastys1q5c2, nonarthoplastys1q5c3, nonarthoplastys1q5c4, nonarthoplastys1q5c5, nonarthoplastys2q1c1, nonarthoplastys2q1c2, nonarthoplastys2q1c3, nonarthoplastys2q1c4, nonarthoplastys2q1c5, nonarthoplastys2q2c1,nonarthoplastys2q2c2,nonarthoplastys2q2c3,nonarthoplastys2q2c4,nonarthoplastys2q2c5, nonarthoplastys2q3c1, nonarthoplastys2q3c2, nonarthoplastys2q3c3, nonarthoplastys2q3c4, nonarthoplastys2q3c5, nonarthoplastys2q4c1, nonarthoplastys2q4c2, nonarthoplastys2q4c3, nonarthoplastys2q4c4, nonarthoplastys2q4c5, nonarthoplastys3q1c1,nonarthoplastys3q1c2,nonarthoplastys3q1c3, nonarthoplastys3q1c4, nonarthoplastys3q1c5, nonarthoplastys3q2c1, nonarthoplastys3q2c2, nonarthoplastys3q2c3, nonarthoplastys3q2c4, nonarthoplastys3q2c5, nonarthoplastys3q3c1,nonarthoplastys3q3c2, nonarthoplastys3q3c3, nonarthoplastys3q3c4, nonarthoplastys3q3c5,nonarthoplastys3q4c1, nonarthoplastys3q4c2, nonarthoplastys3q4c3, nonarthoplastys3q4c4, nonarthoplastys3q4c5, nonarthoplastys3q5c1, nonarthoplastys3q5c2, nonarthoplastys3q5c3, nonarthoplastys3q5c4, nonarthoplastys3q5c5, nonarthoplastys4q1c1, nonarthoplastys4q1c2, nonarthoplastys4q1c3, nonarthoplastys4q1c4, nonarthoplastys4q1c5, nonarthoplastys4q2c1, nonarthoplastys4q2c2, nonarthoplastys4q2c3, nonarthoplastys4q2c4, nonarthoplastys4q2c5, nonarthoplastys4q3c1,nonarthoplastys4q3c2, nonarthoplastys4q3c3,nonarthoplastys4q3c4, nonarthoplastys4q3c5, nonarthoplastys4q4c1, nonarthoplastys4q4c2, nonarthoplastys4q4c3, nonarthoplastys4q4c4,nonarthoplastys4q4c5, nonarthoplastys4q5c1, nonarthoplastys4q5c2, nonarthoplastys4q5c3, nonarthoplastys4q5c4, nonarthoplastys4q5c5, nonarthoplastys4q6c1, nonarthoplastys4q6c2, nonarthoplastys4q6c3, nonarthoplastys4q6c4, nonarthoplastys4q6c5;
	Button nonarthoplastycancel, nonarthoplastysave;
	int ch[];
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View rootView = inflater.inflate(R.layout.nonarthroplastyhip, container, false);
		//Sections 1
		nonarthoplastys1q1c1=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q1c1);
		nonarthoplastys1q1c2=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q1c2);
		nonarthoplastys1q1c3=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q1c3);
		nonarthoplastys1q1c4=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q1c4);
		nonarthoplastys1q1c5=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q1c5);
		
		nonarthoplastys1q2c1=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q2c1);
		nonarthoplastys1q2c2=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q2c2);
		nonarthoplastys1q2c3=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q2c3);
		nonarthoplastys1q2c4=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q2c4);
		nonarthoplastys1q2c5=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q2c5);
		
		nonarthoplastys1q3c1=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q3c1);
		nonarthoplastys1q3c2=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q3c2);
		nonarthoplastys1q3c3=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q3c3);
		nonarthoplastys1q3c4=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q3c4);
		nonarthoplastys1q3c5=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q3c5);
		
		nonarthoplastys1q4c1=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q4c1);
		nonarthoplastys1q4c2=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q4c2);
		nonarthoplastys1q4c3=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q4c3);
		nonarthoplastys1q4c4=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q4c4);
		nonarthoplastys1q4c5=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q4c5);
		
		nonarthoplastys1q5c1=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q5c1);
		nonarthoplastys1q5c2=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q5c2);
		nonarthoplastys1q5c3=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q5c3);
		nonarthoplastys1q5c4=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q5c4);
		nonarthoplastys1q5c5=(CheckBox)rootView.findViewById(R.id.nonarthoplastys1q5c5);
		
		//Section 2
		nonarthoplastys2q1c1=(CheckBox)rootView.findViewById(R.id.nonarthoplastys2q1c1);
		nonarthoplastys2q1c2=(CheckBox)rootView.findViewById(R.id.nonarthoplastys2q1c2);
		nonarthoplastys2q1c3=(CheckBox)rootView.findViewById(R.id.nonarthoplastys2q1c3);
		nonarthoplastys2q1c4=(CheckBox)rootView.findViewById(R.id.nonarthoplastys2q1c4);
		nonarthoplastys2q1c5=(CheckBox)rootView.findViewById(R.id.nonarthoplastys2q1c5);
		
		nonarthoplastys2q2c1=(CheckBox)rootView.findViewById(R.id.nonarthoplastys2q2c1);
		nonarthoplastys2q2c2=(CheckBox)rootView.findViewById(R.id.nonarthoplastys2q2c2);
		nonarthoplastys2q2c3=(CheckBox)rootView.findViewById(R.id.nonarthoplastys2q2c3);
		nonarthoplastys2q2c4=(CheckBox)rootView.findViewById(R.id.nonarthoplastys2q2c4);
		nonarthoplastys2q2c5=(CheckBox)rootView.findViewById(R.id.nonarthoplastys2q2c5);
		
		nonarthoplastys2q3c1=(CheckBox)rootView.findViewById(R.id.nonarthoplastys2q3c1);
		nonarthoplastys2q3c2=(CheckBox)rootView.findViewById(R.id.nonarthoplastys2q3c2);
		nonarthoplastys2q3c3=(CheckBox)rootView.findViewById(R.id.nonarthoplastys2q3c3);
		nonarthoplastys2q3c4=(CheckBox)rootView.findViewById(R.id.nonarthoplastys2q3c4);
		nonarthoplastys2q3c5=(CheckBox)rootView.findViewById(R.id.nonarthoplastys2q3c5);
		
		nonarthoplastys2q4c1=(CheckBox)rootView.findViewById(R.id.nonarthoplastys2q4c1);
		nonarthoplastys2q4c2=(CheckBox)rootView.findViewById(R.id.nonarthoplastys2q4c2);
		nonarthoplastys2q4c3=(CheckBox)rootView.findViewById(R.id.nonarthoplastys2q4c3);
		nonarthoplastys2q4c4=(CheckBox)rootView.findViewById(R.id.nonarthoplastys2q4c4);
		nonarthoplastys2q4c5=(CheckBox)rootView.findViewById(R.id.nonarthoplastys2q4c5);
		
		//Section 3
		nonarthoplastys3q1c1=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q1c1);
		nonarthoplastys3q1c2=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q1c2);
		nonarthoplastys3q1c3=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q1c3);
		nonarthoplastys3q1c4=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q1c4);
		nonarthoplastys3q1c5=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q1c5);
		
		nonarthoplastys3q2c1=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q2c1);
		nonarthoplastys3q2c2=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q2c2);
		nonarthoplastys3q2c3=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q2c3);
		nonarthoplastys3q2c4=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q2c4);
		nonarthoplastys3q2c5=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q2c5);
		
		nonarthoplastys3q3c1=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q3c1);
		nonarthoplastys3q3c2=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q3c2);
		nonarthoplastys3q3c3=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q3c3);
		nonarthoplastys3q3c4=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q3c4);
		nonarthoplastys3q3c5=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q3c5);
		
		nonarthoplastys3q4c1=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q4c1);
		nonarthoplastys3q4c2=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q4c2);
		nonarthoplastys3q4c3=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q4c3);
		nonarthoplastys3q4c4=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q4c4);
		nonarthoplastys3q4c5=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q4c5);
		
		nonarthoplastys3q5c1=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q5c1);
		nonarthoplastys3q5c2=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q5c2);
		nonarthoplastys3q5c3=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q5c3);
		nonarthoplastys3q5c4=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q5c4);
		nonarthoplastys3q5c5=(CheckBox)rootView.findViewById(R.id.nonarthoplastys3q5c5);
		
		
		//Section 4
		nonarthoplastys4q1c1=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q1c1);
		nonarthoplastys4q1c2=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q1c2);
		nonarthoplastys4q1c3=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q1c3);
		nonarthoplastys4q1c4=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q1c4);
		nonarthoplastys4q1c5=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q1c5);
		
		nonarthoplastys4q2c1=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q2c1);
		nonarthoplastys4q2c2=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q2c2);
		nonarthoplastys4q2c3=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q2c3);
		nonarthoplastys4q2c4=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q2c4);
		nonarthoplastys4q2c5=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q2c5);
		
		nonarthoplastys4q3c1=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q3c1);
		nonarthoplastys4q3c2=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q3c2);
		nonarthoplastys4q3c3=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q3c3);
		nonarthoplastys4q3c4=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q3c4);
		nonarthoplastys4q3c5=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q3c5);
		
		nonarthoplastys4q4c1=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q4c1);
		nonarthoplastys4q4c2=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q4c2);
		nonarthoplastys4q4c3=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q4c3);
		nonarthoplastys4q4c4=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q4c4);
		nonarthoplastys4q4c5=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q4c5);
		
		nonarthoplastys4q5c1=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q5c1);
		nonarthoplastys4q5c2=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q5c2);
		nonarthoplastys4q5c3=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q5c3);
		nonarthoplastys4q5c4=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q5c4);
		nonarthoplastys4q5c5=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q5c5);
		
		nonarthoplastys4q6c1=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q6c1);
		nonarthoplastys4q6c2=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q6c2);
		nonarthoplastys4q6c3=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q6c3);
		nonarthoplastys4q6c4=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q6c4);
		nonarthoplastys4q6c5=(CheckBox)rootView.findViewById(R.id.nonarthoplastys4q6c5);
		
		
		nonarthoplastysave=(Button)rootView.findViewById(R.id.nonarthoplastysave);
		nonarthoplastycancel=(Button)rootView.findViewById(R.id.nonarthoplastycancel);
		
		//setting listeners
		//Section 1
		nonarthoplastys1q1c1.setOnCheckedChangeListener(this);
		nonarthoplastys1q1c2.setOnCheckedChangeListener(this);
		nonarthoplastys1q1c3.setOnCheckedChangeListener(this);
		nonarthoplastys1q1c4.setOnCheckedChangeListener(this);
		nonarthoplastys1q1c5.setOnCheckedChangeListener(this);
		
		nonarthoplastys1q2c1.setOnCheckedChangeListener(this);
		nonarthoplastys1q2c2.setOnCheckedChangeListener(this);
		nonarthoplastys1q2c3.setOnCheckedChangeListener(this);
		nonarthoplastys1q2c4.setOnCheckedChangeListener(this);
		nonarthoplastys1q2c5.setOnCheckedChangeListener(this);
		
		nonarthoplastys1q3c1.setOnCheckedChangeListener(this);
		nonarthoplastys1q3c2.setOnCheckedChangeListener(this);
		nonarthoplastys1q3c3.setOnCheckedChangeListener(this);
		nonarthoplastys1q3c4.setOnCheckedChangeListener(this);
		nonarthoplastys1q3c5.setOnCheckedChangeListener(this);
		
		nonarthoplastys1q4c1.setOnCheckedChangeListener(this);
		nonarthoplastys1q4c2.setOnCheckedChangeListener(this);
		nonarthoplastys1q4c3.setOnCheckedChangeListener(this);
		nonarthoplastys1q4c4.setOnCheckedChangeListener(this);
		nonarthoplastys1q4c5.setOnCheckedChangeListener(this);
		
		nonarthoplastys1q5c1.setOnCheckedChangeListener(this);
		nonarthoplastys1q5c2.setOnCheckedChangeListener(this);
		nonarthoplastys1q5c3.setOnCheckedChangeListener(this);
		nonarthoplastys1q5c4.setOnCheckedChangeListener(this);
		nonarthoplastys1q5c5.setOnCheckedChangeListener(this);
		
		//Section 2
		nonarthoplastys2q1c1.setOnCheckedChangeListener(this);
		nonarthoplastys2q1c2.setOnCheckedChangeListener(this);
		nonarthoplastys2q1c3.setOnCheckedChangeListener(this);
		nonarthoplastys2q1c4.setOnCheckedChangeListener(this);
		nonarthoplastys2q1c5.setOnCheckedChangeListener(this);
		
		nonarthoplastys2q2c1.setOnCheckedChangeListener(this);
		nonarthoplastys2q2c2.setOnCheckedChangeListener(this);
		nonarthoplastys2q2c3.setOnCheckedChangeListener(this);
		nonarthoplastys2q2c4.setOnCheckedChangeListener(this);
		nonarthoplastys2q2c5.setOnCheckedChangeListener(this);
		
		nonarthoplastys2q3c1.setOnCheckedChangeListener(this);
		nonarthoplastys2q3c2.setOnCheckedChangeListener(this);
		nonarthoplastys2q3c3.setOnCheckedChangeListener(this);
		nonarthoplastys2q3c4.setOnCheckedChangeListener(this);
		nonarthoplastys2q3c5.setOnCheckedChangeListener(this);
		
		nonarthoplastys2q4c1.setOnCheckedChangeListener(this);
		nonarthoplastys2q4c2.setOnCheckedChangeListener(this);
		nonarthoplastys2q4c3.setOnCheckedChangeListener(this);
		nonarthoplastys2q4c4.setOnCheckedChangeListener(this);
		nonarthoplastys2q4c5.setOnCheckedChangeListener(this);
		
		//Section 3
		nonarthoplastys3q1c1.setOnCheckedChangeListener(this);
		nonarthoplastys3q1c2.setOnCheckedChangeListener(this);
		nonarthoplastys3q1c3.setOnCheckedChangeListener(this);
		nonarthoplastys3q1c4.setOnCheckedChangeListener(this);
		nonarthoplastys3q1c5.setOnCheckedChangeListener(this);
		
		nonarthoplastys3q2c1.setOnCheckedChangeListener(this);
		nonarthoplastys3q2c2.setOnCheckedChangeListener(this);
		nonarthoplastys3q2c3.setOnCheckedChangeListener(this);
		nonarthoplastys3q2c4.setOnCheckedChangeListener(this);
		nonarthoplastys3q2c5.setOnCheckedChangeListener(this);
		
		nonarthoplastys3q3c1.setOnCheckedChangeListener(this);
		nonarthoplastys3q3c2.setOnCheckedChangeListener(this);
		nonarthoplastys3q3c3.setOnCheckedChangeListener(this);
		nonarthoplastys3q3c4.setOnCheckedChangeListener(this);
		nonarthoplastys3q3c5.setOnCheckedChangeListener(this);
		
		nonarthoplastys3q4c1.setOnCheckedChangeListener(this);
		nonarthoplastys3q4c2.setOnCheckedChangeListener(this);
		nonarthoplastys3q4c3.setOnCheckedChangeListener(this);
		nonarthoplastys3q4c4.setOnCheckedChangeListener(this);
		nonarthoplastys3q4c5.setOnCheckedChangeListener(this);
		
		nonarthoplastys3q5c1.setOnCheckedChangeListener(this);
		nonarthoplastys3q5c2.setOnCheckedChangeListener(this);
		nonarthoplastys3q5c3.setOnCheckedChangeListener(this);
		nonarthoplastys3q5c4.setOnCheckedChangeListener(this);
		nonarthoplastys3q5c5.setOnCheckedChangeListener(this);
		
		//Section 4
		nonarthoplastys4q1c1.setOnCheckedChangeListener(this);
		nonarthoplastys4q1c2.setOnCheckedChangeListener(this);
		nonarthoplastys4q1c3.setOnCheckedChangeListener(this);
		nonarthoplastys4q1c4.setOnCheckedChangeListener(this);
		nonarthoplastys4q1c5.setOnCheckedChangeListener(this);
		
		nonarthoplastys4q2c1.setOnCheckedChangeListener(this);
		nonarthoplastys4q2c2.setOnCheckedChangeListener(this);
		nonarthoplastys4q2c3.setOnCheckedChangeListener(this);
		nonarthoplastys4q2c4.setOnCheckedChangeListener(this);
		nonarthoplastys4q2c5.setOnCheckedChangeListener(this);
		
		nonarthoplastys4q3c1.setOnCheckedChangeListener(this);
		nonarthoplastys4q3c2.setOnCheckedChangeListener(this);
		nonarthoplastys4q3c3.setOnCheckedChangeListener(this);
		nonarthoplastys4q3c4.setOnCheckedChangeListener(this);
		nonarthoplastys4q3c5.setOnCheckedChangeListener(this);
		
		nonarthoplastys4q4c1.setOnCheckedChangeListener(this);
		nonarthoplastys4q4c2.setOnCheckedChangeListener(this);
		nonarthoplastys4q4c3.setOnCheckedChangeListener(this);
		nonarthoplastys4q4c4.setOnCheckedChangeListener(this);
		nonarthoplastys4q4c5.setOnCheckedChangeListener(this);
		
		nonarthoplastys4q5c1.setOnCheckedChangeListener(this);
		nonarthoplastys4q5c2.setOnCheckedChangeListener(this);
		nonarthoplastys4q5c3.setOnCheckedChangeListener(this);
		nonarthoplastys4q5c4.setOnCheckedChangeListener(this);
		nonarthoplastys4q5c5.setOnCheckedChangeListener(this);
		
		nonarthoplastys4q6c1.setOnCheckedChangeListener(this);
		nonarthoplastys4q6c2.setOnCheckedChangeListener(this);
		nonarthoplastys4q6c3.setOnCheckedChangeListener(this);
		nonarthoplastys4q6c4.setOnCheckedChangeListener(this);
		nonarthoplastys4q6c5.setOnCheckedChangeListener(this);
		
		//Button adapters
		nonarthoplastysave.setOnClickListener(this);
		nonarthoplastycancel.setOnClickListener(this);
		ch=new int[20];
		return rootView;
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.nonarthoplastycancel: this.getActivity().finish();
		                                break;
		case R.id.nonarthoplastysave:break;
		}
		
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
	
		switch(buttonView.getId()){
		
		case R.id.nonarthoplastys1q1c1 : if(isChecked){
										 ch[0]=1;
										 nonarthoplastys1q1c2.setChecked(false);
										 nonarthoplastys1q1c3.setChecked(false);
										 nonarthoplastys1q1c4.setChecked(false);
										 nonarthoplastys1q1c5.setChecked(false);
		                                 }
										 else
									      ch[0]=0;		 
			                            break;
		
		case R.id.nonarthoplastys1q1c2 : if(isChecked){
			 ch[0]=2;
			 nonarthoplastys1q1c1.setChecked(false);
			 nonarthoplastys1q1c3.setChecked(false);
			 nonarthoplastys1q1c4.setChecked(false);
			 nonarthoplastys1q1c5.setChecked(false);
            }
			 else
		      ch[0]=0;		 
           break;
		
		case R.id.nonarthoplastys1q1c3 : if(isChecked){
			 ch[0]=3;
			 nonarthoplastys1q1c2.setChecked(false);
			 nonarthoplastys1q1c1.setChecked(false);
			 nonarthoplastys1q1c4.setChecked(false);
			 nonarthoplastys1q1c5.setChecked(false);
            }
			 else
		      ch[0]=0;		 
           break;
		
		case R.id.nonarthoplastys1q1c4 : if(isChecked){
			 ch[0]=4;
			 nonarthoplastys1q1c2.setChecked(false);
			 nonarthoplastys1q1c3.setChecked(false);
			 nonarthoplastys1q1c1.setChecked(false);
			 nonarthoplastys1q1c5.setChecked(false);
            }
			 else
		      ch[0]=0;		 
           break;
           
		case R.id.nonarthoplastys1q1c5 : if(isChecked){
			 ch[0]=5;
			 nonarthoplastys1q1c2.setChecked(false);
			 nonarthoplastys1q1c3.setChecked(false);
			 nonarthoplastys1q1c4.setChecked(false);
			 nonarthoplastys1q1c1.setChecked(false);
            }
			 else
		      ch[0]=0;		 
           break;    
		
		case R.id.nonarthoplastys1q2c1 : if(isChecked){
			 ch[1]=1;
			 nonarthoplastys1q2c2.setChecked(false);
			 nonarthoplastys1q2c3.setChecked(false);
			 nonarthoplastys1q2c4.setChecked(false);
			 nonarthoplastys1q2c5.setChecked(false);
            }
			 else
		      ch[1]=0;		 
           break;
		
		case R.id.nonarthoplastys1q2c2 : if(isChecked){
			 ch[1]=2;
			 nonarthoplastys1q2c1.setChecked(false);
			 nonarthoplastys1q2c3.setChecked(false);
			 nonarthoplastys1q2c4.setChecked(false);
			 nonarthoplastys1q2c5.setChecked(false);
           }
			 else
		      ch[1]=0;		 
          break;   
         
		case R.id.nonarthoplastys1q2c3 : if(isChecked){
			 ch[1]=3;
			 nonarthoplastys1q2c2.setChecked(false);
			 nonarthoplastys1q2c1.setChecked(false);
			 nonarthoplastys1q2c4.setChecked(false);
			 nonarthoplastys1q2c5.setChecked(false);
            }
			 else
		      ch[1]=0;		 
           break;   
        

		case R.id.nonarthoplastys1q2c4 : if(isChecked){
			 ch[1]=4;
			 nonarthoplastys1q2c2.setChecked(false);
			 nonarthoplastys1q2c3.setChecked(false);
			 nonarthoplastys1q2c1.setChecked(false);
			 nonarthoplastys1q2c5.setChecked(false);
            }
			 else
		      ch[1]=0;		 
           break;   
           
		case R.id.nonarthoplastys1q2c5 : if(isChecked){
			 ch[1]=5;
			 nonarthoplastys1q2c2.setChecked(false);
			 nonarthoplastys1q2c3.setChecked(false);
			 nonarthoplastys1q2c4.setChecked(false);
			 nonarthoplastys1q2c1.setChecked(false);
            }
			 else
		      ch[1]=0;		 
           break;   

		case R.id.nonarthoplastys1q3c1 : if(isChecked){
			 ch[2]=1;
			 nonarthoplastys1q3c2.setChecked(false);
			 nonarthoplastys1q3c3.setChecked(false);
			 nonarthoplastys1q3c4.setChecked(false);
			 nonarthoplastys1q3c5.setChecked(false);
            }
			 else
		      ch[2]=0;		 
           break;   

		case R.id.nonarthoplastys1q3c2 : if(isChecked){
			 ch[2]=2;
			 nonarthoplastys1q3c1.setChecked(false);
			 nonarthoplastys1q3c3.setChecked(false);
			 nonarthoplastys1q3c4.setChecked(false);
			 nonarthoplastys1q3c5.setChecked(false);
            }
			 else
		      ch[2]=0;		 
           break;   

		case R.id.nonarthoplastys1q3c3 : if(isChecked){
			 ch[2]=3;
			 nonarthoplastys1q3c2.setChecked(false);
			 nonarthoplastys1q3c1.setChecked(false);
			 nonarthoplastys1q3c4.setChecked(false);
			 nonarthoplastys1q3c5.setChecked(false);
            }
			 else
		      ch[2]=0;		 
           break;   
       

		case R.id.nonarthoplastys1q3c4 : if(isChecked){
			 ch[2]=4;
			 nonarthoplastys1q3c2.setChecked(false);
			 nonarthoplastys1q3c3.setChecked(false);
			 nonarthoplastys1q3c1.setChecked(false);
			 nonarthoplastys1q3c5.setChecked(false);
            }
			 else
		      ch[2]=0;		 
           break;   
       

		case R.id.nonarthoplastys1q3c5 : if(isChecked){
			 ch[2]=5;
			 nonarthoplastys1q3c2.setChecked(false);
			 nonarthoplastys1q3c3.setChecked(false);
			 nonarthoplastys1q3c4.setChecked(false);
			 nonarthoplastys1q3c1.setChecked(false);
            }
			 else
		      ch[2]=0;		 
           break;   

		case R.id.nonarthoplastys1q4c1 : if(isChecked){
			 ch[3]=1;
			 nonarthoplastys1q4c2.setChecked(false);
			 nonarthoplastys1q4c3.setChecked(false);
			 nonarthoplastys1q4c4.setChecked(false);
			 nonarthoplastys1q4c5.setChecked(false);
            }
			 else
		      ch[3]=0;		 
           break;   
       

		case R.id.nonarthoplastys1q4c2 : if(isChecked){
			 ch[3]=2;
			 nonarthoplastys1q4c1.setChecked(false);
			 nonarthoplastys1q4c3.setChecked(false);
			 nonarthoplastys1q4c4.setChecked(false);
			 nonarthoplastys1q4c5.setChecked(false);
            }
			 else
		      ch[3]=0;		 
           break;   

		case R.id.nonarthoplastys1q4c3 : if(isChecked){
			 ch[3]=3;
			 nonarthoplastys1q4c2.setChecked(false);
			 nonarthoplastys1q4c1.setChecked(false);
			 nonarthoplastys1q4c4.setChecked(false);
			 nonarthoplastys1q4c5.setChecked(false);
            }
			 else
		      ch[3]=0;		 
           break;   

		case R.id.nonarthoplastys1q4c4 : if(isChecked){
			 ch[3]=4;
			 nonarthoplastys1q4c2.setChecked(false);
			 nonarthoplastys1q4c3.setChecked(false);
			 nonarthoplastys1q4c1.setChecked(false);
			 nonarthoplastys1q4c5.setChecked(false);
            }
			 else
		      ch[3]=0;		 
           break;   

		case R.id.nonarthoplastys1q4c5 : if(isChecked){
			 ch[3]=5;
			 nonarthoplastys1q4c2.setChecked(false);
			 nonarthoplastys1q4c3.setChecked(false);
			 nonarthoplastys1q4c4.setChecked(false);
			 nonarthoplastys1q4c1.setChecked(false);
            }
			 else
		      ch[3]=0;		 
           break;   
       

		case R.id.nonarthoplastys1q5c1 : if(isChecked){
			 ch[4]=1;
			 nonarthoplastys1q5c2.setChecked(false);
			 nonarthoplastys1q5c3.setChecked(false);
			 nonarthoplastys1q5c4.setChecked(false);
			 nonarthoplastys1q5c5.setChecked(false);
            }
			 else
		      ch[4]=0;		 
           break;   
           

    		case R.id.nonarthoplastys1q5c2 : if(isChecked){
    			 ch[4]=2;
    			 nonarthoplastys1q5c1.setChecked(false);
    			 nonarthoplastys1q5c3.setChecked(false);
    			 nonarthoplastys1q5c4.setChecked(false);
    			 nonarthoplastys1q5c5.setChecked(false);
                }
    			 else
    		      ch[4]=0;		 
               break;   

    		case R.id.nonarthoplastys1q5c3 : if(isChecked){
    			 ch[4]=3;
    			 nonarthoplastys1q5c2.setChecked(false);
    			 nonarthoplastys1q5c1.setChecked(false);
    			 nonarthoplastys1q5c4.setChecked(false);
    			 nonarthoplastys1q5c5.setChecked(false);
                }
    			 else
    		      ch[4]=0;		 
               break;   
                  

    		case R.id.nonarthoplastys1q5c4 : if(isChecked){
    			 ch[4]=4;
    			 nonarthoplastys1q5c2.setChecked(false);
    			 nonarthoplastys1q5c3.setChecked(false);
    			 nonarthoplastys1q5c1.setChecked(false);
    			 nonarthoplastys1q5c5.setChecked(false);
                }
    			 else
    		      ch[4]=0;		 
               break;   
                  

    		case R.id.nonarthoplastys1q5c5 : if(isChecked){
    			 ch[4]=5;
    			 nonarthoplastys1q5c5.setChecked(false);
    			 nonarthoplastys1q5c3.setChecked(false);
    			 nonarthoplastys1q5c4.setChecked(false);
    			 nonarthoplastys1q5c1.setChecked(false);
                }
    			 else
    		      ch[4]=0;		 
               break;   
                  

    		case R.id.nonarthoplastys2q1c1 : if(isChecked){
    			 ch[5]=1;
    			 nonarthoplastys2q1c2.setChecked(false);
    			 nonarthoplastys2q1c3.setChecked(false);
    			 nonarthoplastys2q1c4.setChecked(false);
    			 nonarthoplastys2q1c5.setChecked(false);
                }
    			 else
    		      ch[5]=0;		 
               break;   

    		case R.id.nonarthoplastys2q1c2 : if(isChecked){
    			 ch[5]=2;
    			 nonarthoplastys2q1c1.setChecked(false);
    			 nonarthoplastys2q1c3.setChecked(false);
    			 nonarthoplastys2q1c4.setChecked(false);
    			 nonarthoplastys2q1c5.setChecked(false);
                }
    			 else
    		      ch[5]=0;		 
               break;   
                  

    		case R.id.nonarthoplastys2q1c3 : if(isChecked){
    			 ch[5]=3;
    			 nonarthoplastys2q1c2.setChecked(false);
    			 nonarthoplastys2q1c1.setChecked(false);
    			 nonarthoplastys2q1c4.setChecked(false);
    			 nonarthoplastys2q1c5.setChecked(false);
                }
    			 else
    		      ch[5]=0;		 
               break;   

    		case R.id.nonarthoplastys2q1c4 : if(isChecked){
    			 ch[5]=4;
    			 nonarthoplastys2q1c2.setChecked(false);
    			 nonarthoplastys2q1c3.setChecked(false);
    			 nonarthoplastys2q1c1.setChecked(false);
    			 nonarthoplastys2q1c5.setChecked(false);
                }
    			 else
    		      ch[5]=0;		 
               break;   
            

    		case R.id.nonarthoplastys2q1c5 : if(isChecked){
    			 ch[5]=5;
    			 nonarthoplastys2q1c2.setChecked(false);
    			 nonarthoplastys2q1c3.setChecked(false);
    			 nonarthoplastys2q1c4.setChecked(false);
    			 nonarthoplastys2q1c1.setChecked(false);
                }
    			 else
    		      ch[5]=0;		 
               break;   

    		case R.id.nonarthoplastys2q2c1 : if(isChecked){
    			 ch[6]=1;
    			 nonarthoplastys2q2c2.setChecked(false);
    			 nonarthoplastys2q2c3.setChecked(false);
    			 nonarthoplastys2q2c4.setChecked(false);
    			 nonarthoplastys2q2c5.setChecked(false);
                }
    			 else
    		      ch[6]=0;		 
               break;   

    		case R.id.nonarthoplastys2q2c2 : if(isChecked){
    			 ch[6]=2;
    			 nonarthoplastys2q2c1.setChecked(false);
    			 nonarthoplastys2q2c3.setChecked(false);
    			 nonarthoplastys2q2c4.setChecked(false);
    			 nonarthoplastys2q2c5.setChecked(false);
                }
    			 else
    		      ch[6]=0;		 
               break;   
            

    		case R.id.nonarthoplastys2q2c3 : if(isChecked){
    			 ch[6]=3;
    			 nonarthoplastys2q2c2.setChecked(false);
    			 nonarthoplastys2q2c1.setChecked(false);
    			 nonarthoplastys2q2c4.setChecked(false);
    			 nonarthoplastys2q2c5.setChecked(false);
                }
    			 else
    		      ch[6]=0;		 
               break;   

    		case R.id.nonarthoplastys2q2c4 : if(isChecked){
    			 ch[6]=4;
    			 nonarthoplastys2q2c2.setChecked(false);
    			 nonarthoplastys2q2c3.setChecked(false);
    			 nonarthoplastys2q2c1.setChecked(false);
    			 nonarthoplastys2q2c5.setChecked(false);
                }
    			 else
    		      ch[6]=0;		 
               break;   

    		case R.id.nonarthoplastys2q2c5 : if(isChecked){
    			 ch[6]=1;
    			 nonarthoplastys2q2c2.setChecked(false);
    			 nonarthoplastys2q2c3.setChecked(false);
    			 nonarthoplastys2q2c4.setChecked(false);
    			 nonarthoplastys2q2c1.setChecked(false);
                }
    			 else
    		      ch[6]=0;		 
               break;   

    		case R.id.nonarthoplastys2q3c1 : if(isChecked){
    			 ch[7]=1;
    			 nonarthoplastys2q3c2.setChecked(false);
    			 nonarthoplastys2q3c3.setChecked(false);
    			 nonarthoplastys2q3c4.setChecked(false);
    			 nonarthoplastys2q3c5.setChecked(false);
                }
    			 else
    		      ch[7]=0;		 
               break;   

    		case R.id.nonarthoplastys2q3c2 : if(isChecked){
    			 ch[7]=2;
    			 nonarthoplastys2q3c1.setChecked(false);
    			 nonarthoplastys2q3c3.setChecked(false);
    			 nonarthoplastys2q3c4.setChecked(false);
    			 nonarthoplastys2q3c5.setChecked(false);
                }
    			 else
    		      ch[7]=0;		 
               break;   
            

    		case R.id.nonarthoplastys2q3c3 : if(isChecked){
    			 ch[7]=3;
    			 nonarthoplastys2q3c2.setChecked(false);
    			 nonarthoplastys2q3c1.setChecked(false);
    			 nonarthoplastys2q3c4.setChecked(false);
    			 nonarthoplastys2q3c5.setChecked(false);
                }
    			 else
    		      ch[7]=0;		 
               break;   
            

    		case R.id.nonarthoplastys2q3c4 : if(isChecked){
    			 ch[7]=4;
    			 nonarthoplastys2q3c2.setChecked(false);
    			 nonarthoplastys2q3c3.setChecked(false);
    			 nonarthoplastys2q3c1.setChecked(false);
    			 nonarthoplastys2q3c5.setChecked(false);
                }
    			 else
    		      ch[7]=0;		 
               break;   

    		case R.id.nonarthoplastys2q3c5 : if(isChecked){
    			 ch[7]=5;
    			 nonarthoplastys2q3c2.setChecked(false);
    			 nonarthoplastys2q3c3.setChecked(false);
    			 nonarthoplastys2q3c4.setChecked(false);
    			 nonarthoplastys2q3c1.setChecked(false);
                }
    			 else
    		      ch[7]=0;		 
               break;   

    		case R.id.nonarthoplastys2q4c1 : if(isChecked){
    			 ch[8]=1;
    			 nonarthoplastys2q4c2.setChecked(false);
    			 nonarthoplastys2q4c3.setChecked(false);
    			 nonarthoplastys2q4c4.setChecked(false);
    			 nonarthoplastys2q4c5.setChecked(false);
                }
    			 else
    		      ch[8]=0;		 
               break;   

    		case R.id.nonarthoplastys2q4c2 : if(isChecked){
    			 ch[8]=2;
    			 nonarthoplastys2q4c1.setChecked(false);
    			 nonarthoplastys2q4c3.setChecked(false);
    			 nonarthoplastys2q4c4.setChecked(false);
    			 nonarthoplastys2q4c5.setChecked(false);
                }
    			 else
    		      ch[8]=0;		 
               break;   

    		case R.id.nonarthoplastys2q4c3 : if(isChecked){
    			 ch[8]=3;
    			 nonarthoplastys2q4c2.setChecked(false);
    			 nonarthoplastys2q4c1.setChecked(false);
    			 nonarthoplastys2q4c4.setChecked(false);
    			 nonarthoplastys2q4c5.setChecked(false);
                }
    			 else
    		      ch[8]=0;		 
               break;   

    		case R.id.nonarthoplastys2q4c4 : if(isChecked){
    			 ch[8]=4;
    			 nonarthoplastys2q4c2.setChecked(false);
    			 nonarthoplastys2q4c3.setChecked(false);
    			 nonarthoplastys2q4c1.setChecked(false);
    			 nonarthoplastys2q4c5.setChecked(false);
                }
    			 else
    		      ch[8]=0;		 
               break;   

    		case R.id.nonarthoplastys2q4c5 : if(isChecked){
    			 ch[8]=5;
    			 nonarthoplastys2q4c2.setChecked(false);
    			 nonarthoplastys2q4c3.setChecked(false);
    			 nonarthoplastys2q4c4.setChecked(false);
    			 nonarthoplastys2q4c1.setChecked(false);
                }
    			 else
    		      ch[8]=0;		 
               break;   

    		case R.id.nonarthoplastys3q1c1 : if(isChecked){
    			 ch[9]=1;
    			 nonarthoplastys3q1c2.setChecked(false);
    			 nonarthoplastys3q1c3.setChecked(false);
    			 nonarthoplastys3q1c4.setChecked(false);
    			 nonarthoplastys3q1c5.setChecked(false);
                }
    			 else
    		      ch[9]=0;		 
               break;   

    		case R.id.nonarthoplastys3q1c2 : if(isChecked){
    			 ch[9]=2;
    			 nonarthoplastys3q1c1.setChecked(false);
    			 nonarthoplastys3q1c3.setChecked(false);
    			 nonarthoplastys3q1c4.setChecked(false);
    			 nonarthoplastys3q1c5.setChecked(false);
                }
    			 else
    		      ch[9]=0;		 
               break;   

    		case R.id.nonarthoplastys3q1c3 : if(isChecked){
    			 ch[9]=3;
    			 nonarthoplastys3q1c2.setChecked(false);
    			 nonarthoplastys3q1c1.setChecked(false);
    			 nonarthoplastys3q1c4.setChecked(false);
    			 nonarthoplastys3q1c5.setChecked(false);
                }
    			 else
    		      ch[9]=0;		 
               break;   

    		case R.id.nonarthoplastys3q1c4 : if(isChecked){
    			 ch[9]=4;
    			 nonarthoplastys3q1c2.setChecked(false);
    			 nonarthoplastys3q1c3.setChecked(false);
    			 nonarthoplastys3q1c1.setChecked(false);
    			 nonarthoplastys3q1c5.setChecked(false);
                }
    			 else
    		      ch[9]=0;		 
               break;   

    		case R.id.nonarthoplastys3q1c5 : if(isChecked){
    			 ch[9]=5;
    			 nonarthoplastys3q1c2.setChecked(false);
    			 nonarthoplastys3q1c3.setChecked(false);
    			 nonarthoplastys3q1c4.setChecked(false);
    			 nonarthoplastys3q1c5.setChecked(false);
                }
    			 else
    		      ch[9]=0;		 
               break;   

    		case R.id.nonarthoplastys3q2c1 : if(isChecked){
    			 ch[10]=1;
    			 nonarthoplastys3q2c2.setChecked(false);
    			 nonarthoplastys3q2c3.setChecked(false);
    			 nonarthoplastys3q2c4.setChecked(false);
    			 nonarthoplastys3q2c5.setChecked(false);
                }
    			 else
    		      ch[10]=0;		 
               break;   

    		case R.id.nonarthoplastys3q2c2 : if(isChecked){
    			 ch[10]=2;
    			 nonarthoplastys3q2c1.setChecked(false);
    			 nonarthoplastys3q2c3.setChecked(false);
    			 nonarthoplastys3q2c4.setChecked(false);
    			 nonarthoplastys3q2c5.setChecked(false);
                }
    			 else
    		      ch[10]=0;		 
               break;   

    		case R.id.nonarthoplastys3q2c3 : if(isChecked){
    			 ch[10]=3;
    			 nonarthoplastys3q2c2.setChecked(false);
    			 nonarthoplastys3q2c1.setChecked(false);
    			 nonarthoplastys3q2c4.setChecked(false);
    			 nonarthoplastys3q2c5.setChecked(false);
                }
    			 else
    		      ch[10]=0;		 
               break;   

    		case R.id.nonarthoplastys3q2c4 : if(isChecked){
    			 ch[10]=4;
    			 nonarthoplastys3q2c2.setChecked(false);
    			 nonarthoplastys3q2c3.setChecked(false);
    			 nonarthoplastys3q2c1.setChecked(false);
    			 nonarthoplastys3q2c5.setChecked(false);
                }
    			 else
    		      ch[10]=0;		 
               break;   

    		case R.id.nonarthoplastys3q2c5 : if(isChecked){
    			 ch[10]=5;
    			 nonarthoplastys3q2c2.setChecked(false);
    			 nonarthoplastys3q2c3.setChecked(false);
    			 nonarthoplastys3q2c4.setChecked(false);
    			 nonarthoplastys3q2c1.setChecked(false);
                }
    			 else
    		      ch[10]=0;		 
               break;   

    		case R.id.nonarthoplastys3q3c1 : if(isChecked){
    			 ch[11]=1;
    			 nonarthoplastys3q3c2.setChecked(false);
    			 nonarthoplastys3q3c3.setChecked(false);
    			 nonarthoplastys3q3c4.setChecked(false);
    			 nonarthoplastys3q3c5.setChecked(false);
                }
    			 else
    		      ch[11]=0;		 
               break;   

    		case R.id.nonarthoplastys3q3c2 : if(isChecked){
    			 ch[11]=2;
    			 nonarthoplastys3q3c1.setChecked(false);
    			 nonarthoplastys3q3c3.setChecked(false);
    			 nonarthoplastys3q3c4.setChecked(false);
    			 nonarthoplastys3q3c5.setChecked(false);
                }
    			 else
    		      ch[11]=0;		 
               break;   

    		case R.id.nonarthoplastys3q3c3 : if(isChecked){
    			 ch[11]=3;
    			 nonarthoplastys3q3c2.setChecked(false);
    			 nonarthoplastys3q3c1.setChecked(false);
    			 nonarthoplastys3q3c4.setChecked(false);
    			 nonarthoplastys3q3c5.setChecked(false);
                }
    			 else
    		      ch[11]=0;		 
               break;   

    		case R.id.nonarthoplastys3q3c4 : if(isChecked){
    			 ch[11]=4;
    			 nonarthoplastys3q3c2.setChecked(false);
    			 nonarthoplastys3q3c3.setChecked(false);
    			 nonarthoplastys3q3c1.setChecked(false);
    			 nonarthoplastys3q3c5.setChecked(false);
                }
    			 else
    		      ch[11]=0;		 
               break;   

    		case R.id.nonarthoplastys3q3c5 : if(isChecked){
    			 ch[11]=5;
    			 nonarthoplastys3q3c2.setChecked(false);
    			 nonarthoplastys3q3c3.setChecked(false);
    			 nonarthoplastys3q3c4.setChecked(false);
    			 nonarthoplastys3q3c1.setChecked(false);
                }
    			 else
    		      ch[11]=0;		 
               break;   
               

    		case R.id.nonarthoplastys3q4c1 : if(isChecked){
    			 ch[12]=1;
    			 nonarthoplastys3q4c2.setChecked(false);
    			 nonarthoplastys3q4c3.setChecked(false);
    			 nonarthoplastys3q4c4.setChecked(false);
    			 nonarthoplastys3q4c5.setChecked(false);
                }
    			 else
    		      ch[12]=0;		 
               break;   

    		case R.id.nonarthoplastys3q4c2 : if(isChecked){
    			 ch[12]=2;
    			 nonarthoplastys3q4c1.setChecked(false);
    			 nonarthoplastys3q4c3.setChecked(false);
    			 nonarthoplastys3q4c4.setChecked(false);
    			 nonarthoplastys3q4c5.setChecked(false);
                }
    			 else
    		      ch[12]=0;		 
               break;   

    		case R.id.nonarthoplastys3q4c3 : if(isChecked){
    			 ch[12]=3;
    			 nonarthoplastys3q4c2.setChecked(false);
    			 nonarthoplastys3q4c1.setChecked(false);
    			 nonarthoplastys3q4c4.setChecked(false);
    			 nonarthoplastys3q4c5.setChecked(false);
                }
    			 else
    		      ch[12]=0;		 
               break;   

    		case R.id.nonarthoplastys3q4c4 : if(isChecked){
    			 ch[12]=4;
    			 nonarthoplastys3q4c2.setChecked(false);
    			 nonarthoplastys3q4c3.setChecked(false);
    			 nonarthoplastys3q4c1.setChecked(false);
    			 nonarthoplastys3q4c5.setChecked(false);
                }
    			 else
    		      ch[12]=0;		 
               break;   

    		case R.id.nonarthoplastys3q4c5 : if(isChecked){
    			 ch[12]=5;
    			 nonarthoplastys3q4c2.setChecked(false);
    			 nonarthoplastys3q4c3.setChecked(false);
    			 nonarthoplastys3q4c4.setChecked(false);
    			 nonarthoplastys3q4c1.setChecked(false);
                }
    			 else
    		      ch[12]=0;		 
               break;   

    		case R.id.nonarthoplastys3q5c1 : if(isChecked){
    			 ch[13]=1;
    			 nonarthoplastys3q5c2.setChecked(false);
    			 nonarthoplastys3q5c3.setChecked(false);
    			 nonarthoplastys3q5c4.setChecked(false);
    			 nonarthoplastys3q5c5.setChecked(false);
                }
    			 else
    		      ch[13]=0;		 
               break;   

    		case R.id.nonarthoplastys3q5c2 : if(isChecked){
    			 ch[13]=2;
    			 nonarthoplastys3q5c1.setChecked(false);
    			 nonarthoplastys3q5c3.setChecked(false);
    			 nonarthoplastys3q5c4.setChecked(false);
    			 nonarthoplastys3q5c5.setChecked(false);
                }
    			 else
    		      ch[13]=0;		 
               break;   

    		case R.id.nonarthoplastys3q5c3 : if(isChecked){
    			 ch[13]=3;
    			 nonarthoplastys3q5c2.setChecked(false);
    			 nonarthoplastys3q5c1.setChecked(false);
    			 nonarthoplastys3q5c4.setChecked(false);
    			 nonarthoplastys3q5c5.setChecked(false);
                }
    			 else
    		      ch[13]=0;		 
               break;   

    		case R.id.nonarthoplastys3q5c4 : if(isChecked){
    			 ch[13]=4;
    			 nonarthoplastys3q5c2.setChecked(false);
    			 nonarthoplastys3q5c3.setChecked(false);
    			 nonarthoplastys3q5c1.setChecked(false);
    			 nonarthoplastys3q5c5.setChecked(false);
                }
    			 else
    		      ch[13]=0;		 
               break;   

    		case R.id.nonarthoplastys3q5c5 : if(isChecked){
    			 ch[13]=5;
    			 nonarthoplastys3q5c2.setChecked(false);
    			 nonarthoplastys3q5c3.setChecked(false);
    			 nonarthoplastys3q5c4.setChecked(false);
    			 nonarthoplastys3q5c1.setChecked(false);
                }
    			 else
    		      ch[13]=0;		 
               break;   
           

    		case R.id.nonarthoplastys4q1c1 : if(isChecked){
    			 ch[14]=1;
    			 nonarthoplastys4q1c2.setChecked(false);
    			 nonarthoplastys4q1c3.setChecked(false);
    			 nonarthoplastys4q1c4.setChecked(false);
    			 nonarthoplastys4q1c5.setChecked(false);
                }
    			 else
    		      ch[14]=0;		 
               break;   

    		case R.id.nonarthoplastys4q1c2 : if(isChecked){
    			 ch[14]=2;
    			 nonarthoplastys4q1c1.setChecked(false);
    			 nonarthoplastys4q1c3.setChecked(false);
    			 nonarthoplastys4q1c4.setChecked(false);
    			 nonarthoplastys4q1c5.setChecked(false);
                }
    			 else
    		      ch[14]=0;		 
               break;   

    		case R.id.nonarthoplastys4q1c3 : if(isChecked){
    			 ch[14]=3;
    			 nonarthoplastys4q1c2.setChecked(false);
    			 nonarthoplastys4q1c1.setChecked(false);
    			 nonarthoplastys4q1c4.setChecked(false);
    			 nonarthoplastys4q1c5.setChecked(false);
                }
    			 else
    		      ch[14]=0;		 
               break;   

    		case R.id.nonarthoplastys4q1c4 : if(isChecked){
    			 ch[14]=4;
    			 nonarthoplastys4q1c2.setChecked(false);
    			 nonarthoplastys4q1c3.setChecked(false);
    			 nonarthoplastys4q1c1.setChecked(false);
    			 nonarthoplastys4q1c5.setChecked(false);
                }
    			 else
    		      ch[14]=0;		 
               break;   

    		case R.id.nonarthoplastys4q1c5 : if(isChecked){
    			 ch[14]=5;
    			 nonarthoplastys4q1c2.setChecked(false);
    			 nonarthoplastys4q1c3.setChecked(false);
    			 nonarthoplastys4q1c4.setChecked(false);
    			 nonarthoplastys4q1c1.setChecked(false);
                }
    			 else
    		      ch[14]=0;		 
               break;   

    		case R.id.nonarthoplastys4q2c1 : if(isChecked){
    			 ch[15]=1;
    			 nonarthoplastys4q2c2.setChecked(false);
    			 nonarthoplastys4q2c3.setChecked(false);
    			 nonarthoplastys4q2c4.setChecked(false);
    			 nonarthoplastys4q2c5.setChecked(false);
                }
    			 else
    		      ch[15]=0;		 
               break;   

    		case R.id.nonarthoplastys4q2c2 : if(isChecked){
    			 ch[15]=2;
    			 nonarthoplastys4q2c1.setChecked(false);
    			 nonarthoplastys4q2c3.setChecked(false);
    			 nonarthoplastys4q2c4.setChecked(false);
    			 nonarthoplastys4q2c5.setChecked(false);
                }
    			 else
    		      ch[15]=0;		 
               break;   

    		case R.id.nonarthoplastys4q2c3 : if(isChecked){
    			 ch[15]=3;
    			 nonarthoplastys4q2c2.setChecked(false);
    			 nonarthoplastys4q2c1.setChecked(false);
    			 nonarthoplastys4q2c4.setChecked(false);
    			 nonarthoplastys4q2c5.setChecked(false);
                }
    			 else
    		      ch[15]=0;		 
               break;   

    		case R.id.nonarthoplastys4q2c4 : if(isChecked){
    			 ch[15]=4;
    			 nonarthoplastys4q2c2.setChecked(false);
    			 nonarthoplastys4q2c3.setChecked(false);
    			 nonarthoplastys4q2c1.setChecked(false);
    			 nonarthoplastys4q2c5.setChecked(false);
                }
    			 else
    		      ch[15]=0;		 
               break;   

    		case R.id.nonarthoplastys4q2c5 : if(isChecked){
    			 ch[15]=5;
    			 nonarthoplastys4q2c2.setChecked(false);
    			 nonarthoplastys4q2c3.setChecked(false);
    			 nonarthoplastys4q2c4.setChecked(false);
    			 nonarthoplastys4q2c1.setChecked(false);
                }
    			 else
    		      ch[15]=0;		 
               break;   

    		case R.id.nonarthoplastys4q3c1 : if(isChecked){
    			 ch[16]=1;
    			 nonarthoplastys4q3c2.setChecked(false);
    			 nonarthoplastys4q3c3.setChecked(false);
    			 nonarthoplastys4q3c4.setChecked(false);
    			 nonarthoplastys4q3c5.setChecked(false);
                }
    			 else
    		      ch[16]=0;		 
               break;   

    		case R.id.nonarthoplastys4q3c2 : if(isChecked){
    			 ch[16]=2;
    			 nonarthoplastys4q3c1.setChecked(false);
    			 nonarthoplastys4q3c3.setChecked(false);
    			 nonarthoplastys4q3c4.setChecked(false);
    			 nonarthoplastys4q3c5.setChecked(false);
                }
    			 else
    		      ch[16]=0;		 
               break;   

    		case R.id.nonarthoplastys4q3c3 : if(isChecked){
    			 ch[16]=3;
    			 nonarthoplastys4q3c2.setChecked(false);
    			 nonarthoplastys4q3c1.setChecked(false);
    			 nonarthoplastys4q3c4.setChecked(false);
    			 nonarthoplastys4q3c5.setChecked(false);
                }
    			 else
    		      ch[16]=0;		 
               break;   

    		case R.id.nonarthoplastys4q3c4 : if(isChecked){
    			 ch[16]=4;
    			 nonarthoplastys4q3c2.setChecked(false);
    			 nonarthoplastys4q3c3.setChecked(false);
    			 nonarthoplastys4q3c1.setChecked(false);
    			 nonarthoplastys4q3c5.setChecked(false);
                }
    			 else
    		      ch[16]=0;		 
               break;   

    		case R.id.nonarthoplastys4q3c5 : if(isChecked){
    			 ch[16]=5;
    			 nonarthoplastys4q3c2.setChecked(false);
    			 nonarthoplastys4q3c3.setChecked(false);
    			 nonarthoplastys4q3c4.setChecked(false);
    			 nonarthoplastys4q3c1.setChecked(false);
                }
    			 else
    		      ch[16]=0;		 
               break;   

    		case R.id.nonarthoplastys4q4c1 : if(isChecked){
    			 ch[17]=1;
    			 nonarthoplastys4q4c2.setChecked(false);
    			 nonarthoplastys4q4c3.setChecked(false);
    			 nonarthoplastys4q4c4.setChecked(false);
    			 nonarthoplastys4q4c5.setChecked(false);
                }
    			 else
    		      ch[17]=0;		 
               break;   

    		case R.id.nonarthoplastys4q4c2 : if(isChecked){
    			 ch[17]=2;
    			 nonarthoplastys4q4c1.setChecked(false);
    			 nonarthoplastys4q4c3.setChecked(false);
    			 nonarthoplastys4q4c4.setChecked(false);
    			 nonarthoplastys4q4c5.setChecked(false);
                }
    			 else
    		      ch[17]=0;		 
               break;   

    		case R.id.nonarthoplastys4q4c3 : if(isChecked){
    			 ch[17]=3;
    			 nonarthoplastys4q4c2.setChecked(false);
    			 nonarthoplastys4q4c1.setChecked(false);
    			 nonarthoplastys4q4c4.setChecked(false);
    			 nonarthoplastys4q4c5.setChecked(false);
                }
    			 else
    		      ch[17]=0;		 
               break;   

    		case R.id.nonarthoplastys4q4c4 : if(isChecked){
    			 ch[17]=4;
    			 nonarthoplastys4q4c2.setChecked(false);
    			 nonarthoplastys4q4c3.setChecked(false);
    			 nonarthoplastys4q4c1.setChecked(false);
    			 nonarthoplastys4q4c5.setChecked(false);
                }
    			 else
    		      ch[17]=0;		 
               break;   

    		case R.id.nonarthoplastys4q4c5 : if(isChecked){
    			 ch[17]=5;
    			 nonarthoplastys4q4c2.setChecked(false);
    			 nonarthoplastys4q4c3.setChecked(false);
    			 nonarthoplastys4q4c4.setChecked(false);
    			 nonarthoplastys4q4c1.setChecked(false);
                }
    			 else
    		      ch[17]=0;		 
               break;   

    		case R.id.nonarthoplastys4q5c1 : if(isChecked){
    			 ch[18]=1;
    			 nonarthoplastys4q5c2.setChecked(false);
    			 nonarthoplastys4q5c3.setChecked(false);
    			 nonarthoplastys4q5c4.setChecked(false);
    			 nonarthoplastys4q5c5.setChecked(false);
                }
    			 else
    		      ch[18]=0;		 
               break;   

    		case R.id.nonarthoplastys4q5c2 : if(isChecked){
    			 ch[18]=2;
    			 nonarthoplastys4q5c1.setChecked(false);
    			 nonarthoplastys4q5c3.setChecked(false);
    			 nonarthoplastys4q5c4.setChecked(false);
    			 nonarthoplastys4q5c5.setChecked(false);
                }
    			 else
    		      ch[18]=0;		 
               break;   

    		case R.id.nonarthoplastys4q5c3 : if(isChecked){
    			 ch[18]=3;
    			 nonarthoplastys4q5c2.setChecked(false);
    			 nonarthoplastys4q5c1.setChecked(false);
    			 nonarthoplastys4q5c4.setChecked(false);
    			 nonarthoplastys4q5c5.setChecked(false);
                }
    			 else
    		      ch[18]=0;		 
               break;   

    		case R.id.nonarthoplastys4q5c4 : if(isChecked){
    			 ch[18]=4;
    			 nonarthoplastys4q5c2.setChecked(false);
    			 nonarthoplastys4q5c3.setChecked(false);
    			 nonarthoplastys4q5c1.setChecked(false);
    			 nonarthoplastys4q5c5.setChecked(false);
                }
    			 else
    		      ch[18]=0;		 
               break;   

    		case R.id.nonarthoplastys4q5c5 : if(isChecked){
    			 ch[18]=5;
    			 nonarthoplastys4q5c2.setChecked(false);
    			 nonarthoplastys4q5c3.setChecked(false);
    			 nonarthoplastys4q5c4.setChecked(false);
    			 nonarthoplastys4q5c1.setChecked(false);
                }
    			 else
    		      ch[18]=0;		 
               break;   
          

    		case R.id.nonarthoplastys4q6c1 : if(isChecked){
    			 ch[19]=1;
    			 nonarthoplastys4q6c2.setChecked(false);
    			 nonarthoplastys4q6c3.setChecked(false);
    			 nonarthoplastys4q6c4.setChecked(false);
    			 nonarthoplastys4q6c5.setChecked(false);
                }
    			 else
    		      ch[19]=0;		 
               break;   

    		case R.id.nonarthoplastys4q6c2 : if(isChecked){
    			 ch[19]=2;
    			 nonarthoplastys4q6c1.setChecked(false);
    			 nonarthoplastys4q6c3.setChecked(false);
    			 nonarthoplastys4q6c4.setChecked(false);
    			 nonarthoplastys4q6c5.setChecked(false);
                }
    			 else
    		      ch[19]=0;		 
               break;   

    		case R.id.nonarthoplastys4q6c3 : if(isChecked){
    			 ch[19]=3;
    			 nonarthoplastys4q6c2.setChecked(false);
    			 nonarthoplastys4q6c1.setChecked(false);
    			 nonarthoplastys4q6c4.setChecked(false);
    			 nonarthoplastys4q6c5.setChecked(false);
                }
    			 else
    		      ch[19]=0;		 
               break;   

    		case R.id.nonarthoplastys4q6c4 : if(isChecked){
    			 ch[19]=4;
    			 nonarthoplastys4q6c2.setChecked(false);
    			 nonarthoplastys4q6c3.setChecked(false);
    			 nonarthoplastys4q6c1.setChecked(false);
    			 nonarthoplastys4q6c5.setChecked(false);
                }
    			 else
    		      ch[19]=0;		 
               break;   
                                                                         

    		case R.id.nonarthoplastys4q6c5 : if(isChecked){
    			 ch[19]=5;
    			 nonarthoplastys4q6c2.setChecked(false);
    			 nonarthoplastys4q6c3.setChecked(false);
    			 nonarthoplastys4q6c4.setChecked(false);
    			 nonarthoplastys4q6c1.setChecked(false);
                }
    			 else
    		      ch[19]=0;		 
               break;   
                    



		
		}
		
		
	}

}
