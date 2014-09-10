package com.example.form;



import android.support.v7.app.ActionBarActivity;
import android.support.v4.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

public class patientconsentform extends ActionBarActivity {
    
    
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.harrishipmain);
		
		
		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.harrishipcontainer, new PlaceholderFragment()).commit();
			
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		return false;

		// Inflate the menu; this adds items to the action bar if it is present.
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		return super.onOptionsItemSelected(null);
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		
	}
	
	/**
	 * A placeholder fragment containing a simple view.
	 */
	public class PlaceholderFragment extends Fragment implements OnClickListener {
		EditText Surname,Forename,Email,Home,PostalCode,Signature,DateOfSigning;
	    DatePicker DOB;
	    CheckBox Consent;
	    Button Save,Cancel;
	    
		
		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			Surname=(EditText)rootView.findViewById(R.id.surnameedittext);
			Forename=(EditText)rootView.findViewById(R.id.forenameedittext);
			Email=(EditText)rootView.findViewById(R.id.emailedittext);
			Home=(EditText)rootView.findViewById(R.id.homeedittext);
			PostalCode=(EditText)rootView.findViewById(R.id.postedittext);
			Signature=(EditText)rootView.findViewById(R.id.signatureedittext);
			DateOfSigning=(EditText)rootView.findViewById(R.id.dateedittext);
			DOB=(DatePicker)rootView.findViewById(R.id.DOBpicker);
			Consent=(CheckBox)rootView.findViewById(R.id.consentchoeckbox);
			Save=(Button)rootView.findViewById(R.id.Savebtn);
			Cancel=(Button)rootView.findViewById(R.id.Cancelbtn);
			Save.setOnClickListener(this);
			Cancel.setOnClickListener(this);
			
			return rootView;
		}
		private void savedata() {
			 String[] data=new String[9];
			 data[0]=Surname.getText().toString();
			 data[1]=Forename.getText().toString();
			 data[2]=Email.getText().toString();
			 data[3]=Home.getText().toString();
			 data[4]=PostalCode.getText().toString();
			 data[5]=Signature.getText().toString();
			 if(Consent.isChecked())
			 data[6]="true";
			 else
		     data[6]=null;
			 data[7]=DOB.getDayOfMonth() + "" + DOB.getMonth() + "" + DOB.getYear();
			 data[8]=DateOfSigning.getText().toString();
			 DatabaseHandler db=new DatabaseHandler(this.getActivity().getApplicationContext());
			 DatabaseHandler.datatable=0;
			 int x = db.adddata(data,null,null);
			 if(x==1)
			 {
				 Toast.makeText(this.getActivity().getApplicationContext(),"Please fill all the details", Toast.LENGTH_LONG).show();
				 
			 }
			 else
			 {
				 Toast.makeText(this.getActivity().getApplicationContext(),"Done",Toast.LENGTH_LONG).show();
			 }
			
		}

		@Override
		public void onClick(View v) {
			switch(v.getId())
			{
			case R.id.Savebtn :  savedata();
				                 break;
			case R.id.Cancelbtn: this.getActivity().finish();		
				                 break;
			}
		}
		
	}

	

	
}
