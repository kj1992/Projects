package com.example.form;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity implements OnClickListener{
    Button exit, questionnaire, patientconsent, harrishipbutton, nonarthoplastybutton, hooshipbutton;
    Intent I;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		setContentView(R.layout.main2);
		exit=(Button)findViewById(R.id.mainexit);
	    harrishipbutton=(Button)findViewById(R.id.harrishipbutton);
		questionnaire=(Button)findViewById(R.id.questionnairebutton);
		patientconsent=(Button)findViewById(R.id.patientbutton);
		nonarthoplastybutton=(Button)findViewById(R.id.nonarthoplastybutton);
		hooshipbutton=(Button)findViewById(R.id.hooshipbutton);
		exit.setOnClickListener(this);
		patientconsent.setOnClickListener(this);
		questionnaire.setOnClickListener(this);
		harrishipbutton.setOnClickListener(this);
		nonarthoplastybutton.setOnClickListener(this);
		hooshipbutton.setOnClickListener(this);
		super.onCreate(savedInstanceState);
	}
	@Override
	public void onClick(View v) {
		switch(v.getId())
		{
		case R.id.mainexit : finish();
		                     break;
		case R.id.patientbutton: I = new Intent(this, patientconsentform.class);   
		                         startActivity(I);
		                         break;
		case R.id.questionnairebutton: I=new Intent(this, questionnaire.class);
		                               startActivity(I);
		                               break;
		case R.id.harrishipbutton: I=new Intent(this,harrishipmain.class);                               
		                               startActivity(I);
		                               break;
		case R.id.nonarthoplastybutton: I=new Intent(this,nonarthoplasty.class);
		                                startActivity(I);
				                        break;
		case R.id.hooshipbutton: I=new Intent(this,hooshipmain.class);
        startActivity(I);
        break;
		}// TODO Auto-generated method stub
		
	}
	
}