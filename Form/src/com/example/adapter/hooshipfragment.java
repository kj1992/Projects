package com.example.adapter;

import com.example.form.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class hooshipfragment extends Fragment implements OnClickListener, OnCheckedChangeListener {

	 CheckBox hooships1q1c1, hooships1q1c2, hooships1q1c3, hooships1q1c4, hooships1q1c5, hooships1q2c1, hooships1q2c2, hooships1q2c3, hooships1q2c4, hooships1q2c5, hooships1q3c1, hooships1q3c2, hooships1q3c3, hooships1q3c4, hooships1q3c5, hooships1q4c1,hooships1q4c2, hooships1q4c3, hooships1q4c4, hooships1q4c5, hooships1q5c1, hooships1q5c2, hooships1q5c3, hooships1q5c4, hooships1q5c5, hooships1q6c1, hooships1q6c2, hooships1q6c3, hooships1q6c4, hooships1q6c5, hooships1q7c1, hooships1q7c2, hooships1q7c3, hooships1q7c4, hooships1q7c5, hooships1q8c1, hooships1q8c2, hooships1q8c3, hooships1q8c4, hooships1q8c5, hooships1q9c1, hooships1q9c2, hooships1q9c3, hooships1q9c4, hooships1q9c5, hooships1q10c1, hooships1q10c2, hooships1q10c3, hooships1q10c4, hooships1q10c5, hooships1q11c1, hooships1q11c2, hooships1q11c3, hooships1q11c4, hooships1q11c5, hooships1q12c1, hooships1q12c2, hooships1q12c3, hooships1q12c4, hooships1q12c5, hooships1q13c1, hooships1q13c2, hooships1q13c3, hooships1q13c4, hooships1q13c5, hooships1q14c1, hooships1q14c2, hooships1q14c3, hooships1q14c4, hooships1q14c5, hooships1q15c1, hooships1q15c2, hooships1q15c3, hooships1q15c4, hooships1q15c5, hooships2q1c1, hooships2q1c2, hooships2q1c3, hooships2q1c4, hooships2q1c5, hooships2q2c1, hooships2q2c2, hooships2q2c3, hooships2q2c4, hooships2q2c5, hooships2q3c1, hooships2q3c2, hooships2q3c3, hooships2q3c4, hooships2q3c5, hooships2q4c1, hooships2q4c2, hooships2q4c3, hooships2q4c4, hooships2q4c5, hooships2q5c1, hooships2q5c2, hooships2q5c3, hooships2q5c4, hooships2q5c5, hooships2q6c1, hooships2q6c2, hooships2q6c3, hooships2q6c4, hooships2q6c5, hooships2q7c1, hooships2q7c2, hooships2q7c3, hooships2q7c4, hooships2q7c5, hooships2q8c1, hooships2q8c2, hooships2q8c3, hooships2q8c4, hooships2q8c5, hooships2q9c1, hooships2q9c2, hooships2q9c3, hooships2q9c4, hooships2q9c5, hooships2q10c1, hooships2q10c2, hooships2q10c3, hooships2q10c4, hooships2q10c5, hooships2q11c1, hooships2q11c2, hooships2q11c3, hooships2q11c4, hooships2q11c5, hooships2q12c1, hooships2q12c2, hooships2q12c3, hooships2q12c4, hooships2q12c5, hooships2q13c1, hooships2q13c2, hooships2q13c3, hooships2q13c4, hooships2q13c5, hooships2q14c1, hooships2q14c2, hooships2q14c3, hooships2q14c4, hooships2q14c5, hooships2q15c1, hooships2q15c2, hooships2q15c3, hooships2q15c4, hooships2q15c5, hooships2q16c1, hooships2q16c2, hooships2q16c3, hooships2q16c4, hooships2q16c5, hooships2q17c1, hooships2q17c2, hooships2q17c3, hooships2q17c4, hooships2q17c5, hooships3q1c1, hooships3q1c2, hooships3q1c3, hooships3q1c4, hooships3q1c5, hooships3q2c1, hooships3q2c2, hooships3q2c3, hooships3q2c4, hooships3q2c5, hooships3q3c1, hooships3q3c2, hooships3q3c3, hooships3q3c4, hooships3q3c5, hooships3q4c1, hooships3q4c2, hooships3q4c3, hooships3q4c4, hooships3q4c5, hooships3q5c1, hooships3q5c2, hooships3q5c3, hooships3q5c4, hooships3q5c5, hooships3q6c1, hooships3q6c2, hooships3q6c3, hooships3q6c4, hooships3q6c5, hooships3q7c1, hooships3q7c2, hooships3q7c3, hooships3q7c4, hooships3q7c5, hooships3q8c1, hooships3q8c2, hooships3q8c3, hooships3q8c4, hooships3q8c5;
	 Button hooshipsave, hooshipcancel;
	 int ch[];
	 public View onCreateView(LayoutInflater inflater, ViewGroup container,
	            Bundle savedInstanceState) {
		 View rootView = inflater.inflate(R.layout.hooshipfragment, container, false);
		 //Section 1
		 hooships1q1c1=(CheckBox)rootView.findViewById(R.id.hooships1q1c1);
		 hooships1q1c2=(CheckBox)rootView.findViewById(R.id.hooships1q1c2);
		 hooships1q1c3=(CheckBox)rootView.findViewById(R.id.hooships1q1c3);
		 hooships1q1c4=(CheckBox)rootView.findViewById(R.id.hooships1q1c4);
		 hooships1q1c5=(CheckBox)rootView.findViewById(R.id.hooships1q1c5);
		 
		 hooships1q2c1=(CheckBox)rootView.findViewById(R.id.hooships1q2c1);
		 hooships1q2c2=(CheckBox)rootView.findViewById(R.id.hooships1q2c2);
		 hooships1q2c3=(CheckBox)rootView.findViewById(R.id.hooships1q2c3);
		 hooships1q2c4=(CheckBox)rootView.findViewById(R.id.hooships1q2c4);
		 hooships1q2c5=(CheckBox)rootView.findViewById(R.id.hooships1q2c5);
		 
		 hooships1q3c1=(CheckBox)rootView.findViewById(R.id.hooships1q3c1);
		 hooships1q3c2=(CheckBox)rootView.findViewById(R.id.hooships1q3c2);
		 hooships1q3c3=(CheckBox)rootView.findViewById(R.id.hooships1q3c3);
		 hooships1q3c4=(CheckBox)rootView.findViewById(R.id.hooships1q3c4);
		 hooships1q3c5=(CheckBox)rootView.findViewById(R.id.hooships1q3c5);
		 
		 hooships1q4c1=(CheckBox)rootView.findViewById(R.id.hooships1q4c1);
		 hooships1q4c2=(CheckBox)rootView.findViewById(R.id.hooships1q4c2);
		 hooships1q4c3=(CheckBox)rootView.findViewById(R.id.hooships1q4c3);
		 hooships1q4c4=(CheckBox)rootView.findViewById(R.id.hooships1q4c4);
		 hooships1q4c1=(CheckBox)rootView.findViewById(R.id.hooships1q4c5);
		 
		 hooships1q5c1=(CheckBox)rootView.findViewById(R.id.hooships1q5c1);
		 hooships1q5c2=(CheckBox)rootView.findViewById(R.id.hooships1q5c2);
		 hooships1q5c3=(CheckBox)rootView.findViewById(R.id.hooships1q5c3);
		 hooships1q5c4=(CheckBox)rootView.findViewById(R.id.hooships1q5c4);
		 hooships1q5c5=(CheckBox)rootView.findViewById(R.id.hooships1q5c5);
		 
		 hooships1q6c1=(CheckBox)rootView.findViewById(R.id.hooships1q6c1);
		 hooships1q6c2=(CheckBox)rootView.findViewById(R.id.hooships1q6c2);
		 hooships1q6c3=(CheckBox)rootView.findViewById(R.id.hooships1q6c3);
		 hooships1q6c4=(CheckBox)rootView.findViewById(R.id.hooships1q6c4);
		 hooships1q6c5=(CheckBox)rootView.findViewById(R.id.hooships1q6c5);
		 
		 hooships1q7c1=(CheckBox)rootView.findViewById(R.id.hooships1q7c1);
		 hooships1q7c2=(CheckBox)rootView.findViewById(R.id.hooships1q7c2);
		 hooships1q7c3=(CheckBox)rootView.findViewById(R.id.hooships1q7c3);
		 hooships1q7c4=(CheckBox)rootView.findViewById(R.id.hooships1q7c4);
		 hooships1q7c5=(CheckBox)rootView.findViewById(R.id.hooships1q7c5);
		 
		 hooships1q8c1=(CheckBox)rootView.findViewById(R.id.hooships1q8c1);
		 hooships1q8c2=(CheckBox)rootView.findViewById(R.id.hooships1q8c2);
		 hooships1q8c3=(CheckBox)rootView.findViewById(R.id.hooships1q8c3);
		 hooships1q8c4=(CheckBox)rootView.findViewById(R.id.hooships1q8c4);
		 hooships1q8c5=(CheckBox)rootView.findViewById(R.id.hooships1q8c5);
		 
		 hooships1q9c1=(CheckBox)rootView.findViewById(R.id.hooships1q9c1);
		 hooships1q9c2=(CheckBox)rootView.findViewById(R.id.hooships1q9c2);
		 hooships1q9c3=(CheckBox)rootView.findViewById(R.id.hooships1q9c3);
		 hooships1q9c4=(CheckBox)rootView.findViewById(R.id.hooships1q9c4);
		 hooships1q9c5=(CheckBox)rootView.findViewById(R.id.hooships1q9c5);
		 
		 hooships1q10c1=(CheckBox)rootView.findViewById(R.id.hooships1q10c1);
		 hooships1q10c2=(CheckBox)rootView.findViewById(R.id.hooships1q10c2);
		 hooships1q10c3=(CheckBox)rootView.findViewById(R.id.hooships1q10c3);
		 hooships1q10c4=(CheckBox)rootView.findViewById(R.id.hooships1q10c4);
		 hooships1q10c5=(CheckBox)rootView.findViewById(R.id.hooships1q10c5);
		 
		 hooships1q11c1=(CheckBox)rootView.findViewById(R.id.hooships1q11c1);
		 hooships1q11c2=(CheckBox)rootView.findViewById(R.id.hooships1q11c2);
		 hooships1q11c3=(CheckBox)rootView.findViewById(R.id.hooships1q11c3);
		 hooships1q11c4=(CheckBox)rootView.findViewById(R.id.hooships1q11c4);
		 hooships1q11c5=(CheckBox)rootView.findViewById(R.id.hooships1q11c5);
		 
		 hooships1q12c1=(CheckBox)rootView.findViewById(R.id.hooships1q12c1);
		 hooships1q12c2=(CheckBox)rootView.findViewById(R.id.hooships1q12c2);
		 hooships1q12c3=(CheckBox)rootView.findViewById(R.id.hooships1q12c3);
		 hooships1q12c4=(CheckBox)rootView.findViewById(R.id.hooships1q12c4);
		 hooships1q12c5=(CheckBox)rootView.findViewById(R.id.hooships1q12c5);
		 
		 hooships1q13c1=(CheckBox)rootView.findViewById(R.id.hooships1q13c1);
		 hooships1q13c2=(CheckBox)rootView.findViewById(R.id.hooships1q13c2);
		 hooships1q13c3=(CheckBox)rootView.findViewById(R.id.hooships1q13c3);
		 hooships1q13c4=(CheckBox)rootView.findViewById(R.id.hooships1q13c4);
		 hooships1q13c5=(CheckBox)rootView.findViewById(R.id.hooships1q13c5);
		 
		 hooships1q14c1=(CheckBox)rootView.findViewById(R.id.hooships1q14c1);
		 hooships1q14c2=(CheckBox)rootView.findViewById(R.id.hooships1q14c2);
		 hooships1q14c3=(CheckBox)rootView.findViewById(R.id.hooships1q14c3);
		 hooships1q14c4=(CheckBox)rootView.findViewById(R.id.hooships1q14c4);
		 hooships1q14c5=(CheckBox)rootView.findViewById(R.id.hooships1q14c5);
		 
		 hooships1q15c1=(CheckBox)rootView.findViewById(R.id.hooships1q15c1);
		 hooships1q15c2=(CheckBox)rootView.findViewById(R.id.hooships1q15c2);
		 hooships1q15c3=(CheckBox)rootView.findViewById(R.id.hooships1q15c3);
		 hooships1q15c4=(CheckBox)rootView.findViewById(R.id.hooships1q15c4);
		 hooships1q15c5=(CheckBox)rootView.findViewById(R.id.hooships1q15c5);
		 
		 //Section 2
		 hooships2q1c1=(CheckBox)rootView.findViewById(R.id.hooships2q1c1);
		 hooships2q1c2=(CheckBox)rootView.findViewById(R.id.hooships2q1c2);		 
		 hooships2q1c3=(CheckBox)rootView.findViewById(R.id.hooships2q1c3);
		 hooships2q1c4=(CheckBox)rootView.findViewById(R.id.hooships2q1c4);
		 hooships2q1c5=(CheckBox)rootView.findViewById(R.id.hooships2q1c5);
		 
		 hooships2q2c1=(CheckBox)rootView.findViewById(R.id.hooships2q2c1);
		 hooships2q2c2=(CheckBox)rootView.findViewById(R.id.hooships2q2c2);
		 hooships2q2c3=(CheckBox)rootView.findViewById(R.id.hooships2q2c3);
		 hooships2q2c4=(CheckBox)rootView.findViewById(R.id.hooships2q2c4);
		 hooships2q2c5=(CheckBox)rootView.findViewById(R.id.hooships2q2c5);
		 
		 hooships2q3c1=(CheckBox)rootView.findViewById(R.id.hooships2q3c1);
		 hooships2q3c2=(CheckBox)rootView.findViewById(R.id.hooships2q3c2);
		 hooships2q3c3=(CheckBox)rootView.findViewById(R.id.hooships2q3c3);
		 hooships2q3c4=(CheckBox)rootView.findViewById(R.id.hooships2q3c4);
		 hooships2q3c5=(CheckBox)rootView.findViewById(R.id.hooships2q3c5);
		 
		 hooships2q4c1=(CheckBox)rootView.findViewById(R.id.hooships2q4c1);
		 hooships2q4c2=(CheckBox)rootView.findViewById(R.id.hooships2q4c2);
		 hooships2q4c3=(CheckBox)rootView.findViewById(R.id.hooships2q4c3);
		 hooships2q4c4=(CheckBox)rootView.findViewById(R.id.hooships2q4c4);
		 hooships2q4c5=(CheckBox)rootView.findViewById(R.id.hooships2q4c5);
		 
		 hooships2q5c1=(CheckBox)rootView.findViewById(R.id.hooships2q5c1);
		 hooships2q5c2=(CheckBox)rootView.findViewById(R.id.hooships2q5c2);
		 hooships2q5c3=(CheckBox)rootView.findViewById(R.id.hooships2q5c3);
		 hooships2q5c4=(CheckBox)rootView.findViewById(R.id.hooships2q5c4);
		 hooships2q5c5=(CheckBox)rootView.findViewById(R.id.hooships2q5c5);
		 
		 hooships2q6c1=(CheckBox)rootView.findViewById(R.id.hooships2q6c1);
		 hooships2q6c2=(CheckBox)rootView.findViewById(R.id.hooships2q6c2);
		 hooships2q6c3=(CheckBox)rootView.findViewById(R.id.hooships2q6c3);
		 hooships2q6c4=(CheckBox)rootView.findViewById(R.id.hooships2q6c4);
		 hooships2q6c5=(CheckBox)rootView.findViewById(R.id.hooships2q6c5);
		 
		 hooships2q7c1=(CheckBox)rootView.findViewById(R.id.hooships2q7c1);
		 hooships2q7c2=(CheckBox)rootView.findViewById(R.id.hooships2q7c2);
		 hooships2q7c3=(CheckBox)rootView.findViewById(R.id.hooships2q7c3);
		 hooships2q7c4=(CheckBox)rootView.findViewById(R.id.hooships2q7c4);
		 hooships2q7c5=(CheckBox)rootView.findViewById(R.id.hooships2q7c5);
		 
		 hooships2q8c1=(CheckBox)rootView.findViewById(R.id.hooships2q8c1);
		 hooships2q8c2=(CheckBox)rootView.findViewById(R.id.hooships2q8c2);
		 hooships2q8c3=(CheckBox)rootView.findViewById(R.id.hooships2q8c3);
		 hooships2q8c4=(CheckBox)rootView.findViewById(R.id.hooships2q8c4);
		 hooships2q8c5=(CheckBox)rootView.findViewById(R.id.hooships2q8c5);
		 
		 hooships2q9c1=(CheckBox)rootView.findViewById(R.id.hooships2q9c1);
		 hooships2q9c2=(CheckBox)rootView.findViewById(R.id.hooships2q9c2);
		 hooships2q9c3=(CheckBox)rootView.findViewById(R.id.hooships2q9c3);
		 hooships2q9c4=(CheckBox)rootView.findViewById(R.id.hooships2q9c4);
		 hooships2q9c5=(CheckBox)rootView.findViewById(R.id.hooships2q9c5);
		 
		 hooships2q10c1=(CheckBox)rootView.findViewById(R.id.hooships2q10c1);
		 hooships2q10c2=(CheckBox)rootView.findViewById(R.id.hooships2q10c2);
		 hooships2q10c3=(CheckBox)rootView.findViewById(R.id.hooships2q10c3);
		 hooships2q10c4=(CheckBox)rootView.findViewById(R.id.hooships2q10c4);
		 hooships2q10c5=(CheckBox)rootView.findViewById(R.id.hooships2q10c5);
		 
		 hooships2q11c1=(CheckBox)rootView.findViewById(R.id.hooships2q11c1);
		 hooships2q11c2=(CheckBox)rootView.findViewById(R.id.hooships2q11c2);
		 hooships2q11c3=(CheckBox)rootView.findViewById(R.id.hooships2q11c3);
		 hooships2q11c4=(CheckBox)rootView.findViewById(R.id.hooships2q11c4);
		 hooships2q11c5=(CheckBox)rootView.findViewById(R.id.hooships2q11c5);
		 
		 hooships2q12c1=(CheckBox)rootView.findViewById(R.id.hooships2q12c1);
		 hooships2q12c2=(CheckBox)rootView.findViewById(R.id.hooships2q12c2);
		 hooships2q12c3=(CheckBox)rootView.findViewById(R.id.hooships2q12c3);
		 hooships2q12c4=(CheckBox)rootView.findViewById(R.id.hooships2q12c4);
		 hooships2q12c5=(CheckBox)rootView.findViewById(R.id.hooships2q12c5);
		 
		 hooships2q13c1=(CheckBox)rootView.findViewById(R.id.hooships2q13c1);
		 hooships2q13c2=(CheckBox)rootView.findViewById(R.id.hooships2q13c2);
		 hooships2q13c3=(CheckBox)rootView.findViewById(R.id.hooships2q13c3);
		 hooships2q13c4=(CheckBox)rootView.findViewById(R.id.hooships2q13c4);
		 hooships2q13c5=(CheckBox)rootView.findViewById(R.id.hooships2q13c5);
		 
		 hooships2q14c1=(CheckBox)rootView.findViewById(R.id.hooships2q14c1);
		 hooships2q14c2=(CheckBox)rootView.findViewById(R.id.hooships2q14c2);
		 hooships2q14c3=(CheckBox)rootView.findViewById(R.id.hooships2q14c3);
		 hooships2q14c4=(CheckBox)rootView.findViewById(R.id.hooships2q14c4);
		 hooships2q14c5=(CheckBox)rootView.findViewById(R.id.hooships2q14c5);
		 
		 hooships2q15c1=(CheckBox)rootView.findViewById(R.id.hooships2q15c1);
		 hooships2q15c2=(CheckBox)rootView.findViewById(R.id.hooships2q15c2);
		 hooships2q15c3=(CheckBox)rootView.findViewById(R.id.hooships2q15c3);
		 hooships2q15c4=(CheckBox)rootView.findViewById(R.id.hooships2q15c4);
		 hooships2q15c5=(CheckBox)rootView.findViewById(R.id.hooships2q15c5);
		 
		 hooships2q16c1=(CheckBox)rootView.findViewById(R.id.hooships2q16c1);
		 hooships2q16c2=(CheckBox)rootView.findViewById(R.id.hooships2q16c2);
		 hooships2q16c3=(CheckBox)rootView.findViewById(R.id.hooships2q16c3);
		 hooships2q16c4=(CheckBox)rootView.findViewById(R.id.hooships2q16c4);
		 hooships2q16c5=(CheckBox)rootView.findViewById(R.id.hooships2q16c5);
		 
		 hooships2q17c1=(CheckBox)rootView.findViewById(R.id.hooships2q17c1);
		 hooships2q17c2=(CheckBox)rootView.findViewById(R.id.hooships2q17c2);
		 hooships2q17c3=(CheckBox)rootView.findViewById(R.id.hooships2q17c3);
		 hooships2q17c4=(CheckBox)rootView.findViewById(R.id.hooships2q17c4);
		 hooships2q17c5=(CheckBox)rootView.findViewById(R.id.hooships2q17c5);
		 
		 //Section 3
		 hooships3q1c1=(CheckBox)rootView.findViewById(R.id.hooships3q1c1);
		 hooships3q1c2=(CheckBox)rootView.findViewById(R.id.hooships3q1c2);
		 hooships3q1c3=(CheckBox)rootView.findViewById(R.id.hooships3q1c3);
		 hooships3q1c4=(CheckBox)rootView.findViewById(R.id.hooships3q1c4);
		 hooships3q1c5=(CheckBox)rootView.findViewById(R.id.hooships3q1c5);
		 
		 hooships3q2c1=(CheckBox)rootView.findViewById(R.id.hooships3q2c1);
		 hooships3q2c2=(CheckBox)rootView.findViewById(R.id.hooships3q2c2);
		 hooships3q2c3=(CheckBox)rootView.findViewById(R.id.hooships3q2c3);
		 hooships3q2c4=(CheckBox)rootView.findViewById(R.id.hooships3q2c4);
		 hooships3q2c5=(CheckBox)rootView.findViewById(R.id.hooships3q2c5);
		 
		 hooships3q3c1=(CheckBox)rootView.findViewById(R.id.hooships3q3c1);
		 hooships3q3c2=(CheckBox)rootView.findViewById(R.id.hooships3q3c2);
		 hooships3q3c3=(CheckBox)rootView.findViewById(R.id.hooships3q3c3);
		 hooships3q3c4=(CheckBox)rootView.findViewById(R.id.hooships3q3c4);
		 hooships3q3c5=(CheckBox)rootView.findViewById(R.id.hooships3q3c5);
		 
		 hooships3q4c1=(CheckBox)rootView.findViewById(R.id.hooships3q4c1);
		 hooships3q4c2=(CheckBox)rootView.findViewById(R.id.hooships3q4c2);
		 hooships3q4c3=(CheckBox)rootView.findViewById(R.id.hooships3q4c3);
		 hooships3q4c4=(CheckBox)rootView.findViewById(R.id.hooships3q4c4);
		 hooships3q4c5=(CheckBox)rootView.findViewById(R.id.hooships3q4c5);
		 
		 hooships3q5c1=(CheckBox)rootView.findViewById(R.id.hooships3q5c1);
		 hooships3q5c2=(CheckBox)rootView.findViewById(R.id.hooships3q5c2);
		 hooships3q5c3=(CheckBox)rootView.findViewById(R.id.hooships3q5c3);
		 hooships3q5c4=(CheckBox)rootView.findViewById(R.id.hooships3q5c4);
		 hooships3q5c5=(CheckBox)rootView.findViewById(R.id.hooships3q5c5);
		 
		 hooships3q6c1=(CheckBox)rootView.findViewById(R.id.hooships3q6c1);
		 hooships3q6c2=(CheckBox)rootView.findViewById(R.id.hooships3q6c2);
		 hooships3q6c3=(CheckBox)rootView.findViewById(R.id.hooships3q6c3);
		 hooships3q6c4=(CheckBox)rootView.findViewById(R.id.hooships3q6c4);
		 hooships3q6c5=(CheckBox)rootView.findViewById(R.id.hooships3q6c5);
		 
		 hooships3q7c1=(CheckBox)rootView.findViewById(R.id.hooships3q7c1);
		 hooships3q7c2=(CheckBox)rootView.findViewById(R.id.hooships3q7c2);
		 hooships3q7c3=(CheckBox)rootView.findViewById(R.id.hooships3q7c3);
		 hooships3q7c4=(CheckBox)rootView.findViewById(R.id.hooships3q7c4);
		 hooships3q7c5=(CheckBox)rootView.findViewById(R.id.hooships3q7c5);
		 
		 hooships3q8c1=(CheckBox)rootView.findViewById(R.id.hooships3q8c1);
		 hooships3q8c2=(CheckBox)rootView.findViewById(R.id.hooships3q8c2);
		 hooships3q8c3=(CheckBox)rootView.findViewById(R.id.hooships3q8c3);
		 hooships3q8c4=(CheckBox)rootView.findViewById(R.id.hooships3q8c4);
		 hooships3q8c5=(CheckBox)rootView.findViewById(R.id.hooships3q8c5);
		 
		 hooshipcancel=(Button)rootView.findViewById(R.id.hooshipcancel);
		 hooshipsave=(Button)rootView.findViewById(R.id.hooshipsave);
		
		 //Setting listener
		 hooships1q1c1.setOnCheckedChangeListener(this);
		 hooships1q1c2.setOnCheckedChangeListener(this);
		 hooships1q1c3.setOnCheckedChangeListener(this);
		 hooships1q1c4.setOnCheckedChangeListener(this);
		 hooships1q1c5.setOnCheckedChangeListener(this);
		 
		 hooships1q2c1.setOnCheckedChangeListener(this);
		 hooships1q2c2.setOnCheckedChangeListener(this);
		 hooships1q2c3.setOnCheckedChangeListener(this);
		 hooships1q2c4.setOnCheckedChangeListener(this);
		 hooships1q2c5.setOnCheckedChangeListener(this);
		 
		 hooships1q3c1.setOnCheckedChangeListener(this);
		 hooships1q3c2.setOnCheckedChangeListener(this);
		 hooships1q3c3.setOnCheckedChangeListener(this);
		 hooships1q3c4.setOnCheckedChangeListener(this);
		 hooships1q3c5.setOnCheckedChangeListener(this);
		 
		 hooships1q4c1.setOnCheckedChangeListener(this);
		 hooships1q4c2.setOnCheckedChangeListener(this);
		 hooships1q4c3.setOnCheckedChangeListener(this);
		 hooships1q4c4.setOnCheckedChangeListener(this);
		 hooships1q4c5.setOnCheckedChangeListener(this);
		 
		 hooships1q5c1.setOnCheckedChangeListener(this);
		 hooships1q5c2.setOnCheckedChangeListener(this);
		 hooships1q5c3.setOnCheckedChangeListener(this);
		 hooships1q5c4.setOnCheckedChangeListener(this);
		 hooships1q5c5.setOnCheckedChangeListener(this);
		 
		 hooships1q6c1.setOnCheckedChangeListener(this);
		 hooships1q6c2.setOnCheckedChangeListener(this);
		 hooships1q6c3.setOnCheckedChangeListener(this);
		 hooships1q6c4.setOnCheckedChangeListener(this);
		 hooships1q6c5.setOnCheckedChangeListener(this);
		 
		 hooships1q7c1.setOnCheckedChangeListener(this);
		 hooships1q7c2.setOnCheckedChangeListener(this);
		 hooships1q7c3.setOnCheckedChangeListener(this);
		 hooships1q7c4.setOnCheckedChangeListener(this);
		 hooships1q7c5.setOnCheckedChangeListener(this);
		 
		 hooships1q8c1.setOnCheckedChangeListener(this);
		 hooships1q8c2.setOnCheckedChangeListener(this);
		 hooships1q8c3.setOnCheckedChangeListener(this);
		 hooships1q8c4.setOnCheckedChangeListener(this);
		 hooships1q8c5.setOnCheckedChangeListener(this);
		 
		 hooships1q9c1.setOnCheckedChangeListener(this);
		 hooships1q9c2.setOnCheckedChangeListener(this);
		 hooships1q9c3.setOnCheckedChangeListener(this);
		 hooships1q9c4.setOnCheckedChangeListener(this);
		 hooships1q9c5.setOnCheckedChangeListener(this);
		 
		 hooships1q10c1.setOnCheckedChangeListener(this);
		 hooships1q10c2.setOnCheckedChangeListener(this);
		 hooships1q10c3.setOnCheckedChangeListener(this);
		 hooships1q10c4.setOnCheckedChangeListener(this);
		 hooships1q10c5.setOnCheckedChangeListener(this);
		 
		 hooships1q11c1.setOnCheckedChangeListener(this);
		 hooships1q11c2.setOnCheckedChangeListener(this);
		 hooships1q11c3.setOnCheckedChangeListener(this);
		 hooships1q11c4.setOnCheckedChangeListener(this);
		 hooships1q11c5.setOnCheckedChangeListener(this);
		 
		 hooships1q12c1.setOnCheckedChangeListener(this);
		 hooships1q12c2.setOnCheckedChangeListener(this);
		 hooships1q12c3.setOnCheckedChangeListener(this);
		 hooships1q12c4.setOnCheckedChangeListener(this);
		 hooships1q12c5.setOnCheckedChangeListener(this);
		 
		 hooships1q13c1.setOnCheckedChangeListener(this);
		 hooships1q13c2.setOnCheckedChangeListener(this);
		 hooships1q13c3.setOnCheckedChangeListener(this);
		 hooships1q13c4.setOnCheckedChangeListener(this);
		 hooships1q13c5.setOnCheckedChangeListener(this);
		 
		 hooships1q14c1.setOnCheckedChangeListener(this);
		 hooships1q14c2.setOnCheckedChangeListener(this);
		 hooships1q14c3.setOnCheckedChangeListener(this);
		 hooships1q14c4.setOnCheckedChangeListener(this);
		 hooships1q14c5.setOnCheckedChangeListener(this);
		 
		 hooships1q15c1.setOnCheckedChangeListener(this);
		 hooships1q15c2.setOnCheckedChangeListener(this);
		 hooships1q15c3.setOnCheckedChangeListener(this);
		 hooships1q15c4.setOnCheckedChangeListener(this);
		 hooships1q15c5.setOnCheckedChangeListener(this);
		 
		 hooships2q1c1.setOnCheckedChangeListener(this);
		 hooships2q1c2.setOnCheckedChangeListener(this);
		 hooships2q1c3.setOnCheckedChangeListener(this);
		 hooships2q1c4.setOnCheckedChangeListener(this);
		 hooships2q1c5.setOnCheckedChangeListener(this);
		 
		 hooships2q2c1.setOnCheckedChangeListener(this);
		 hooships2q2c2.setOnCheckedChangeListener(this);
		 hooships2q2c3.setOnCheckedChangeListener(this);
		 hooships2q2c4.setOnCheckedChangeListener(this);
		 hooships2q2c5.setOnCheckedChangeListener(this);
		 
		 hooships2q3c1.setOnCheckedChangeListener(this);
		 hooships2q3c2.setOnCheckedChangeListener(this);
		 hooships2q3c3.setOnCheckedChangeListener(this);
		 hooships2q3c4.setOnCheckedChangeListener(this);
		 hooships2q3c5.setOnCheckedChangeListener(this);
		 
		 hooships2q4c1.setOnCheckedChangeListener(this);
		 hooships2q4c2.setOnCheckedChangeListener(this);
		 hooships2q4c3.setOnCheckedChangeListener(this);
		 hooships2q4c4.setOnCheckedChangeListener(this);
		 hooships2q4c5.setOnCheckedChangeListener(this);
		 
		 hooships2q5c1.setOnCheckedChangeListener(this);
		 hooships2q5c2.setOnCheckedChangeListener(this);
		 hooships2q5c3.setOnCheckedChangeListener(this);
		 hooships2q5c4.setOnCheckedChangeListener(this);
		 hooships2q5c5.setOnCheckedChangeListener(this);
		 
		 hooships2q6c1.setOnCheckedChangeListener(this);
		 hooships2q6c2.setOnCheckedChangeListener(this);
		 hooships2q6c3.setOnCheckedChangeListener(this);
		 hooships2q6c4.setOnCheckedChangeListener(this);
		 hooships2q6c5.setOnCheckedChangeListener(this);
		 
		 hooships2q7c1.setOnCheckedChangeListener(this);
		 hooships2q7c2.setOnCheckedChangeListener(this);
		 hooships2q7c3.setOnCheckedChangeListener(this);
		 hooships2q7c4.setOnCheckedChangeListener(this);
		 hooships2q7c5.setOnCheckedChangeListener(this);
		 
		 hooships2q8c1.setOnCheckedChangeListener(this);
		 hooships2q8c2.setOnCheckedChangeListener(this);
		 hooships2q8c3.setOnCheckedChangeListener(this);
		 hooships2q8c4.setOnCheckedChangeListener(this);
		 hooships2q8c5.setOnCheckedChangeListener(this);
		 
		 hooships2q9c1.setOnCheckedChangeListener(this);
		 hooships2q9c2.setOnCheckedChangeListener(this);
		 hooships2q9c3.setOnCheckedChangeListener(this);
		 hooships2q9c4.setOnCheckedChangeListener(this);
		 hooships2q9c5.setOnCheckedChangeListener(this);
		 
		 hooships2q10c1.setOnCheckedChangeListener(this);
		 hooships2q10c2.setOnCheckedChangeListener(this);
		 hooships2q10c3.setOnCheckedChangeListener(this);
		 hooships2q10c4.setOnCheckedChangeListener(this);
		 hooships2q10c5.setOnCheckedChangeListener(this);
		 
		 hooships2q11c1.setOnCheckedChangeListener(this);
		 hooships2q11c2.setOnCheckedChangeListener(this);
		 hooships2q11c3.setOnCheckedChangeListener(this);
		 hooships2q11c4.setOnCheckedChangeListener(this);
		 hooships2q11c5.setOnCheckedChangeListener(this);
		 
		 hooships2q12c1.setOnCheckedChangeListener(this);
		 hooships2q12c2.setOnCheckedChangeListener(this);
		 hooships2q12c3.setOnCheckedChangeListener(this);
		 hooships2q12c4.setOnCheckedChangeListener(this);
		 hooships2q12c5.setOnCheckedChangeListener(this);
		 
		 hooships2q13c1.setOnCheckedChangeListener(this);
		 hooships2q13c2.setOnCheckedChangeListener(this);
		 hooships2q13c3.setOnCheckedChangeListener(this);
		 hooships2q13c4.setOnCheckedChangeListener(this);
		 hooships2q13c5.setOnCheckedChangeListener(this);
		 
		 hooships2q14c1.setOnCheckedChangeListener(this);
		 hooships2q14c2.setOnCheckedChangeListener(this);
		 hooships2q14c3.setOnCheckedChangeListener(this);
		 hooships2q14c4.setOnCheckedChangeListener(this);
		 hooships2q14c5.setOnCheckedChangeListener(this);
		 
		 hooships2q15c1.setOnCheckedChangeListener(this);
		 hooships2q15c2.setOnCheckedChangeListener(this);
		 hooships2q15c3.setOnCheckedChangeListener(this);
		 hooships2q15c4.setOnCheckedChangeListener(this);
		 hooships2q15c5.setOnCheckedChangeListener(this);
		 
		 hooships2q16c1.setOnCheckedChangeListener(this);
		 hooships2q16c2.setOnCheckedChangeListener(this);
		 hooships2q16c3.setOnCheckedChangeListener(this);
		 hooships2q16c4.setOnCheckedChangeListener(this);
		 hooships2q16c5.setOnCheckedChangeListener(this);
		 
		 hooships2q17c1.setOnCheckedChangeListener(this);
		 hooships2q17c2.setOnCheckedChangeListener(this);
		 hooships2q17c3.setOnCheckedChangeListener(this);
		 hooships2q17c4.setOnCheckedChangeListener(this);
		 hooships2q17c5.setOnCheckedChangeListener(this);
		 
		 
		 //Section 3
		 hooships3q1c1.setOnCheckedChangeListener(this);
		 hooships3q1c2.setOnCheckedChangeListener(this);
		 hooships3q1c3.setOnCheckedChangeListener(this);
		 hooships3q1c4.setOnCheckedChangeListener(this);
		 hooships3q1c5.setOnCheckedChangeListener(this);
		 
		 hooships3q2c1.setOnCheckedChangeListener(this);
		 hooships3q2c2.setOnCheckedChangeListener(this);
		 hooships3q2c3.setOnCheckedChangeListener(this);
		 hooships3q2c4.setOnCheckedChangeListener(this);
		 hooships3q2c5.setOnCheckedChangeListener(this);
		 
		 hooships3q3c1.setOnCheckedChangeListener(this);
		 hooships3q3c2.setOnCheckedChangeListener(this);
		 hooships3q3c3.setOnCheckedChangeListener(this);
		 hooships3q3c4.setOnCheckedChangeListener(this);
		 hooships3q3c5.setOnCheckedChangeListener(this);
		 
		 hooships3q4c1.setOnCheckedChangeListener(this);
		 hooships3q4c2.setOnCheckedChangeListener(this);
		 hooships3q4c3.setOnCheckedChangeListener(this);
		 hooships3q4c4.setOnCheckedChangeListener(this);
		 hooships3q4c5.setOnCheckedChangeListener(this);

		 hooships3q5c1.setOnCheckedChangeListener(this);
		 hooships3q5c2.setOnCheckedChangeListener(this);
		 hooships3q5c3.setOnCheckedChangeListener(this);
		 hooships3q5c4.setOnCheckedChangeListener(this);
		 hooships3q5c5.setOnCheckedChangeListener(this);

		 hooships3q6c1.setOnCheckedChangeListener(this);
		 hooships3q6c2.setOnCheckedChangeListener(this);
		 hooships3q6c3.setOnCheckedChangeListener(this);
		 hooships3q6c4.setOnCheckedChangeListener(this);
		 hooships3q6c5.setOnCheckedChangeListener(this);
		 
		 hooships3q7c1.setOnCheckedChangeListener(this);
		 hooships3q7c2.setOnCheckedChangeListener(this);
		 hooships3q7c3.setOnCheckedChangeListener(this);
		 hooships3q7c4.setOnCheckedChangeListener(this);
		 hooships3q7c5.setOnCheckedChangeListener(this);
		 
		 hooships3q8c1.setOnCheckedChangeListener(this);
		 hooships3q8c2.setOnCheckedChangeListener(this);
		 hooships3q8c3.setOnCheckedChangeListener(this);
		 hooships3q8c4.setOnCheckedChangeListener(this);
		 hooships3q8c5.setOnCheckedChangeListener(this);
		 
		 hooshipcancel.setOnClickListener(this);
		 hooshipsave.setOnClickListener(this);
		 ch=new int[40];
		 return rootView;
	 }
	
	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		switch(buttonView.getId()){
		case R.id.hooships1q1c1: if(isChecked){
		 
		 hooships1q1c2.setChecked(false);
		 hooships1q1c3.setChecked(false);
		 hooships1q1c4.setChecked(false);
		 hooships1q1c5.setChecked(false);
		 ch[0]=1;
		}else
		{
			ch[0]=0;
		}
			                     break;
		case R.id.hooships1q1c2: if(isChecked){
			 
			 hooships1q1c1.setChecked(false);
			 hooships1q1c3.setChecked(false);
			 hooships1q1c4.setChecked(false);
			 hooships1q1c5.setChecked(false);
		     ch[0]=2;   	
		}else
			{
				ch[0]=0;
			}
				                     break;
		case R.id.hooships1q1c3: if(isChecked){
			 
			 hooships1q1c1.setChecked(false);
			 hooships1q1c2.setChecked(false);
			 hooships1q1c4.setChecked(false);
			 hooships1q1c5.setChecked(false);
		     ch[0]=3;   	
		}else
			{
				ch[0]=0;
			}
				                     break;
		case R.id.hooships1q1c4: if(isChecked){
			 
			 hooships1q1c1.setChecked(false);
			 hooships1q1c3.setChecked(false);
			 hooships1q1c2.setChecked(false);
			 hooships1q1c5.setChecked(false);
		     ch[0]=4;   	
		}else
			{
				ch[0]=0;
			}
				                     break;
				                     		                     
		case R.id.hooships1q1c5: if(isChecked){
			 
			 hooships1q1c1.setChecked(false);
			 hooships1q1c3.setChecked(false);
			 hooships1q1c4.setChecked(false);
			 hooships1q1c2.setChecked(false);
		     ch[0]=1;   	
		}else
			{
				ch[0]=0;
			}
				                     break;
				                     
		case R.id.hooships1q2c1: if(isChecked){
			 
			 hooships1q2c2.setChecked(false);
			 hooships1q2c3.setChecked(false);
			 hooships1q2c4.setChecked(false);
			 hooships1q2c5.setChecked(false);
		     ch[1]=1;   	
		}else
			{
				ch[1]=0;
			}
				                     break;
				                     	                     
		case R.id.hooships1q2c2: if(isChecked){
			 
			 hooships1q2c1.setChecked(false);
			 hooships1q2c3.setChecked(false);
			 hooships1q2c4.setChecked(false);
			 hooships1q2c5.setChecked(false);
		     ch[1]=2;   	
		}else
			{
				ch[1]=0;
			}
				                     break;
		
		case R.id.hooships1q2c3: if(isChecked){
			 
			 hooships1q2c1.setChecked(false);
			 hooships1q2c2.setChecked(false);
			 hooships1q2c4.setChecked(false);
			 hooships1q2c5.setChecked(false);
		     ch[1]=2;   	
		}else
			{
				ch[1]=0;
			}
				                     break;
		
		case R.id.hooships1q2c4: if(isChecked){
			 
			 hooships1q2c1.setChecked(false);
			 hooships1q2c3.setChecked(false);
			 hooships1q2c2.setChecked(false);
			 hooships1q2c5.setChecked(false);
		     ch[1]=4;   	
		}else
			{
				ch[1]=0;
			}
				                     break;
				                     
		case R.id.hooships1q2c5: if(isChecked){
			 
			 hooships1q2c1.setChecked(false);
			 hooships1q2c3.setChecked(false);
			 hooships1q2c4.setChecked(false);
			 hooships1q2c2.setChecked(false);
		     ch[1]=5;   	
		}else
			{
				ch[1]=0;
			}
				                     break;
		
		case R.id.hooships1q3c1: if(isChecked){
			 
			 hooships1q3c2.setChecked(false);
			 hooships1q3c3.setChecked(false);
			 hooships1q3c4.setChecked(false);
			 hooships1q3c5.setChecked(false);
		     ch[2]=1;   	
		}else
			{
				ch[2]=0;
			}
				                     break;
		
		case R.id.hooships1q3c2: if(isChecked){
			 
			 hooships1q3c1.setChecked(false);
			 hooships1q3c3.setChecked(false);
			 hooships1q3c4.setChecked(false);
			 hooships1q3c5.setChecked(false);
		     ch[2]=2;   	
		}else
			{
				ch[2]=0;
			}
				                     break;
		

		case R.id.hooships1q3c3: if(isChecked){
			 
			 hooships1q3c2.setChecked(false);
			 hooships1q3c1.setChecked(false);
			 hooships1q3c4.setChecked(false);
			 hooships1q3c5.setChecked(false);
		     ch[2]=3;   	
		}else
			{
				ch[2]=0;
			}
				                     break;             

		case R.id.hooships1q3c4: if(isChecked){
			 
			 hooships1q3c2.setChecked(false);
			 hooships1q3c3.setChecked(false);
			 hooships1q3c1.setChecked(false);
			 hooships1q3c5.setChecked(false);
		     ch[2]=4;   	
		}else
			{
				ch[2]=0;
			}
				                     break;
		

		case R.id.hooships1q3c5: if(isChecked){
			 
			 hooships1q3c2.setChecked(false);
			 hooships1q3c3.setChecked(false);
			 hooships1q3c4.setChecked(false);
			 hooships1q3c1.setChecked(false);
		     ch[2]=5;   	
		}else
			{
				ch[2]=0;
			}
				                     break;

		case R.id.hooships1q4c1: if(isChecked){
			 
			 hooships1q4c2.setChecked(false);
			 hooships1q4c3.setChecked(false);
			 hooships1q4c4.setChecked(false);
			 hooships1q4c5.setChecked(false);
		     ch[3]=1;   	
		}else
			{
				ch[3]=0;
			}
				                     break;
				                     

		case R.id.hooships1q4c2: if(isChecked){
			 
			 hooships1q4c1.setChecked(false);
			 hooships1q4c3.setChecked(false);
			 hooships1q4c4.setChecked(false);
			 hooships1q4c5.setChecked(false);
		     ch[3]=2;   	
		}else
			{
				ch[3]=0;
			}
				                     break;
				                     

		case R.id.hooships1q4c3: if(isChecked){
			 
			 hooships1q4c2.setChecked(false);
			 hooships1q4c1.setChecked(false);
			 hooships1q4c4.setChecked(false);
			 hooships1q4c5.setChecked(false);
		     ch[3]=3;   	
		}else
			{
				ch[3]=0;
			}
				                     break; 

		case R.id.hooships1q4c4: if(isChecked){
			 
			 hooships1q4c2.setChecked(false);
			 hooships1q4c1.setChecked(false);
			 hooships1q4c3.setChecked(false);
			 hooships1q4c5.setChecked(false);
		     ch[3]=4;   	
		}else
			{
				ch[3]=0;
			}
				                     break; 

		case R.id.hooships1q4c5: if(isChecked){
			 
			 hooships1q4c2.setChecked(false);
			 hooships1q4c1.setChecked(false);
			 hooships1q4c4.setChecked(false);
			 hooships1q4c3.setChecked(false);
		     ch[3]=5;   	
		}else
			{
				ch[3]=0;
			}
				                     break; 

		case R.id.hooships1q5c1: if(isChecked){
			 
			 hooships1q5c2.setChecked(false);
			 hooships1q5c3.setChecked(false);
			 hooships1q5c4.setChecked(false);
			 hooships1q5c5.setChecked(false);
		     ch[4]=1;   	
		}else
			{
				ch[4]=0;
			}
				                     break;

		case R.id.hooships1q5c2: if(isChecked){
			 
			 hooships1q5c1.setChecked(false);
			 hooships1q5c3.setChecked(false);
			 hooships1q5c4.setChecked(false);
			 hooships1q5c5.setChecked(false);
		     ch[4]=2;   	
		}else
			{
				ch[4]=0;
			}
				                     break;

		case R.id.hooships1q5c3: if(isChecked){
			 
			 hooships1q5c2.setChecked(false);
			 hooships1q5c1.setChecked(false);
			 hooships1q5c4.setChecked(false);
			 hooships1q5c5.setChecked(false);
		     ch[4]=3;   	
		}else
			{
				ch[4]=0;
			}
				                     break;

		case R.id.hooships1q5c4: if(isChecked){
			 
			 hooships1q5c2.setChecked(false);
			 hooships1q5c3.setChecked(false);
			 hooships1q5c1.setChecked(false);
			 hooships1q5c5.setChecked(false);
		     ch[4]=4;   	
		}else
			{
				ch[4]=0;
			}
				                     break;

		case R.id.hooships1q5c5: if(isChecked){
			 
			 hooships1q5c2.setChecked(false);
			 hooships1q5c3.setChecked(false);
			 hooships1q5c4.setChecked(false);
			 hooships1q5c1.setChecked(false);
		     ch[4]=5;   	
		}else
			{
				ch[4]=0;
			}
				                     break;

		case R.id.hooships1q6c1: if(isChecked){
			 
			 hooships1q6c2.setChecked(false);
			 hooships1q6c3.setChecked(false);
			 hooships1q6c4.setChecked(false);
			 hooships1q6c5.setChecked(false);
		     ch[5]=1;   	
		}else
			{
				ch[5]=0;
			}
				                     break;

		case R.id.hooships1q6c2: if(isChecked){
			 
			 hooships1q6c1.setChecked(false);
			 hooships1q6c3.setChecked(false);
			 hooships1q6c4.setChecked(false);
			 hooships1q6c5.setChecked(false);
		     ch[5]=2;   	
		}else
			{
				ch[5]=0;
			}
				                     break;


		case R.id.hooships1q6c3: if(isChecked){
			 
			 hooships1q6c2.setChecked(false);
			 hooships1q6c1.setChecked(false);
			 hooships1q6c4.setChecked(false);
			 hooships1q6c5.setChecked(false);
		     ch[5]=3;   	
		}else
			{
				ch[5]=0;
			}
				                     break;

		case R.id.hooships1q6c4: if(isChecked){
			 
			 hooships1q6c2.setChecked(false);
			 hooships1q6c3.setChecked(false);
			 hooships1q6c1.setChecked(false);
			 hooships1q6c5.setChecked(false);
		     ch[5]=4;   	
		}else
			{
				ch[5]=0;
			}
				                     break;

		case R.id.hooships1q6c5: if(isChecked){
			 
			 hooships1q6c2.setChecked(false);
			 hooships1q6c3.setChecked(false);
			 hooships1q6c4.setChecked(false);
			 hooships1q6c1.setChecked(false);
		     ch[5]=1;   	
		}else
			{
				ch[5]=0;
			}
				                     break;


		case R.id.hooships1q7c1: if(isChecked){
			 
			 hooships1q7c2.setChecked(false);
			 hooships1q7c3.setChecked(false);
			 hooships1q7c4.setChecked(false);
			 hooships1q7c5.setChecked(false);
		     ch[6]=1;   	
		}else
			{
				ch[6]=0;
			}
				                     break;

		case R.id.hooships1q7c2: if(isChecked){
			 
			 hooships1q7c1.setChecked(false);
			 hooships1q7c3.setChecked(false);
			 hooships1q7c4.setChecked(false);
			 hooships1q7c5.setChecked(false);
		     ch[6]=2;   	
		}else
			{
				ch[6]=0;
			}
				                     break;


		case R.id.hooships1q7c3: if(isChecked){
			 
			 hooships1q7c2.setChecked(false);
			 hooships1q7c1.setChecked(false);
			 hooships1q7c4.setChecked(false);
			 hooships1q7c5.setChecked(false);
		     ch[6]=3;   	
		}else
			{
				ch[6]=0;
			}
				                     break;

		case R.id.hooships1q7c4: if(isChecked){
			 
			 hooships1q7c2.setChecked(false);
			 hooships1q7c3.setChecked(false);
			 hooships1q7c1.setChecked(false);
			 hooships1q7c5.setChecked(false);
		     ch[6]=4;   	
		}else
			{
				ch[6]=0;
			}
				                     break;


		case R.id.hooships1q7c5: if(isChecked){
			 
			 hooships1q7c2.setChecked(false);
			 hooships1q7c3.setChecked(false);
			 hooships1q7c4.setChecked(false);
			 hooships1q7c1.setChecked(false);
		     ch[6]=5;   	
		}else
			{
				ch[6]=0;
			}
				                     break;

		case R.id.hooships1q8c1: if(isChecked){
			 
			 hooships1q8c2.setChecked(false);
			 hooships1q8c3.setChecked(false);
			 hooships1q8c4.setChecked(false);
			 hooships1q8c5.setChecked(false);
		     ch[7]=1;   	
		}else
			{
				ch[7]=0;
			}
				                     break;

		case R.id.hooships1q8c2: if(isChecked){
			 
			 hooships1q8c1.setChecked(false);
			 hooships1q8c3.setChecked(false);
			 hooships1q8c4.setChecked(false);
			 hooships1q8c5.setChecked(false);
		     ch[7]=2;   	
		}else
			{
				ch[7]=0;
			}
				                     break;

		case R.id.hooships1q8c3: if(isChecked){
			 
			 hooships1q8c2.setChecked(false);
			 hooships1q8c1.setChecked(false);
			 hooships1q8c4.setChecked(false);
			 hooships1q8c5.setChecked(false);
		     ch[7]=3;   	
		}else
			{
				ch[7]=0;
			}
				                     break;

		case R.id.hooships1q8c4: if(isChecked){
			 
			 hooships1q8c2.setChecked(false);
			 hooships1q8c3.setChecked(false);
			 hooships1q8c1.setChecked(false);
			 hooships1q8c5.setChecked(false);
		     ch[7]=4;   	
		}else
			{
				ch[7]=0;
			}
				                     break;

		case R.id.hooships1q8c5: if(isChecked){
			 
			 hooships1q8c2.setChecked(false);
			 hooships1q8c3.setChecked(false);
			 hooships1q8c4.setChecked(false);
			 hooships1q8c1.setChecked(false);
		     ch[7]=5;   	
		}else
			{
				ch[7]=0;
			}
				                     break;

		case R.id.hooships1q9c1: if(isChecked){
			 
			 hooships1q9c2.setChecked(false);
			 hooships1q9c3.setChecked(false);
			 hooships1q9c4.setChecked(false);
			 hooships1q9c5.setChecked(false);
		     ch[8]=1;   	
		}else
			{
				ch[8]=0;
			}
				                     break;

		case R.id.hooships1q9c2: if(isChecked){
			 
			 hooships1q9c1.setChecked(false);
			 hooships1q9c3.setChecked(false);
			 hooships1q9c4.setChecked(false);
			 hooships1q9c5.setChecked(false);
		     ch[8]=2;   	
		}else
			{
				ch[8]=0;
			}
				                     break;

		case R.id.hooships1q9c3: if(isChecked){
			 
			 hooships1q9c2.setChecked(false);
			 hooships1q9c1.setChecked(false);
			 hooships1q9c4.setChecked(false);
			 hooships1q9c5.setChecked(false);
		     ch[8]=3;   	
		}else
			{
				ch[8]=0;
			}
				                     break;

		case R.id.hooships1q9c4: if(isChecked){
			 
			 hooships1q9c2.setChecked(false);
			 hooships1q9c3.setChecked(false);
			 hooships1q9c1.setChecked(false);
			 hooships1q9c5.setChecked(false);
		     ch[8]=4;   	
		}else
			{
				ch[8]=0;
			}
				                     break;

		case R.id.hooships1q9c5: if(isChecked){
			 
			 hooships1q9c2.setChecked(false);
			 hooships1q9c3.setChecked(false);
			 hooships1q9c4.setChecked(false);
			 hooships1q9c1.setChecked(false);
		     ch[8]=5;   	
		}else
			{
				ch[8]=0;
			}
				                     break;

		case R.id.hooships1q10c1: if(isChecked){
			 
			 hooships1q10c2.setChecked(false);
			 hooships1q10c3.setChecked(false);
			 hooships1q10c4.setChecked(false);
			 hooships1q10c5.setChecked(false);
		     ch[9]=1;   	
		}else
			{
				ch[9]=0;
			}
				                     break;

		case R.id.hooships1q10c2: if(isChecked){
			 
			 hooships1q10c1.setChecked(false);
			 hooships1q10c3.setChecked(false);
			 hooships1q10c4.setChecked(false);
			 hooships1q10c5.setChecked(false);
		     ch[9]=2;   	
		}else
			{
				ch[9]=0;
			}
				                     break;

		case R.id.hooships1q10c3: if(isChecked){
			 
			 hooships1q10c2.setChecked(false);
			 hooships1q10c1.setChecked(false);
			 hooships1q10c4.setChecked(false);
			 hooships1q10c5.setChecked(false);
		     ch[9]=3;   	
		}else
			{
				ch[9]=0;
			}
				                     break;

		case R.id.hooships1q10c4: if(isChecked){
			 
			 hooships1q10c2.setChecked(false);
			 hooships1q10c1.setChecked(false);
			 hooships1q10c3.setChecked(false);
			 hooships1q10c5.setChecked(false);
		     ch[9]=4;   	
		}else
			{
				ch[9]=0;
			}
				                     break;

		case R.id.hooships1q10c5: if(isChecked){
			 
			 hooships1q10c2.setChecked(false);
			 hooships1q10c3.setChecked(false);
			 hooships1q10c4.setChecked(false);
			 hooships1q10c1.setChecked(false);
		     ch[9]=5;   	
		}else
			{
				ch[9]=0;
			}
				                     break;

		case R.id.hooships1q11c1: if(isChecked){
			 
			 hooships1q11c2.setChecked(false);
			 hooships1q11c3.setChecked(false);
			 hooships1q11c4.setChecked(false);
			 hooships1q11c5.setChecked(false);
		     ch[10]=1;   	
		}else
			{
				ch[10]=0;
			}
				                     break;

		case R.id.hooships1q11c2: if(isChecked){
			 
			 hooships1q11c1.setChecked(false);
			 hooships1q11c3.setChecked(false);
			 hooships1q11c4.setChecked(false);
			 hooships1q11c5.setChecked(false);
		     ch[10]=2;   	
		}else
			{
				ch[10]=0;
			}
				                     break;

		case R.id.hooships1q11c3: if(isChecked){
			 
			 hooships1q11c2.setChecked(false);
			 hooships1q11c1.setChecked(false);
			 hooships1q11c4.setChecked(false);
			 hooships1q11c5.setChecked(false);
		     ch[10]=3;   	
		}else
			{
				ch[10]=0;
			}
				                     break;

		case R.id.hooships1q11c4: if(isChecked){
			 
			 hooships1q11c2.setChecked(false);
			 hooships1q11c3.setChecked(false);
			 hooships1q11c1.setChecked(false);
			 hooships1q11c5.setChecked(false);
		     ch[10]=4;   	
		}else
			{
				ch[10]=0;
			}
				                     break;

		case R.id.hooships1q11c5: if(isChecked){
			 
			 hooships1q11c2.setChecked(false);
			 hooships1q11c3.setChecked(false);
			 hooships1q11c4.setChecked(false);
			 hooships1q11c1.setChecked(false);
		     ch[10]=5;   	
		}else
			{
				ch[10]=0;
			}
				                     break;

		case R.id.hooships1q12c1: if(isChecked){
			 
			 hooships1q12c2.setChecked(false);
			 hooships1q12c3.setChecked(false);
			 hooships1q12c4.setChecked(false);
			 hooships1q12c5.setChecked(false);
		     ch[11]=1;   	
		}else
			{
				ch[11]=0;
			}
				                     break;

		case R.id.hooships1q12c2: if(isChecked){
			 
			 hooships1q12c1.setChecked(false);
			 hooships1q12c3.setChecked(false);
			 hooships1q12c4.setChecked(false);
			 hooships1q12c5.setChecked(false);
		     ch[11]=2;   	
		}else
			{
				ch[11]=0;
			}
				                     break;

		case R.id.hooships1q12c3: if(isChecked){
			 
			 hooships1q12c2.setChecked(false);
			 hooships1q12c1.setChecked(false);
			 hooships1q12c4.setChecked(false);
			 hooships1q12c5.setChecked(false);
		     ch[11]=3;   	
		}else
			{
				ch[11]=0;
			}
				                     break;
		

		case R.id.hooships1q12c4: if(isChecked){
			 
			 hooships1q12c2.setChecked(false);
			 hooships1q12c3.setChecked(false);
			 hooships1q12c1.setChecked(false);
			 hooships1q12c5.setChecked(false);
		     ch[11]=4;   	
		}else
			{
				ch[11]=0;
			}
				                     break;
		

		case R.id.hooships1q12c5: if(isChecked){
			 
			 hooships1q12c2.setChecked(false);
			 hooships1q12c3.setChecked(false);
			 hooships1q12c4.setChecked(false);
			 hooships1q12c1.setChecked(false);
		     ch[11]=5;   	
		}else
			{
				ch[11]=0;
			}
				                     break;

		case R.id.hooships1q13c1: if(isChecked){
			 
			 hooships1q13c2.setChecked(false);
			 hooships1q13c3.setChecked(false);
			 hooships1q13c4.setChecked(false);
			 hooships1q13c5.setChecked(false);
		     ch[12]=1;   	
		}else
			{
				ch[12]=0;
			}
				                     break;

		case R.id.hooships1q13c2: if(isChecked){
			 
			 hooships1q13c1.setChecked(false);
			 hooships1q13c3.setChecked(false);
			 hooships1q13c4.setChecked(false);
			 hooships1q13c5.setChecked(false);
		     ch[12]=2;   	
		}else
			{
				ch[12]=0;
			}
				                     break;

		case R.id.hooships1q13c3: if(isChecked){
			 
			 hooships1q13c2.setChecked(false);
			 hooships1q13c1.setChecked(false);
			 hooships1q13c4.setChecked(false);
			 hooships1q13c5.setChecked(false);
		     ch[12]=3;   	
		}else
			{
				ch[12]=0;
			}
				                     break;

		case R.id.hooships1q13c4: if(isChecked){
			 
			 hooships1q13c2.setChecked(false);
			 hooships1q13c3.setChecked(false);
			 hooships1q13c1.setChecked(false);
			 hooships1q13c5.setChecked(false);
		     ch[12]=4;   	
		}else
			{
				ch[12]=0;
			}
				                     break;

		case R.id.hooships1q13c5: if(isChecked){
			 
			 hooships1q13c2.setChecked(false);
			 hooships1q13c3.setChecked(false);
			 hooships1q13c4.setChecked(false);
			 hooships1q13c1.setChecked(false);
		     ch[12]=5;   	
		}else
			{
				ch[12]=0;
			}
				                     break;

		case R.id.hooships1q14c1: if(isChecked){
			 
			 hooships1q14c2.setChecked(false);
			 hooships1q14c3.setChecked(false);
			 hooships1q14c4.setChecked(false);
			 hooships1q14c5.setChecked(false);
		     ch[13]=1;   	
		}else
			{
				ch[13]=0;
			}
				                     break;

		case R.id.hooships1q14c2: if(isChecked){
			 
			 hooships1q14c1.setChecked(false);
			 hooships1q14c3.setChecked(false);
			 hooships1q14c4.setChecked(false);
			 hooships1q14c5.setChecked(false);
		     ch[13]=2;   	
		}else
			{
				ch[13]=0;
			}
				                     break;

		case R.id.hooships1q14c3: if(isChecked){
			 
			 hooships1q14c2.setChecked(false);
			 hooships1q14c1.setChecked(false);
			 hooships1q14c4.setChecked(false);
			 hooships1q14c5.setChecked(false);
		     ch[13]=3;   	
		}else
			{
				ch[13]=0;
			}
				                     break;

		case R.id.hooships1q14c4: if(isChecked){
			 
			 hooships1q14c2.setChecked(false);
			 hooships1q14c3.setChecked(false);
			 hooships1q14c1.setChecked(false);
			 hooships1q14c5.setChecked(false);
		     ch[13]=4;   	
		}else
			{
				ch[13]=0;
			}
				                     break;

		case R.id.hooships1q14c5: if(isChecked){
			 
			 hooships1q14c2.setChecked(false);
			 hooships1q14c3.setChecked(false);
			 hooships1q14c4.setChecked(false);
			 hooships1q14c1.setChecked(false);
		     ch[13]=5;   	
		}else
			{
				ch[13]=0;
			}
				                     break;

		case R.id.hooships1q15c1: if(isChecked){
			 
			 hooships1q15c2.setChecked(false);
			 hooships1q15c3.setChecked(false);
			 hooships1q15c4.setChecked(false);
			 hooships1q15c5.setChecked(false);
		     ch[14]=1;   	
		}else
			{
				ch[14]=0;
			}
				                     break;

		case R.id.hooships1q15c2: if(isChecked){
			 
			 hooships1q15c1.setChecked(false);
			 hooships1q15c3.setChecked(false);
			 hooships1q15c4.setChecked(false);
			 hooships1q15c5.setChecked(false);
		     ch[14]=2;   	
		}else
			{
				ch[14]=0;
			}
				                     break;

		case R.id.hooships1q15c3: if(isChecked){
			 
			 hooships1q15c2.setChecked(false);
			 hooships1q15c1.setChecked(false);
			 hooships1q15c4.setChecked(false);
			 hooships1q15c5.setChecked(false);
		     ch[14]=3;   	
		}else
			{
				ch[14]=0;
			}
				                     break;

		case R.id.hooships1q15c4: if(isChecked){
			 
			 hooships1q15c2.setChecked(false);
			 hooships1q15c3.setChecked(false);
			 hooships1q15c1.setChecked(false);
			 hooships1q15c5.setChecked(false);
		     ch[14]=4;   	
		}else
			{
				ch[14]=0;
			}
				                     break;

		case R.id.hooships1q15c5: if(isChecked){
			 
			 hooships1q15c2.setChecked(false);
			 hooships1q15c3.setChecked(false);
			 hooships1q15c4.setChecked(false);
			 hooships1q15c1.setChecked(false);
		     ch[14]=5;   	
		}else
			{
				ch[14]=0;
			}
				                     break;

		case R.id.hooships2q1c1: if(isChecked){
			 
			 hooships2q1c2.setChecked(false);
			 hooships2q1c3.setChecked(false);
			 hooships2q1c4.setChecked(false);
			 hooships2q1c5.setChecked(false);
		     ch[15]=1;   	
		}else
			{
				ch[15]=0;
			}
				                     break;

		case R.id.hooships2q1c2: if(isChecked){
			 
			 hooships2q1c1.setChecked(false);
			 hooships2q1c3.setChecked(false);
			 hooships2q1c4.setChecked(false);
			 hooships2q1c5.setChecked(false);
		     ch[15]=2;   	
		}else
			{
				ch[15]=0;
			}
				                     break;

		case R.id.hooships2q1c3: if(isChecked){
			 
			 hooships2q1c2.setChecked(false);
			 hooships2q1c1.setChecked(false);
			 hooships2q1c4.setChecked(false);
			 hooships2q1c5.setChecked(false);
		     ch[15]=3;   	
		}else
			{
				ch[15]=0;
			}
				                     break;

		case R.id.hooships2q1c4: if(isChecked){
			 
			 hooships2q1c2.setChecked(false);
			 hooships2q1c3.setChecked(false);
			 hooships2q1c1.setChecked(false);
			 hooships2q1c5.setChecked(false);
		     ch[15]=4;   	
		}else
			{
				ch[15]=0;
			}
				                     break;
		

		case R.id.hooships2q1c5: if(isChecked){
			 
			 hooships2q1c2.setChecked(false);
			 hooships2q1c3.setChecked(false);
			 hooships2q1c4.setChecked(false);
			 hooships2q1c1.setChecked(false);
		     ch[15]=5;   	
		}else
			{
				ch[15]=0;
			}
				                     break;

		case R.id.hooships2q2c1: if(isChecked){
			 
			 hooships2q2c2.setChecked(false);
			 hooships2q2c3.setChecked(false);
			 hooships2q2c4.setChecked(false);
			 hooships2q2c5.setChecked(false);
		     ch[16]=1;   	
		}else
			{
				ch[16]=0;
			}
				                     break;

		case R.id.hooships2q2c2: if(isChecked){
			 
			 hooships2q2c1.setChecked(false);
			 hooships2q2c3.setChecked(false);
			 hooships2q2c4.setChecked(false);
			 hooships2q2c5.setChecked(false);
		     ch[16]=2;   	
		}else
			{
				ch[16]=0;
			}
				                     break;

		case R.id.hooships2q2c3: if(isChecked){
			 
			 hooships2q2c2.setChecked(false);
			 hooships2q2c1.setChecked(false);
			 hooships2q2c4.setChecked(false);
			 hooships2q2c5.setChecked(false);
		     ch[16]=3;   	
		}else
			{
				ch[16]=0;
			}
				                     break;

		case R.id.hooships2q2c4: if(isChecked){
			 
			 hooships2q2c2.setChecked(false);
			 hooships2q2c3.setChecked(false);
			 hooships2q2c1.setChecked(false);
			 hooships2q2c5.setChecked(false);
		     ch[16]=4;   	
		}else
			{
				ch[16]=0;
			}
				                     break;

		case R.id.hooships2q2c5: if(isChecked){
			 
			 hooships2q2c2.setChecked(false);
			 hooships2q2c3.setChecked(false);
			 hooships2q2c4.setChecked(false);
			 hooships2q2c1.setChecked(false);
		     ch[16]=5;   	
		}else
			{
				ch[16]=0;
			}
				                     break;

		case R.id.hooships2q3c1: if(isChecked){
			 
			 hooships2q3c2.setChecked(false);
			 hooships2q3c3.setChecked(false);
			 hooships2q3c4.setChecked(false);
			 hooships2q3c5.setChecked(false);
		     ch[17]=1;   	
		}else
			{
				ch[17]=0;
			}
				                     break;

		case R.id.hooships2q3c2: if(isChecked){
			 
			 hooships2q3c1.setChecked(false);
			 hooships2q3c3.setChecked(false);
			 hooships2q3c4.setChecked(false);
			 hooships2q3c5.setChecked(false);
		     ch[17]=2;   	
		}else
			{
				ch[17]=0;
			}
				                     break;

		case R.id.hooships2q3c3: if(isChecked){
			 
			 hooships2q3c2.setChecked(false);
			 hooships2q3c1.setChecked(false);
			 hooships2q3c4.setChecked(false);
			 hooships2q3c5.setChecked(false);
		     ch[17]=3;   	
		}else
			{
				ch[17]=0;
			}
				                     break;

		case R.id.hooships2q3c4: if(isChecked){
			 
			 hooships2q3c2.setChecked(false);
			 hooships2q3c3.setChecked(false);
			 hooships2q3c1.setChecked(false);
			 hooships2q3c5.setChecked(false);
		     ch[17]=4;   	
		}else
			{
				ch[17]=0;
			}
				                     break;

		case R.id.hooships2q3c5: if(isChecked){
			 
			 hooships2q3c2.setChecked(false);
			 hooships2q3c3.setChecked(false);
			 hooships2q3c4.setChecked(false);
			 hooships2q3c1.setChecked(false);
		     ch[17]=5;   	
		}else
			{
				ch[17]=0;
			}
				                     break;

		case R.id.hooships2q4c1: if(isChecked){
			 
			 hooships2q4c2.setChecked(false);
			 hooships2q4c3.setChecked(false);
			 hooships2q4c4.setChecked(false);
			 hooships2q4c5.setChecked(false);
		     ch[18]=1;   	
		}else
			{
				ch[18]=0;
			}
				                     break;

		case R.id.hooships2q4c2: if(isChecked){
			 
			 hooships2q4c1.setChecked(false);
			 hooships2q4c3.setChecked(false);
			 hooships2q4c4.setChecked(false);
			 hooships2q4c5.setChecked(false);
		     ch[18]=2;   	
		}else
			{
				ch[18]=0;
			}
				                     break;

		case R.id.hooships2q4c3: if(isChecked){
			 
			 hooships2q4c2.setChecked(false);
			 hooships2q4c1.setChecked(false);
			 hooships2q4c4.setChecked(false);
			 hooships2q4c5.setChecked(false);
		     ch[18]=3;   	
		}else
			{
				ch[18]=0;
			}
				                     break;

		case R.id.hooships2q4c4: if(isChecked){
			 
			 hooships2q4c2.setChecked(false);
			 hooships2q4c3.setChecked(false);
			 hooships2q4c1.setChecked(false);
			 hooships2q4c5.setChecked(false);
		     ch[18]=4;   	
		}else
			{
				ch[18]=0;
			}
				                     break;

		case R.id.hooships2q4c5: if(isChecked){
			 
			 hooships2q4c2.setChecked(false);
			 hooships2q4c3.setChecked(false);
			 hooships2q4c4.setChecked(false);
			 hooships2q4c1.setChecked(false);
		     ch[18]=5;   	
		}else
			{
				ch[18]=0;
			}
				                     break;

		case R.id.hooships2q5c1: if(isChecked){
			 
			 hooships2q5c2.setChecked(false);
			 hooships2q5c3.setChecked(false);
			 hooships2q5c4.setChecked(false);
			 hooships2q5c5.setChecked(false);
		     ch[19]=1;   	
		}else
			{
				ch[19]=0;
			}
				                     break;

		case R.id.hooships2q5c2: if(isChecked){
			 
			 hooships2q5c1.setChecked(false);
			 hooships2q5c3.setChecked(false);
			 hooships2q5c4.setChecked(false);
			 hooships2q5c5.setChecked(false);
		     ch[19]=2;   	
		}else
			{
				ch[19]=0;
			}
				                     break;
		
		
		case R.id.hooships2q5c3: if(isChecked){
			 
			 hooships2q5c2.setChecked(false);
			 hooships2q5c1.setChecked(false);
			 hooships2q5c4.setChecked(false);
			 hooships2q5c5.setChecked(false);
		     ch[19]=3;   	
		}else
			{
				ch[19]=0;
			}
				     break; 

		case R.id.hooships2q5c4: if(isChecked){
			 
			 hooships2q5c2.setChecked(false);
			 hooships2q5c1.setChecked(false);
			 hooships2q5c3.setChecked(false);
			 hooships2q5c5.setChecked(false);
		     ch[19]=4;   	
		}else
			{
				ch[19]=0;
			}
				     break; 

		case R.id.hooships2q5c5: if(isChecked){
			 
			 hooships2q5c2.setChecked(false);
			 hooships2q5c1.setChecked(false);
			 hooships2q5c4.setChecked(false);
			 hooships2q5c3.setChecked(false);
		     ch[19]=5;   	
		}else
			{
				ch[19]=0;
			}
				     break; 

		case R.id.hooships2q6c1: if(isChecked){
			 
			 hooships2q6c2.setChecked(false);
			 hooships2q6c3.setChecked(false);
			 hooships2q6c4.setChecked(false);
			 hooships2q6c5.setChecked(false);
		     ch[20]=1;   	
		}else
			{
				ch[20]=0;
			}
				     break; 

		case R.id.hooships2q6c2: if(isChecked){
			 
			 hooships2q6c1.setChecked(false);
			 hooships2q6c3.setChecked(false);
			 hooships2q6c4.setChecked(false);
			 hooships2q6c5.setChecked(false);
		     ch[20]=2;   	
		}else
			{
				ch[20]=0;
			}
				     break; 

		case R.id.hooships2q6c3: if(isChecked){
			 
			 hooships2q6c2.setChecked(false);
			 hooships2q6c1.setChecked(false);
			 hooships2q6c4.setChecked(false);
			 hooships2q6c5.setChecked(false);
		     ch[20]=3;   	
		}else
			{
				ch[20]=0;
			}
				     break; 

		case R.id.hooships2q6c4: if(isChecked){
			 
			 hooships2q6c2.setChecked(false);
			 hooships2q6c3.setChecked(false);
			 hooships2q6c1.setChecked(false);
			 hooships2q6c5.setChecked(false);
		     ch[20]=4;   	
		}else
			{
				ch[20]=0;
			}
				     break; 

		case R.id.hooships2q6c5: if(isChecked){
			 
			 hooships2q6c2.setChecked(false);
			 hooships2q6c3.setChecked(false);
			 hooships2q6c4.setChecked(false);
			 hooships2q6c1.setChecked(false);
		     ch[20]=5;   	
		}else
			{
				ch[20]=0;
			}
				     break; 

		case R.id.hooships2q7c1: if(isChecked){
			 
			 hooships2q7c2.setChecked(false);
			 hooships2q7c3.setChecked(false);
			 hooships2q7c4.setChecked(false);
			 hooships2q7c5.setChecked(false);
		     ch[21]=1;   	
		}else
			{
				ch[21]=0;
			}
				     break; 
		

		case R.id.hooships2q7c2: if(isChecked){
			 
			 hooships2q7c1.setChecked(false);
			 hooships2q7c3.setChecked(false);
			 hooships2q7c4.setChecked(false);
			 hooships2q7c5.setChecked(false);
		     ch[21]=2;   	
		}else
			{
				ch[21]=0;
			}
				     break; 

		case R.id.hooships2q7c3: if(isChecked){
			 
			 hooships2q7c2.setChecked(false);
			 hooships2q7c1.setChecked(false);
			 hooships2q7c4.setChecked(false);
			 hooships2q7c5.setChecked(false);
		     ch[21]=3;   	
		}else
			{
				ch[21]=0;
			}
				     break; 

		case R.id.hooships2q7c4: if(isChecked){
			 
			 hooships2q7c2.setChecked(false);
			 hooships2q7c3.setChecked(false);
			 hooships2q7c1.setChecked(false);
			 hooships2q7c5.setChecked(false);
		     ch[21]=4;   	
		}else
			{
				ch[21]=0;
			}
				     break; 

		case R.id.hooships2q7c5: if(isChecked){
			 
			 hooships2q7c2.setChecked(false);
			 hooships2q7c3.setChecked(false);
			 hooships2q7c4.setChecked(false);
			 hooships2q7c1.setChecked(false);
		     ch[21]=5;   	
		}else
			{
				ch[21]=0;
			}
				     break; 
				     

		case R.id.hooships2q8c1: if(isChecked){
			 
			 hooships2q8c2.setChecked(false);
			 hooships2q8c3.setChecked(false);
			 hooships2q8c4.setChecked(false);
			 hooships2q8c5.setChecked(false);
		     ch[22]=1;   	
		}else
			{
				ch[22]=0;
			}
				     break; 

		case R.id.hooships2q8c2: if(isChecked){
			 
			 hooships2q8c1.setChecked(false);
			 hooships2q8c3.setChecked(false);
			 hooships2q8c4.setChecked(false);
			 hooships2q8c5.setChecked(false);
		     ch[22]=2;   	
		}else
			{
				ch[22]=0;
			}
				     break; 
				     

		case R.id.hooships2q8c3: if(isChecked){
			 
			 hooships2q8c2.setChecked(false);
			 hooships2q8c1.setChecked(false);
			 hooships2q8c4.setChecked(false);
			 hooships2q8c5.setChecked(false);
		     ch[22]=3;   	
		}else
			{
				ch[22]=0;
			}
				     break; 
		

		case R.id.hooships2q8c4: if(isChecked){
			 
			 hooships2q8c2.setChecked(false);
			 hooships2q8c3.setChecked(false);
			 hooships2q8c1.setChecked(false);
			 hooships2q8c5.setChecked(false);
		     ch[22]=4;   	
		}else
			{
				ch[22]=0;
			}
				     break; 

		case R.id.hooships2q8c5: if(isChecked){
			 
			 hooships2q8c2.setChecked(false);
			 hooships2q8c3.setChecked(false);
			 hooships2q8c4.setChecked(false);
			 hooships2q8c1.setChecked(false);
		     ch[22]=5;   	
		}else
			{
				ch[22]=0;
			}
				     break; 

		case R.id.hooships2q9c1: if(isChecked){
			 
			 hooships2q9c2.setChecked(false);
			 hooships2q9c3.setChecked(false);
			 hooships2q9c4.setChecked(false);
			 hooships2q9c5.setChecked(false);
		     ch[23]=1;   	
		}else
			{
				ch[23]=0;
			}
				     break; 

		case R.id.hooships2q9c2: if(isChecked){
			 
			 hooships2q9c1.setChecked(false);
			 hooships2q9c3.setChecked(false);
			 hooships2q9c4.setChecked(false);
			 hooships2q9c5.setChecked(false);
		     ch[23]=2;   	
		}else
			{
				ch[23]=0;
			}
				     break; 

		case R.id.hooships2q9c3: if(isChecked){
			 
			 hooships2q9c2.setChecked(false);
			 hooships2q9c1.setChecked(false);
			 hooships2q9c4.setChecked(false);
			 hooships2q9c5.setChecked(false);
		     ch[23]=3;   	
		}else
			{
				ch[23]=0;
			}
				     break; 

		case R.id.hooships2q9c4: if(isChecked){
			 
			 hooships2q9c2.setChecked(false);
			 hooships2q9c3.setChecked(false);
			 hooships2q9c1.setChecked(false);
			 hooships2q9c5.setChecked(false);
		     ch[23]=4;   	
		}else
			{
				ch[23]=0;
			}
				     break; 

		case R.id.hooships2q9c5: if(isChecked){
			 
			 hooships2q9c2.setChecked(false);
			 hooships2q9c3.setChecked(false);
			 hooships2q9c4.setChecked(false);
			 hooships2q9c1.setChecked(false);
		     ch[23]=5;   	
		}else
			{
				ch[23]=0;
			}
				     break; 

		case R.id.hooships2q10c1: if(isChecked){
			 
			 hooships2q10c2.setChecked(false);
			 hooships2q10c3.setChecked(false);
			 hooships2q10c4.setChecked(false);
			 hooships2q10c5.setChecked(false);
		     ch[24]=1;   	
		}else
			{
				ch[24]=0;
			}
				     break; 

		case R.id.hooships2q10c2: if(isChecked){
			 
			 hooships2q10c1.setChecked(false);
			 hooships2q10c3.setChecked(false);
			 hooships2q10c4.setChecked(false);
			 hooships2q10c5.setChecked(false);
		     ch[24]=2;   	
		}else
			{
				ch[24]=0;
			}
				     break; 
				

		case R.id.hooships2q10c3: if(isChecked){
			 
			 hooships2q10c2.setChecked(false);
			 hooships2q10c1.setChecked(false);
			 hooships2q10c4.setChecked(false);
			 hooships2q10c5.setChecked(false);
		     ch[24]=3;   	
		}else
			{
				ch[24]=0;
			}
				     break; 

		case R.id.hooships2q10c4: if(isChecked){
			 
			 hooships2q10c2.setChecked(false);
			 hooships2q10c3.setChecked(false);
			 hooships2q10c1.setChecked(false);
			 hooships2q10c5.setChecked(false);
		     ch[24]=4;   	
		}else
			{
				ch[24]=0;
			}
				     break; 

		case R.id.hooships2q10c5: if(isChecked){
			 
			 hooships2q10c2.setChecked(false);
			 hooships2q10c3.setChecked(false);
			 hooships2q10c4.setChecked(false);
			 hooships2q10c1.setChecked(false);
		     ch[24]=5;   	
		}else
			{
				ch[24]=0;
			}
				     break; 
				     

		case R.id.hooships2q11c1: if(isChecked){
			 
			 hooships2q11c2.setChecked(false);
			 hooships2q11c3.setChecked(false);
			 hooships2q11c4.setChecked(false);
			 hooships2q11c5.setChecked(false);
		     ch[25]=1;   	
		}else
			{
				ch[25]=0;
			}
				     break; 

		case R.id.hooships2q11c2: if(isChecked){
			 
			 hooships2q11c1.setChecked(false);
			 hooships2q11c3.setChecked(false);
			 hooships2q11c4.setChecked(false);
			 hooships2q11c5.setChecked(false);
		     ch[25]=2;   	
		}else
			{
				ch[25]=0;
			}
				     break; 
				     

		case R.id.hooships2q11c3: if(isChecked){
			 
			 hooships2q11c2.setChecked(false);
			 hooships2q11c1.setChecked(false);
			 hooships2q11c4.setChecked(false);
			 hooships2q11c5.setChecked(false);
		     ch[25]=3;   	
		}else
			{
				ch[25]=0;
			}
				     break; 

		case R.id.hooships2q11c4: if(isChecked){
			 
			 hooships2q11c2.setChecked(false);
			 hooships2q11c3.setChecked(false);
			 hooships2q11c1.setChecked(false);
			 hooships2q11c5.setChecked(false);
		     ch[25]=4;   	
		}else
			{
				ch[25]=0;
			}
				     break; 

		case R.id.hooships2q11c5: if(isChecked){
			 
			 hooships2q11c2.setChecked(false);
			 hooships2q11c3.setChecked(false);
			 hooships2q11c4.setChecked(false);
			 hooships2q11c1.setChecked(false);
		     ch[25]=5;   	
		}else
			{
				ch[25]=0;
			}
				     break; 
		

		case R.id.hooships2q12c1: if(isChecked){
			 
			 hooships2q12c2.setChecked(false);
			 hooships2q12c3.setChecked(false);
			 hooships2q12c4.setChecked(false);
			 hooships2q12c5.setChecked(false);
		     ch[26]=1;   	
		}else
			{
				ch[26]=0;
			}
				     break; 

		case R.id.hooships2q12c2: if(isChecked){
			 
			 hooships2q12c1.setChecked(false);
			 hooships2q12c3.setChecked(false);
			 hooships2q12c4.setChecked(false);
			 hooships2q12c5.setChecked(false);
		     ch[26]=2;   	
		}else
			{
				ch[26]=0;
			}
				     break; 

		case R.id.hooships2q12c3: if(isChecked){
			 
			 hooships2q12c2.setChecked(false);
			 hooships2q12c1.setChecked(false);
			 hooships2q12c4.setChecked(false);
			 hooships2q12c5.setChecked(false);
		     ch[26]=3;   	
		}else
			{
				ch[26]=0;
			}
				     break; 

		case R.id.hooships2q12c4: if(isChecked){
			 
			 hooships2q12c2.setChecked(false);
			 hooships2q12c3.setChecked(false);
			 hooships2q12c1.setChecked(false);
			 hooships2q12c5.setChecked(false);
		     ch[26]=4;   	
		}else
			{
				ch[26]=0;
			}
				     break; 

		case R.id.hooships2q12c5: if(isChecked){
			 
			 hooships2q12c2.setChecked(false);
			 hooships2q12c3.setChecked(false);
			 hooships2q12c4.setChecked(false);
			 hooships2q12c1.setChecked(false);
		     ch[26]=5;   	
		}else
			{
				ch[26]=0;
			}
				     break; 

		case R.id.hooships2q13c1: if(isChecked){
			 
			 hooships2q13c2.setChecked(false);
			 hooships2q13c3.setChecked(false);
			 hooships2q13c4.setChecked(false);
			 hooships2q13c5.setChecked(false);
		     ch[27]=1;   	
		}else
			{
				ch[27]=0;
			}
				     break; 

		case R.id.hooships2q13c2: if(isChecked){
			 
			 hooships2q13c1.setChecked(false);
			 hooships2q13c3.setChecked(false);
			 hooships2q13c4.setChecked(false);
			 hooships2q13c5.setChecked(false);
		     ch[27]=2;   	
		}else
			{
				ch[27]=0;
			}
				     break; 		

		case R.id.hooships2q13c3: if(isChecked){
			 
			 hooships2q13c2.setChecked(false);
			 hooships2q13c1.setChecked(false);
			 hooships2q13c4.setChecked(false);
			 hooships2q13c5.setChecked(false);
		     ch[27]=3;   	
		}else
			{
				ch[27]=0;
			}
				     break; 

		case R.id.hooships2q13c4: if(isChecked){
			 
			 hooships2q13c2.setChecked(false);
			 hooships2q13c3.setChecked(false);
			 hooships2q13c1.setChecked(false);
			 hooships2q13c5.setChecked(false);
		     ch[27]=4;   	
		}else
			{
				ch[27]=0;
			}
				     break; 

		case R.id.hooships2q13c5: if(isChecked){
			 
			 hooships2q13c2.setChecked(false);
			 hooships2q13c3.setChecked(false);
			 hooships2q13c4.setChecked(false);
			 hooships2q13c1.setChecked(false);
		     ch[27]=5;   	
		}else
			{
				ch[27]=0;
			}
				     break; 
				     

		case R.id.hooships2q14c1: if(isChecked){
			 
			 hooships2q14c2.setChecked(false);
			 hooships2q14c3.setChecked(false);
			 hooships2q14c4.setChecked(false);
			 hooships2q14c5.setChecked(false);
		     ch[28]=1;   	
		}else
			{
				ch[28]=0;
			}
				     break; 

		case R.id.hooships2q14c2: if(isChecked){
			 
			 hooships2q14c1.setChecked(false);
			 hooships2q14c3.setChecked(false);
			 hooships2q14c4.setChecked(false);
			 hooships2q14c5.setChecked(false);
		     ch[28]=2;   	
		}else
			{
				ch[28]=0;
			}
				     break; 
				     	     

		case R.id.hooships2q14c3: if(isChecked){
			 
			 hooships2q14c2.setChecked(false);
			 hooships2q14c1.setChecked(false);
			 hooships2q14c4.setChecked(false);
			 hooships2q14c5.setChecked(false);
		     ch[28]=3;   	
		}else
			{
				ch[28]=0;
			}
				     break; 

		case R.id.hooships2q14c4: if(isChecked){
			 
			 hooships2q14c2.setChecked(false);
			 hooships2q14c3.setChecked(false);
			 hooships2q14c1.setChecked(false);
			 hooships2q14c5.setChecked(false);
		     ch[28]=4;   	
		}else
			{
				ch[28]=0;
			}
				     break; 

		case R.id.hooships2q14c5: if(isChecked){
			 
			 hooships2q14c2.setChecked(false);
			 hooships2q14c3.setChecked(false);
			 hooships2q14c4.setChecked(false);
			 hooships2q14c1.setChecked(false);
		     ch[28]=5;   	
		}else
			{
				ch[28]=0;
			}
				     break; 

		case R.id.hooships2q15c1: if(isChecked){
			 
			 hooships2q15c2.setChecked(false);
			 hooships2q15c3.setChecked(false);
			 hooships2q15c4.setChecked(false);
			 hooships2q15c5.setChecked(false);
		     ch[29]=1;   	
		}else
			{
				ch[29]=0;
			}
				     break; 

		case R.id.hooships2q15c2: if(isChecked){
			 
			 hooships2q15c2.setChecked(false);
			 hooships2q15c3.setChecked(false);
			 hooships2q15c4.setChecked(false);
			 hooships2q15c5.setChecked(false);
		     ch[29]=2;   	
		}else
			{
				ch[29]=0;
			}
				     break; 

		case R.id.hooships2q15c3: if(isChecked){
			 
			 hooships2q15c2.setChecked(false);
			 hooships2q15c1.setChecked(false);
			 hooships2q15c4.setChecked(false);
			 hooships2q15c5.setChecked(false);
		     ch[29]=3;   	
		}else
			{
				ch[29]=0;
			}
				     break; 

		case R.id.hooships2q15c4: if(isChecked){
			 
			 hooships2q15c2.setChecked(false);
			 hooships2q15c3.setChecked(false);
			 hooships2q15c1.setChecked(false);
			 hooships2q15c5.setChecked(false);
		     ch[29]=4;   	
		}else
			{
				ch[29]=0;
			}
				     break; 

		case R.id.hooships2q15c5: if(isChecked){
			 
			 hooships2q15c2.setChecked(false);
			 hooships2q15c3.setChecked(false);
			 hooships2q15c4.setChecked(false);
			 hooships2q15c1.setChecked(false);
		     ch[29]=5;   	
		}else
			{
				ch[29]=0;
			}
				     break; 

		case R.id.hooships2q16c1: if(isChecked){
			 
			 hooships2q16c2.setChecked(false);
			 hooships2q16c3.setChecked(false);
			 hooships2q16c4.setChecked(false);
			 hooships2q16c5.setChecked(false);
		     ch[30]=1;   	
		}else
			{
				ch[30]=0;
			}
				     break; 

		case R.id.hooships2q16c2: if(isChecked){
			 
			 hooships2q16c1.setChecked(false);
			 hooships2q16c3.setChecked(false);
			 hooships2q16c4.setChecked(false);
			 hooships2q16c5.setChecked(false);
		     ch[30]=2;   	
		}else
			{
				ch[30]=0;
			}
				     break; 


		case R.id.hooships2q16c3: if(isChecked){
			 
			 hooships2q16c2.setChecked(false);
			 hooships2q16c1.setChecked(false);
			 hooships2q16c4.setChecked(false);
			 hooships2q16c5.setChecked(false);
		     ch[30]=3;   	
		}else
			{
				ch[30]=0;
			}
				     break; 

		case R.id.hooships2q16c4: if(isChecked){
			 
			 hooships2q16c2.setChecked(false);
			 hooships2q16c3.setChecked(false);
			 hooships2q16c1.setChecked(false);
			 hooships2q16c5.setChecked(false);
		     ch[30]=4;   	
		}else
			{
				ch[30]=0;
			}
				     break; 

		case R.id.hooships2q16c5: if(isChecked){
			 
			 hooships2q16c2.setChecked(false);
			 hooships2q16c3.setChecked(false);
			 hooships2q16c4.setChecked(false);
			 hooships2q16c1.setChecked(false);
		     ch[30]=5;   	
		}else
			{
				ch[30]=0;
			}
				     break; 


		case R.id.hooships2q17c1: if(isChecked){
			 
			 hooships2q17c2.setChecked(false);
			 hooships2q17c3.setChecked(false);
			 hooships2q17c4.setChecked(false);
			 hooships2q17c5.setChecked(false);
		     ch[31]=1;   	
		}else
			{
				ch[31]=0;
			}
				     break; 

		case R.id.hooships2q17c2: if(isChecked){
			 
			 hooships2q17c1.setChecked(false);
			 hooships2q17c3.setChecked(false);
			 hooships2q17c4.setChecked(false);
			 hooships2q17c5.setChecked(false);
		     ch[31]=2;   	
		}else
			{
				ch[31]=0;
			}
				     break; 

		case R.id.hooships2q17c3: if(isChecked){
			 
			 hooships2q17c2.setChecked(false);
			 hooships2q17c1.setChecked(false);
			 hooships2q17c4.setChecked(false);
			 hooships2q17c5.setChecked(false);
		     ch[31]=3;   	
		}else
			{
				ch[31]=0;
			}
				     break; 

		case R.id.hooships2q17c4: if(isChecked){
			 
			 hooships2q17c2.setChecked(false);
			 hooships2q17c3.setChecked(false);
			 hooships2q17c1.setChecked(false);
			 hooships2q17c5.setChecked(false);
		     ch[31]=4;   	
		}else
			{
				ch[31]=0;
			}
				     break; 

		case R.id.hooships2q17c5: if(isChecked){
			 
			 hooships2q17c2.setChecked(false);
			 hooships2q17c3.setChecked(false);
			 hooships2q17c4.setChecked(false);
			 hooships2q17c1.setChecked(false);
		     ch[31]=5;   	
		}else
			{
				ch[31]=0;
			}
				     break; 

		case R.id.hooships3q1c1: if(isChecked){
			 
			 hooships3q1c2.setChecked(false);
			 hooships3q1c3.setChecked(false);
			 hooships3q1c4.setChecked(false);
			 hooships3q1c5.setChecked(false);
		     ch[32]=1;   	
		}else
			{
				ch[32]=0;
			}
				     break; 


		case R.id.hooships3q1c2: if(isChecked){
			 
			 hooships3q1c1.setChecked(false);
			 hooships3q1c3.setChecked(false);
			 hooships3q1c4.setChecked(false);
			 hooships3q1c5.setChecked(false);
		     ch[32]=2;   	
		}else
			{
				ch[32]=0;
			}
				     break; 

		case R.id.hooships3q1c3: if(isChecked){
			 
			 hooships3q1c2.setChecked(false);
			 hooships3q1c1.setChecked(false);
			 hooships3q1c4.setChecked(false);
			 hooships3q1c5.setChecked(false);
		     ch[32]=3;   	
		}else
			{
				ch[32]=0;
			}
				     break; 

		case R.id.hooships3q1c4: if(isChecked){
			 
			 hooships3q1c2.setChecked(false);
			 hooships3q1c3.setChecked(false);
			 hooships3q1c1.setChecked(false);
			 hooships3q1c5.setChecked(false);
		     ch[32]=4;   	
		}else
			{
				ch[32]=0;
			}
				     break; 

		case R.id.hooships3q1c5: if(isChecked){
			 
			 hooships3q1c2.setChecked(false);
			 hooships3q1c3.setChecked(false);
			 hooships3q1c4.setChecked(false);
			 hooships3q1c1.setChecked(false);
		     ch[32]=5;   	
		}else
			{
				ch[32]=0;
			}
				     break; 

		case R.id.hooships3q2c1: if(isChecked){
			 
			 hooships3q2c2.setChecked(false);
			 hooships3q2c3.setChecked(false);
			 hooships3q2c4.setChecked(false);
			 hooships3q2c5.setChecked(false);
		     ch[33]=1;   	
		}else
			{
				ch[33]=0;
			}
				     break; 

		case R.id.hooships3q2c2: if(isChecked){
			 
			 hooships3q2c1.setChecked(false);
			 hooships3q2c3.setChecked(false);
			 hooships3q2c4.setChecked(false);
			 hooships3q2c5.setChecked(false);
		     ch[33]=2;   	
		}else
			{
				ch[33]=0;
			}
				     break; 

		case R.id.hooships3q2c3: if(isChecked){
			 
			 hooships3q2c2.setChecked(false);
			 hooships3q2c1.setChecked(false);
			 hooships3q2c4.setChecked(false);
			 hooships3q2c5.setChecked(false);
		     ch[33]=3;   	
		}else
			{
				ch[33]=0;
			}
				     break; 

		case R.id.hooships3q2c4: if(isChecked){
			 
			 hooships3q2c2.setChecked(false);
			 hooships3q2c3.setChecked(false);
			 hooships3q2c1.setChecked(false);
			 hooships3q2c5.setChecked(false);
		     ch[33]=4;   	
		}else
			{
				ch[33]=0;
			}
				     break; 

		case R.id.hooships3q2c5: if(isChecked){
			 
			 hooships3q2c2.setChecked(false);
			 hooships3q2c3.setChecked(false);
			 hooships3q2c4.setChecked(false);
			 hooships3q2c1.setChecked(false);
		     ch[33]=5;   	
		}else
			{
				ch[33]=0;
			}
				     break; 

		case R.id.hooships3q3c1: if(isChecked){
			 
			 hooships3q3c2.setChecked(false);
			 hooships3q3c3.setChecked(false);
			 hooships3q3c4.setChecked(false);
			 hooships3q3c5.setChecked(false);
		     ch[34]=1;   	
		}else
			{
				ch[34]=0;
			}
				     break; 

		case R.id.hooships3q3c2: if(isChecked){
			 
			 hooships3q3c1.setChecked(false);
			 hooships3q3c3.setChecked(false);
			 hooships3q3c4.setChecked(false);
			 hooships3q3c5.setChecked(false);
		     ch[34]=2;   	
		}else
			{
				ch[34]=0;
			}
				     break; 

		case R.id.hooships3q3c3: if(isChecked){
			 
			 hooships3q3c2.setChecked(false);
			 hooships3q3c1.setChecked(false);
			 hooships3q3c4.setChecked(false);
			 hooships3q3c5.setChecked(false);
		     ch[34]=3;   	
		}else
			{
				ch[34]=0;
			}
				     break; 

		case R.id.hooships3q3c4: if(isChecked){
			 
			 hooships3q3c2.setChecked(false);
			 hooships3q3c3.setChecked(false);
			 hooships3q3c1.setChecked(false);
			 hooships3q3c5.setChecked(false);
		     ch[34]=4;   	
		}else
			{
				ch[34]=0;
			}
				     break; 

		case R.id.hooships3q3c5: if(isChecked){
			 
			 hooships3q3c2.setChecked(false);
			 hooships3q3c3.setChecked(false);
			 hooships3q3c4.setChecked(false);
			 hooships3q3c1.setChecked(false);
		     ch[34]=5;   	
		}else
			{
				ch[34]=0;
			}
				     break; 

		case R.id.hooships3q4c1: if(isChecked){
			 
			 hooships3q4c2.setChecked(false);
			 hooships3q4c3.setChecked(false);
			 hooships3q4c4.setChecked(false);
			 hooships3q4c5.setChecked(false);
		     ch[35]=1;   	
		}else
			{
				ch[35]=0;
			}
				     break; 

		case R.id.hooships3q4c2: if(isChecked){
			 
			 hooships3q4c1.setChecked(false);
			 hooships3q4c3.setChecked(false);
			 hooships3q4c4.setChecked(false);
			 hooships3q4c5.setChecked(false);
		     ch[35]=2;   	
		}else
			{
				ch[35]=0;
			}
				     break; 

		case R.id.hooships3q4c3: if(isChecked){
			 
			 hooships3q4c2.setChecked(false);
			 hooships3q4c1.setChecked(false);
			 hooships3q4c4.setChecked(false);
			 hooships3q4c5.setChecked(false);
		     ch[35]=3;   	
		}else
			{
				ch[35]=0;
			}
				     break; 
                
		case R.id.hooships3q4c4: if(isChecked){
			 
			 hooships3q4c2.setChecked(false);
			 hooships3q4c3.setChecked(false);
			 hooships3q4c1.setChecked(false);
			 hooships3q4c5.setChecked(false);
		     ch[35]=4;   	
		}else
			{
				ch[35]=0;
			}
				     break; 
	
		case R.id.hooships3q4c5: if(isChecked){
			 
			 hooships3q4c2.setChecked(false);
			 hooships3q4c3.setChecked(false);
			 hooships3q4c4.setChecked(false);
			 hooships3q4c1.setChecked(false);
		     ch[35]=5;   	
		}else
			{
				ch[35]=0;
			}
				     break; 

		case R.id.hooships3q5c1: if(isChecked){
			 
			 hooships3q5c2.setChecked(false);
			 hooships3q5c3.setChecked(false);
			 hooships3q5c4.setChecked(false);
			 hooships3q5c5.setChecked(false);
		     ch[36]=1;   	
		}else
			{
				ch[36]=0;
			}
				     break; 

		case R.id.hooships3q5c2: if(isChecked){
			 
			 hooships3q5c1.setChecked(false);
			 hooships3q5c3.setChecked(false);
			 hooships3q5c4.setChecked(false);
			 hooships3q5c5.setChecked(false);
		     ch[36]=2;   	
		}else
			{
				ch[36]=0;
			}
				     break; 

		case R.id.hooships3q5c3: if(isChecked){
			 
			 hooships3q5c2.setChecked(false);
			 hooships3q5c1.setChecked(false);
			 hooships3q5c4.setChecked(false);
			 hooships3q5c5.setChecked(false);
		     ch[36]=3;   	
		}else
			{
				ch[36]=0;
			}
				     break; 

		case R.id.hooships3q5c4: if(isChecked){
			 
			 hooships3q5c2.setChecked(false);
			 hooships3q5c3.setChecked(false);
			 hooships3q5c1.setChecked(false);
			 hooships3q5c5.setChecked(false);
		     ch[36]=4;   	
		}else
			{
				ch[36]=0;
			}
				     break; 

		case R.id.hooships3q5c5: if(isChecked){
			 
			 hooships3q5c2.setChecked(false);
			 hooships3q5c3.setChecked(false);
			 hooships3q5c4.setChecked(false);
			 hooships3q5c1.setChecked(false);
		     ch[36]=5;   	
		}else
			{
				ch[36]=0;
			}
				     break; 

		case R.id.hooships3q6c1: if(isChecked){
			 
			 hooships3q6c2.setChecked(false);
			 hooships3q6c3.setChecked(false);
			 hooships3q6c4.setChecked(false);
			 hooships3q6c5.setChecked(false);
		     ch[37]=1;   	
		}else
			{
				ch[37]=0;
			}
				     break; 

		case R.id.hooships3q6c2: if(isChecked){
			 
			 hooships3q6c1.setChecked(false);
			 hooships3q6c3.setChecked(false);
			 hooships3q6c4.setChecked(false);
			 hooships3q6c5.setChecked(false);
		     ch[37]=2;   	
		}else
			{
				ch[37]=0;
			}
				     break; 		

		case R.id.hooships3q6c3: if(isChecked){
			 
			 hooships3q6c2.setChecked(false);
			 hooships3q6c1.setChecked(false);
			 hooships3q6c4.setChecked(false);
			 hooships3q6c5.setChecked(false);
		     ch[37]=3;   	
		}else
			{
				ch[37]=0;
			}
				     break; 

		case R.id.hooships3q6c4: if(isChecked){
			 
			 hooships3q6c2.setChecked(false);
			 hooships3q6c3.setChecked(false);
			 hooships3q6c1.setChecked(false);
			 hooships3q6c5.setChecked(false);
		     ch[37]=4;   	
		}else
			{
				ch[37]=0;
			}
				     break; 		

		case R.id.hooships3q6c5: if(isChecked){
			 
			 hooships3q6c2.setChecked(false);
			 hooships3q6c3.setChecked(false);
			 hooships3q6c4.setChecked(false);
			 hooships3q6c1.setChecked(false);
		     ch[37]=5;   	
		}else
			{
				ch[37]=0;
			}
				     break; 
		

		case R.id.hooships3q7c1: if(isChecked){
			 
			 hooships3q7c2.setChecked(false);
			 hooships3q7c3.setChecked(false);
			 hooships3q7c4.setChecked(false);
			 hooships3q7c5.setChecked(false);
		     ch[38]=1;   	
		}else
			{
				ch[38]=0;
			}
				     break; 

		case R.id.hooships3q7c2: if(isChecked){
			 
			 hooships3q7c1.setChecked(false);
			 hooships3q7c3.setChecked(false);
			 hooships3q7c4.setChecked(false);
			 hooships3q7c5.setChecked(false);
		     ch[38]=2;   	
		}else
			{
				ch[38]=0;
			}
				     break; 

		case R.id.hooships3q7c3: if(isChecked){
			 
			 hooships3q7c2.setChecked(false);
			 hooships3q7c1.setChecked(false);
			 hooships3q7c4.setChecked(false);
			 hooships3q7c5.setChecked(false);
		     ch[38]=3;   	
		}else
			{
				ch[38]=0;
			}
				     break; 

		case R.id.hooships3q7c4: if(isChecked){
			 
			 hooships3q7c2.setChecked(false);
			 hooships3q7c3.setChecked(false);
			 hooships3q7c1.setChecked(false);
			 hooships3q7c5.setChecked(false);
		     ch[38]=4;   	
		}else
			{
				ch[38]=0;
			}
				     break; 

		case R.id.hooships3q7c5: if(isChecked){
			 
			 hooships3q7c2.setChecked(false);
			 hooships3q7c3.setChecked(false);
			 hooships3q7c4.setChecked(false);
			 hooships3q7c1.setChecked(false);
		     ch[38]=5;   	
		}else
			{
				ch[38]=0;
			}
				     break; 

		case R.id.hooships3q8c1: if(isChecked){
			 
			 hooships3q8c2.setChecked(false);
			 hooships3q8c3.setChecked(false);
			 hooships3q8c4.setChecked(false);
			 hooships3q8c5.setChecked(false);
		     ch[39]=1;   	
		}else
			{
				ch[39]=0;
			}
				     break; 

		case R.id.hooships3q8c2: if(isChecked){
			 
			 hooships3q8c1.setChecked(false);
			 hooships3q8c3.setChecked(false);
			 hooships3q8c4.setChecked(false);
			 hooships3q8c5.setChecked(false);
		     ch[39]=2;   	
		}else
			{
				ch[39]=0;
			}
				     break; 

		case R.id.hooships3q8c3: if(isChecked){
			 
			 hooships3q8c2.setChecked(false);
			 hooships3q8c1.setChecked(false);
			 hooships3q8c4.setChecked(false);
			 hooships3q8c5.setChecked(false);
		     ch[39]=3;   	
		}else
			{
				ch[39]=0;
			}
				     break; 

		case R.id.hooships3q8c4: if(isChecked){
			 
			 hooships3q8c2.setChecked(false);
			 hooships3q8c3.setChecked(false);
			 hooships3q8c1.setChecked(false);
			 hooships3q8c5.setChecked(false);
		     ch[39]=4;   	
		}else
			{
				ch[39]=0;
			}
				     break; 

		case R.id.hooships3q8c5: if(isChecked){
			 
			 hooships3q8c2.setChecked(false);
			 hooships3q8c3.setChecked(false);
			 hooships3q8c4.setChecked(false);
			 hooships3q8c1.setChecked(false);
		     ch[39]=5;   	
		}else
			{
				ch[39]=0;
			}
				     break; 
		
		
		
		
		}
		
	}

	@Override
	public void onClick(View v) {
	     switch(v.getId()){
	     case R.id.hooshipcancel: this.getActivity().finish();
	                              break;
	     case R.id.hooshipsave: break;
	     }
		// TODO Auto-generated method stub
		
	}

}
