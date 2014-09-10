package com.example.adapter;

import com.example.form.DatabaseHandler;
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
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;

public class harrishipfragment extends Fragment implements OnCheckedChangeListener, OnClickListener {
	EditText harrisnameedit, harrisdobedit, harrisnhsedit;
	
	CheckBox harrishipq1c1, harrishipq1c2, harrishipq1c3, harrishipq1c4, harrishipq1c5, harrishipq1c6, harrishipq2c1, harrishipq2c2, harrishipq2c3, harrishipq2c4, harrishipq3c1, harrishipq3c2, harrishipq3c3, harrishipq3c4, harrishipq3c5, harrishipq3c6, harrishipq4c1, harrishipq4c2, harrishipq4c3, harrishipq4c4, harrishipq4c5, harrishipq5c1, harrishipq5c2, harrishipq5c3, harrishipq5c4, harrishipq6c1, harrishipq6c2, harrishipq6c3, harrishipq7c1, harrishipq7c2, harrishipq7c3, harrishipq8c1, harrishipq8c2 ;
	
    Button harrishipcancel, harrishipsave;
    
	int ch[];
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
   View rootView = inflater.inflate(R.layout.harriship, container, false);
   harrisnameedit=(EditText)rootView.findViewById(R.id.harrisnameedit);
   harrisdobedit=(EditText)rootView.findViewById(R.id.harrisdobedit);
   harrisnhsedit=(EditText)rootView.findViewById(R.id.harrisnhsedit);
   
   harrishipq1c1=(CheckBox)rootView.findViewById(R.id.harrishipq1c1);
   harrishipq1c2=(CheckBox)rootView.findViewById(R.id.harrishipq1c2);
   harrishipq1c3=(CheckBox)rootView.findViewById(R.id.harrishipq1c3);
   harrishipq1c4=(CheckBox)rootView.findViewById(R.id.harrishipq1c4);
   harrishipq1c5=(CheckBox)rootView.findViewById(R.id.harrishipq1c5);
   harrishipq1c6=(CheckBox)rootView.findViewById(R.id.harrishipq1c6);
   
   harrishipq2c1=(CheckBox)rootView.findViewById(R.id.harrishipq2c1);
   harrishipq2c2=(CheckBox)rootView.findViewById(R.id.harrishipq2c2);
   harrishipq2c3=(CheckBox)rootView.findViewById(R.id.harrishipq2c3);
   harrishipq2c4=(CheckBox)rootView.findViewById(R.id.harrishipq2c4);
   
   harrishipq3c1=(CheckBox)rootView.findViewById(R.id.harrishipq3c1);
   harrishipq3c2=(CheckBox)rootView.findViewById(R.id.harrishipq3c2);
   harrishipq3c3=(CheckBox)rootView.findViewById(R.id.harrishipq3c3);
   harrishipq3c4=(CheckBox)rootView.findViewById(R.id.harrishipq3c4);
   harrishipq3c5=(CheckBox)rootView.findViewById(R.id.harrishipq3c5);
   harrishipq3c6=(CheckBox)rootView.findViewById(R.id.harrishipq3c6);
   
   harrishipq4c1=(CheckBox)rootView.findViewById(R.id.harrishipq4c1);
   harrishipq4c2=(CheckBox)rootView.findViewById(R.id.harrishipq4c2);
   harrishipq4c3=(CheckBox)rootView.findViewById(R.id.harrishipq4c3);
   harrishipq4c4=(CheckBox)rootView.findViewById(R.id.harrishipq4c4);
   harrishipq4c5=(CheckBox)rootView.findViewById(R.id.harrishipq4c5);
   
   harrishipq5c1=(CheckBox)rootView.findViewById(R.id.harrishipq5c1);
   harrishipq5c2=(CheckBox)rootView.findViewById(R.id.harrishipq5c2);
   harrishipq5c3=(CheckBox)rootView.findViewById(R.id.harrishipq5c3);
   harrishipq5c4=(CheckBox)rootView.findViewById(R.id.harrishipq5c4);
  
   harrishipq6c1=(CheckBox)rootView.findViewById(R.id.harrishipq6c1);
   harrishipq6c2=(CheckBox)rootView.findViewById(R.id.harrishipq6c2);
   harrishipq6c3=(CheckBox)rootView.findViewById(R.id.harrishipq6c3);
   
   harrishipq7c1=(CheckBox)rootView.findViewById(R.id.harrishipq7c1);
   harrishipq7c2=(CheckBox)rootView.findViewById(R.id.harrishipq7c2);
   harrishipq7c3=(CheckBox)rootView.findViewById(R.id.harrishipq7c3);
   
   harrishipq8c1=(CheckBox)rootView.findViewById(R.id.harrishipq8c1);
   harrishipq8c2=(CheckBox)rootView.findViewById(R.id.harrishipq8c2) ;
  
   harrishipcancel=(Button)rootView.findViewById(R.id.harrishipcancel);
   harrishipsave=(Button)rootView.findViewById(R.id.harrishipsave);
   //--Starting to assign Listeners
   
   harrishipq1c1.setOnCheckedChangeListener(this);
   harrishipq1c2.setOnCheckedChangeListener(this);
   harrishipq1c3.setOnCheckedChangeListener(this);
   harrishipq1c4.setOnCheckedChangeListener(this);
   harrishipq1c5.setOnCheckedChangeListener(this);
   harrishipq1c6.setOnCheckedChangeListener(this);
   
   harrishipq2c1.setOnCheckedChangeListener(this);
   harrishipq2c2.setOnCheckedChangeListener(this);
   harrishipq2c3.setOnCheckedChangeListener(this);
   harrishipq2c4.setOnCheckedChangeListener(this);
   
   harrishipq3c1.setOnCheckedChangeListener(this);
   harrishipq3c2.setOnCheckedChangeListener(this);
   harrishipq3c3.setOnCheckedChangeListener(this);
   harrishipq3c4.setOnCheckedChangeListener(this);
   harrishipq3c5.setOnCheckedChangeListener(this);
   harrishipq3c6.setOnCheckedChangeListener(this);
   
   harrishipq4c1.setOnCheckedChangeListener(this);
   harrishipq4c2.setOnCheckedChangeListener(this);
   harrishipq4c3.setOnCheckedChangeListener(this);
   harrishipq4c5.setOnCheckedChangeListener(this);
   
   harrishipq5c1.setOnCheckedChangeListener(this);
   harrishipq5c2.setOnCheckedChangeListener(this);
   harrishipq5c3.setOnCheckedChangeListener(this);
   harrishipq5c4.setOnCheckedChangeListener(this);
   
   harrishipq6c1.setOnCheckedChangeListener(this);
   harrishipq6c2.setOnCheckedChangeListener(this);
   harrishipq6c3.setOnCheckedChangeListener(this);
   
   harrishipq7c1.setOnCheckedChangeListener(this);
   harrishipq7c2.setOnCheckedChangeListener(this);
   harrishipq7c3.setOnCheckedChangeListener(this);
   
   harrishipq8c1.setOnCheckedChangeListener(this);
   harrishipq8c2.setOnCheckedChangeListener(this);
   //--Button listeners
    harrishipcancel.setOnClickListener(this);
    harrishipsave.setOnClickListener(this);
    ch=new int[8];
    return rootView;
   
 }

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		switch(buttonView.getId()){
		case R.id.harrishipq1c1 : if(isChecked){
			                       ch[0]=1;
		                           harrishipq1c2.setChecked(false);
		                           harrishipq1c3.setChecked(false); 
		                           harrishipq1c4.setChecked(false);
		                           harrishipq1c5.setChecked(false);
		                           harrishipq1c6.setChecked(false);
		                          }
		                          else
		                          ch[0]=0;
			                      break;
		case R.id.harrishipq1c2 : if(isChecked){
                                  ch[0]=2;
                                  harrishipq1c1.setChecked(false);                
                                  harrishipq1c3.setChecked(false); 
                                  harrishipq1c4.setChecked(false);
                                  harrishipq1c5.setChecked(false);
                                  harrishipq1c6.setChecked(false);
                                  }
                                  else
                                  ch[0]=0;
			                      break;
		case R.id.harrishipq1c3 : if(isChecked){
                                  ch[0]=3;
                                  harrishipq1c2.setChecked(false);
                                  harrishipq1c1.setChecked(false); 
                                  harrishipq1c4.setChecked(false);
                                  harrishipq1c5.setChecked(false);
                                  harrishipq1c6.setChecked(false);
                                  }
                                  else
                                  ch[0]=0; 
			                      break;
		case R.id.harrishipq1c4 : if(isChecked){
                                  ch[0]=4;
                                  harrishipq1c2.setChecked(false);
                                  harrishipq1c3.setChecked(false); 
                                  harrishipq1c1.setChecked(false);
                                  harrishipq1c5.setChecked(false);
                                  harrishipq1c6.setChecked(false);
                                  }
                                  else
                                  ch[0]=0;
			                      break;
		case R.id.harrishipq1c5 : if(isChecked){
                                  ch[0]=5;
                                  harrishipq1c2.setChecked(false);
                                  harrishipq1c3.setChecked(false); 
                                  harrishipq1c4.setChecked(false);
                                  harrishipq1c1.setChecked(false);
                                  harrishipq1c6.setChecked(false);
           						  }
           						  else
           					      ch[0]=0;
			                      break;
		case R.id.harrishipq1c6 : if(isChecked){
            					  ch[0]=6;
            					  harrishipq1c2.setChecked(false);
            					  harrishipq1c3.setChecked(false); 
            					  harrishipq1c4.setChecked(false);
            					  harrishipq1c5.setChecked(false);
            					  harrishipq1c1.setChecked(false);
           						  }
           						  else
           						  ch[0]=0;
			                      break;
		
		case R.id.harrishipq2c1 : if(isChecked){
            					  ch[1]=1;
            					  harrishipq2c2.setChecked(false);
            					  harrishipq2c3.setChecked(false); 
            					  harrishipq2c4.setChecked(false);
            					  }
           						  else
           						  ch[1]=0;
		 						  break;
		case R.id.harrishipq2c2 : if(isChecked){
			  					  ch[1]=2;
			  					  harrishipq2c1.setChecked(false);
			  					  harrishipq2c3.setChecked(false); 
			  					  harrishipq2c4.setChecked(false);
			                      }
				  				  else
				  				  ch[1]=0;
			                      break;
		case R.id.harrishipq2c3 : if(isChecked){
			  					  ch[1]=3;
			  					  harrishipq2c2.setChecked(false);
			  					  harrishipq2c1.setChecked(false); 
			  					  harrishipq2c4.setChecked(false);
			  					  }
				  				  else
				  				  ch[1]=0;
			                      break;
		case R.id.harrishipq2c4 : if(isChecked){
			                      ch[1]=4;
			                      harrishipq2c2.setChecked(false);
			                      harrishipq2c3.setChecked(false); 
			                      harrishipq2c1.setChecked(false);
			  				      }
				  				  else
				  				  ch[1]=0;
			                      break;
		
		case R.id.harrishipq3c1 : if(isChecked){
                     			  ch[2]=1;
                     			  harrishipq3c2.setChecked(false);
                     			  harrishipq3c3.setChecked(false); 
                     			  harrishipq3c4.setChecked(false);
                     			  harrishipq3c5.setChecked(false);
                     			  harrishipq3c6.setChecked(false);
				  				  }
				  				  else
				  				  ch[2]=0;
			                      break;
		case R.id.harrishipq3c2 : if(isChecked){
			                      ch[2]=2;
			                      harrishipq3c1.setChecked(false);
			                      harrishipq3c3.setChecked(false); 
			                      harrishipq3c4.setChecked(false);
			                      harrishipq3c5.setChecked(false);
			                      harrishipq3c6.setChecked(false);
			  					  }
								  else
								  ch[2]=0;
			                      break;
		case R.id.harrishipq3c3 : if(isChecked){
			  					  ch[2]=3;
			                      harrishipq3c2.setChecked(false);
			                      harrishipq3c1.setChecked(false); 
			                      harrishipq3c4.setChecked(false);
			                      harrishipq3c5.setChecked(false);
			                      harrishipq3c6.setChecked(false);
			                      }
			                      else
			                      ch[2]=0; 
			                      break;
		case R.id.harrishipq3c4 : if(isChecked){
			  					  ch[2]=4;
			  					  harrishipq3c2.setChecked(false);
			  					  harrishipq3c3.setChecked(false); 
			  					  harrishipq3c1.setChecked(false);
			  					  harrishipq3c5.setChecked(false);
			  					  harrishipq3c6.setChecked(false);
			  					  }
			  					  else
			  					  ch[2]=0; 
			                      break;
		case R.id.harrishipq3c5 : if(isChecked){
			                      ch[2]=5;
			                      harrishipq3c2.setChecked(false);
			                      harrishipq3c3.setChecked(false); 
			                      harrishipq3c4.setChecked(false);
			                      harrishipq3c1.setChecked(false);
			                      harrishipq3c6.setChecked(false);
			  					  }
			                      else
			                      ch[2]=0; 
			                      break;
		case R.id.harrishipq3c6 : if(isChecked){
			                      ch[2]=6;
			                      harrishipq3c2.setChecked(false);
			                      harrishipq3c3.setChecked(false); 
			                      harrishipq3c4.setChecked(false);
			                      harrishipq3c5.setChecked(false);
			                      harrishipq3c1.setChecked(false);
			  					  }
			  					  else
			  					  ch[2]=0;
			                      break;
		
		case R.id.harrishipq4c1 : if(isChecked){
			                      ch[3]=1;
			                      harrishipq4c2.setChecked(false);
			                      harrishipq4c3.setChecked(false); 
			                      harrishipq4c4.setChecked(false);
			                      harrishipq4c5.setChecked(false);
			                      }
			  					  else
			  					  ch[3]=0; 
			                      break;
		case R.id.harrishipq4c2 : if(isChecked){
            				      ch[3]=2;
            				      harrishipq4c1.setChecked(false);
            				      harrishipq4c3.setChecked(false); 
            				      harrishipq4c4.setChecked(false);
            				      harrishipq4c5.setChecked(false);
            					  }
			  					  else
			  					  ch[3]=0; 
			                      break;
		case R.id.harrishipq4c3 : if(isChecked){
            					  ch[3]=3;
            					  harrishipq4c2.setChecked(false);
            					  harrishipq4c1.setChecked(false); 
            					  harrishipq4c4.setChecked(false);
            					  harrishipq4c5.setChecked(false);
            					  }
			  					  else
			  				      ch[3]=0; 
			                      break;
		case R.id.harrishipq4c4 : if(isChecked){
            					  ch[3]=4;
            					  harrishipq4c2.setChecked(false);
            					  harrishipq4c3.setChecked(false); 
            					  harrishipq4c1.setChecked(false);
            					  harrishipq4c5.setChecked(false);
                                  }
			  					  else
			  					  ch[3]=0;
		                          break;
		case R.id.harrishipq4c5 : if(isChecked){
            					  ch[3]=5;
            					  harrishipq4c2.setChecked(false);
            					  harrishipq4c3.setChecked(false); 
            					  harrishipq4c4.setChecked(false);
            					  harrishipq4c1.setChecked(false);
                                  }
			  					  else
			                      ch[3]=0; 
			                      break;
		
		case R.id.harrishipq5c1 : if(isChecked){
                                  ch[4]=1;
                                  harrishipq5c2.setChecked(false);
                                  harrishipq5c3.setChecked(false); 
                                  harrishipq5c4.setChecked(false);
                                  }
			                      else
			                      ch[4]=0; 
			                      break;
		case R.id.harrishipq5c2 : if(isChecked){
                                  ch[4]=2;
                                  harrishipq5c1.setChecked(false);
                                  harrishipq5c3.setChecked(false); 
                                  harrishipq5c4.setChecked(false);
            					  }
            					  else
            				      ch[4]=0; 
			                      break;
		case R.id.harrishipq5c3 : if(isChecked){
            					  ch[4]=3;
            					  harrishipq5c2.setChecked(false);
            					  harrishipq5c1.setChecked(false); 
            					  harrishipq5c4.setChecked(false);
            					  }
            					  else
            				      ch[4]=0; 
			                      break;
		case R.id.harrishipq5c4 : if(isChecked){
            					  ch[4]=4;
            					  harrishipq5c2.setChecked(false);
            					  harrishipq5c3.setChecked(false); 
            					  harrishipq5c1.setChecked(false);
                                  }
            					  else
            				      ch[4]=0; 
			                      break;
		
		case R.id.harrishipq6c1 : if(isChecked){
            					  ch[5]=1;
            					  harrishipq6c2.setChecked(false);
            					  harrishipq6c3.setChecked(false); 
            					  }
            					  else
            					  ch[5]=0; 
			                      break;
		case R.id.harrishipq6c2 : if(isChecked){
			  					  ch[5]=2;
			  					  harrishipq6c1.setChecked(false);
			  					  harrishipq6c3.setChecked(false); 
			  					  }
			  					  else
			  					  ch[5]=0;
			                      break;
		case R.id.harrishipq6c3 : if(isChecked){
			  					  ch[5]=1;
			  					  harrishipq6c2.setChecked(false);
			  					  harrishipq6c1.setChecked(false); 
			  					  }
			                      else
			                      ch[5]=0;
			                      break;
		
		case R.id.harrishipq7c1 : if(isChecked){
			                      ch[6]=1;
			                      harrishipq7c2.setChecked(false);
			                      harrishipq7c3.setChecked(false); 
			  					  }
			  					  else
			  					  ch[6]=0;
			                      break; 
		case R.id.harrishipq7c2 : if(isChecked){
            					  ch[6]=2;
            					  harrishipq7c1.setChecked(false);
            					  harrishipq7c3.setChecked(false); 
			  					  }
			                      else
			                      ch[6]=0;
			                      break;
		case R.id.harrishipq7c3 : if(isChecked){
            					  ch[6]=3;
            					  harrishipq7c2.setChecked(false);
                                  harrishipq7c1.setChecked(false); 
			  					  }
			  					  else
			  					  ch[6]=0;
			                      break;
		
		case R.id.harrishipq8c1 : if(isChecked){
            				      ch[7]=1;
            				      harrishipq8c2.setChecked(false);
                                  }
			  					  else
			                      ch[7]=0;
			                      break;
		case R.id.harrishipq8c2 : if(isChecked){
								  ch[7]=1;
								  harrishipq8c1.setChecked(false);
            					  }
			  					  else
			  					  ch[7]=0;
                                  break;
		
 		}
		
	
	}
	public void save()
	{
		String[] s=new String[11];
		s[0]=harrisnameedit.getText().toString();
		s[1]=harrisdobedit.getText().toString();
		s[2]=harrisnhsedit.getText().toString();
		for(int i=0;i<8;i++){
			s[i+3]=String.valueOf(ch[0]);
		}
		DatabaseHandler d=new DatabaseHandler(this.getActivity().getApplicationContext());
	    if(d.adddata(s,null,null)==1)
	    		{
	    		Toast.makeText(this.getActivity().getApplicationContext(), "Please enter all details first", Toast.LENGTH_LONG).show();
	    		}
	    else
	    	Toast.makeText(this.getActivity().getApplicationContext(), "Done", Toast.LENGTH_LONG).show();
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.harrishipcancel : this.getActivity().finish();
			                        break;
		case R.id.harrishipsave :   save();
			                        break;
		}
	}

	

}
