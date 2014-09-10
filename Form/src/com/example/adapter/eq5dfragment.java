package com.example.adapter;

import org.xmlpull.v1.XmlPullParserException;

import com.example.form.DatabaseHandler;
import com.example.form.R;

import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.SeekBar;
 
public class eq5dfragment extends Fragment implements OnClickListener, OnCheckedChangeListener, OnSeekBarChangeListener {
    CheckBox eq5dq1c1,eq5dq1c2,eq5dq1c3,eq5dq1c4,eq5dq1c5,eq5dq2c1,eq5dq2c2,eq5dq2c3,eq5dq2c4,eq5dq2c5,eq5dq3c1,eq5dq3c2,eq5dq3c3,eq5dq3c4,eq5dq3c5,eq5dq4c1,eq5dq4c2,eq5dq4c3,eq5dq4c4,eq5dq4c5,eq5dq5c1,eq5dq5c2,eq5dq5c3,eq5dq5c4,eq5dq5c5;
    SeekBar eq5dq6seek;
    EditText eq5dq7a;
    Button eq5dcancel,eq5dsave;
    TextView eq5dq6seeknumber;
    View rootView;
    int[] ch;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
   rootView = inflater.inflate(R.layout.eq5d, container, false);
        ch=new int[7];
        
        eq5dq1c1=(CheckBox)rootView.findViewById(R.id.eq5dq1c1); 
        eq5dq1c2=(CheckBox)rootView.findViewById(R.id.eq5dq1c2); 
        eq5dq1c3=(CheckBox)rootView.findViewById(R.id.eq5dq1c3);
        eq5dq1c4=(CheckBox)rootView.findViewById(R.id.eq5dq1c4);
        eq5dq1c5=(CheckBox)rootView.findViewById(R.id.eq5dq1c5);
        
        eq5dq2c1=(CheckBox)rootView.findViewById(R.id.eq5dq2c1);
        eq5dq2c2=(CheckBox)rootView.findViewById(R.id.eq5dq2c2);
        eq5dq2c3=(CheckBox)rootView.findViewById(R.id.eq5dq2c3);
        eq5dq2c4=(CheckBox)rootView.findViewById(R.id.eq5dq2c4);
        eq5dq2c5=(CheckBox)rootView.findViewById(R.id.eq5dq2c5);
        
        eq5dq3c1=(CheckBox)rootView.findViewById(R.id.eq5dq3c1);
        eq5dq3c2=(CheckBox)rootView.findViewById(R.id.eq5dq3c2);
        eq5dq3c3=(CheckBox)rootView.findViewById(R.id.eq5dq3c3);
        eq5dq3c4=(CheckBox)rootView.findViewById(R.id.eq5dq3c4);
        eq5dq3c5=(CheckBox)rootView.findViewById(R.id.eq5dq3c5);
        
        eq5dq4c1=(CheckBox)rootView.findViewById(R.id.eq5dq4c1);
        eq5dq4c2=(CheckBox)rootView.findViewById(R.id.eq5dq4c2);
        eq5dq4c3=(CheckBox)rootView.findViewById(R.id.eq5dq4c3);
        eq5dq4c4=(CheckBox)rootView.findViewById(R.id.eq5dq4c4);
        eq5dq4c5=(CheckBox)rootView.findViewById(R.id.eq5dq4c5);
        
        eq5dq5c1=(CheckBox)rootView.findViewById(R.id.eq5dq5c1);
        eq5dq5c2=(CheckBox)rootView.findViewById(R.id.eq5dq5c2);
        eq5dq5c3=(CheckBox)rootView.findViewById(R.id.eq5dq5c3);
        eq5dq5c4=(CheckBox)rootView.findViewById(R.id.eq5dq5c4);
        eq5dq5c5=(CheckBox)rootView.findViewById(R.id.eq5dq5c5);
        
        eq5dq6seek=(SeekBar)rootView.findViewById(R.id.eq5dq6seek);
        eq5dq6seeknumber=(TextView)rootView.findViewById(R.id.eq5dq6seeknumber);
        
        eq5dq7a=(EditText)rootView.findViewById(R.id.eq5dq7a);
        
        eq5dcancel=(Button)rootView.findViewById(R.id.eq5dcancel);
        eq5dsave=(Button)rootView.findViewById(R.id.eq5dsave);
        
        eq5dcancel.setOnClickListener(this);
        eq5dsave.setOnClickListener(this);
        
        eq5dq1c1.setOnCheckedChangeListener(this);
        eq5dq1c2.setOnCheckedChangeListener(this);
        eq5dq1c3.setOnCheckedChangeListener(this);
        eq5dq1c4.setOnCheckedChangeListener(this);
        eq5dq1c5.setOnCheckedChangeListener(this);

        eq5dq2c1.setOnCheckedChangeListener(this);
        eq5dq2c2.setOnCheckedChangeListener(this);
        eq5dq2c3.setOnCheckedChangeListener(this);
        eq5dq2c4.setOnCheckedChangeListener(this);
        eq5dq2c5.setOnCheckedChangeListener(this);
        
        eq5dq3c1.setOnCheckedChangeListener(this);
        eq5dq3c2.setOnCheckedChangeListener(this);
        eq5dq3c3.setOnCheckedChangeListener(this);
        eq5dq3c4.setOnCheckedChangeListener(this);
        eq5dq3c5.setOnCheckedChangeListener(this);
        
        eq5dq4c1.setOnCheckedChangeListener(this);
        eq5dq4c2.setOnCheckedChangeListener(this);
        eq5dq4c3.setOnCheckedChangeListener(this);
        eq5dq4c4.setOnCheckedChangeListener(this);
        eq5dq4c5.setOnCheckedChangeListener(this);
        
        eq5dq5c1.setOnCheckedChangeListener(this);
        eq5dq5c2.setOnCheckedChangeListener(this);
        eq5dq5c3.setOnCheckedChangeListener(this);
        eq5dq5c4.setOnCheckedChangeListener(this);
        eq5dq5c5.setOnCheckedChangeListener(this);
        
        eq5dq6seek.setOnSeekBarChangeListener(this);
        return rootView;
    }
    public void save(){
    	
      ch[5]=eq5dq6seek.getProgress();
      if(eq5dq7a.getText().toString().equalsIgnoreCase(""))
      ch[6]=0;
      else
      ch[6]=Integer.parseInt(eq5dq7a.getText().toString());
      DatabaseHandler db=new DatabaseHandler(this.getActivity().getApplicationContext());
   	  DatabaseHandler.datatable=2;
   	  int z = db.adddata(new String[0],null,ch);
   	  if(z==1)
   		 {
   			 Toast.makeText(this.getActivity().getApplicationContext(),"Please fill all the details", Toast.LENGTH_LONG).show();
   			 
   		 }
   		 else
   		 {
   			 Toast.makeText(this.getActivity().getApplicationContext(),"Done",Toast.LENGTH_LONG).show();
   		 }
    	
    }
    public void changeseek(int progress){
         TextView t=(TextView)rootView.findViewById(R.id.eq5dq6seeknumber);
         t.setText(progress);
    }
	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.eq5dcancel : this.getActivity().finish();
			break;
		case R.id.eq5dsave :save();
			                break;
		}
		
	}
	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		switch(buttonView.getId()){
		case R.id.eq5dq1c1 : if(isChecked){
			                 ch[0]=1;
			                 eq5dq1c2.setChecked(false);
		                     eq5dq1c3.setChecked(false);
		                     eq5dq1c4.setChecked(false);
		                     eq5dq1c5.setChecked(false);
		}
		                     else
		                     ch[0]=0;
		                     
		                     
		                     break;
		case R.id.eq5dq1c2 : if(isChecked){
                             ch[0]=1;
                             eq5dq1c1.setChecked(false);
                             eq5dq1c3.setChecked(false);
                             eq5dq1c4.setChecked(false);
                             eq5dq1c5.setChecked(false);
                             }
                             else
                             ch[0]=0;
                             
                             break;
		case R.id.eq5dq1c3 : if(isChecked){
            ch[0]=1;
            eq5dq1c2.setChecked(false);
            eq5dq1c1.setChecked(false);
            eq5dq1c4.setChecked(false);
            eq5dq1c5.setChecked(false);
            }
            else
            ch[0]=0;
            
            break;
		case R.id.eq5dq1c4 : if(isChecked)
		{
            ch[0]=1;
            eq5dq1c2.setChecked(false);
            eq5dq1c3.setChecked(false);
            eq5dq1c1.setChecked(false);
            eq5dq1c5.setChecked(false);
            }
            else
            ch[0]=0;
            
            
            break;
		case R.id.eq5dq1c5 : if(isChecked)
            {
			ch[0]=1;
			eq5dq1c2.setChecked(false);
            eq5dq1c3.setChecked(false);
            eq5dq1c4.setChecked(false);
            eq5dq1c1.setChecked(false);
            }
            else
            ch[0]=0;
            
            break;
		case R.id.eq5dq2c1 : if(isChecked){
            ch[1]=1;
            eq5dq2c2.setChecked(false);
            eq5dq2c3.setChecked(false);
            eq5dq2c4.setChecked(false);
            eq5dq2c5.setChecked(false);}
            else
            ch[1]=0;
		    
            break;
		case R.id.eq5dq2c2 : if(isChecked){
            ch[1]=1;

            eq5dq2c1.setChecked(false);
            eq5dq2c3.setChecked(false);
            eq5dq2c4.setChecked(false);
            eq5dq2c5.setChecked(false);
            }
            else
            ch[1]=0;	
            break;
		case R.id.eq5dq2c3 : if(isChecked){
            ch[1]=1;
            eq5dq2c2.setChecked(false);
            eq5dq2c1.setChecked(false);
            eq5dq2c4.setChecked(false);
            eq5dq2c5.setChecked(false);}
            else
            ch[1]=0;
            
            break;
		case R.id.eq5dq2c4 : if(isChecked){
            ch[1]=1;
            eq5dq2c2.setChecked(false);
            eq5dq2c3.setChecked(false);
            eq5dq2c1.setChecked(false);
            eq5dq2c5.setChecked(false);}
            else
            ch[1]=0;
            
            break;
		case R.id.eq5dq2c5 : if(isChecked){
            ch[1]=1;
            eq5dq2c2.setChecked(false);
            eq5dq2c3.setChecked(false);
            eq5dq2c4.setChecked(false);
            eq5dq2c1.setChecked(false);}
            else
            ch[1]=0;
            
            break;
		case R.id.eq5dq3c1 : if(isChecked){
            ch[2]=1;
            eq5dq3c2.setChecked(false);
            eq5dq3c3.setChecked(false);
            eq5dq3c4.setChecked(false);
            eq5dq3c5.setChecked(false);}
            else
            ch[2]=0;
            
            break;    
		case R.id.eq5dq3c2 : if(isChecked){
            ch[2]=1;
            eq5dq3c1.setChecked(false);
            eq5dq3c3.setChecked(false);
            eq5dq3c4.setChecked(false);
            eq5dq3c5.setChecked(false);}
            else
            ch[2]=0;
            
            break;  
		case R.id.eq5dq3c3 : if(isChecked){
            ch[2]=1;
            eq5dq3c2.setChecked(false);
            eq5dq3c1.setChecked(false);
            eq5dq3c4.setChecked(false);
            eq5dq3c5.setChecked(false);}
            else
            ch[2]=0;
            break;
		case R.id.eq5dq3c4 : if(isChecked){
            ch[2]=1;
            eq5dq3c2.setChecked(false);
            eq5dq3c3.setChecked(false);
            eq5dq3c1.setChecked(false);
            eq5dq3c5.setChecked(false);}
            else
            ch[2]=0;
            break;
		case R.id.eq5dq3c5 : if(isChecked){
            ch[2]=1;
            eq5dq3c2.setChecked(false);
            eq5dq3c3.setChecked(false);
            eq5dq3c4.setChecked(false);
            eq5dq3c1.setChecked(false);}
            else
            ch[2]=0;
            
            break;
		case R.id.eq5dq4c1 : if(isChecked){
            ch[3]=1;
            eq5dq4c2.setChecked(false);
            eq5dq4c3.setChecked(false);
            eq5dq4c4.setChecked(false);
            eq5dq4c5.setChecked(false);
            }
            else
            ch[3]=0;
            break;
		case R.id.eq5dq4c2 : if(isChecked){
            ch[3]=1;
            eq5dq4c1.setChecked(false);
            eq5dq4c3.setChecked(false);
            eq5dq4c4.setChecked(false);
            eq5dq4c5.setChecked(false);
            }
            else
            ch[3]=0;
            break;
		case R.id.eq5dq4c3 : if(isChecked){
            ch[3]=1;
		eq5dq4c2.setChecked(false);
        eq5dq4c1.setChecked(false);
        eq5dq4c4.setChecked(false);
        eq5dq4c5.setChecked(false);
        }
            else
            ch[3]=0;
            break;
		case R.id.eq5dq4c4 : if(isChecked){
	                        ch[3]=1;
	                        eq5dq4c2.setChecked(false);
	                        eq5dq4c3.setChecked(false);
	                        eq5dq4c1.setChecked(false);
	                        eq5dq4c5.setChecked(false);
	                        
		}
            else
            ch[3]=0;
            break;
		case R.id.eq5dq4c5 : if(isChecked){
            ch[3]=1;
            eq5dq4c2.setChecked(false);
            eq5dq4c3.setChecked(false);
            eq5dq4c4.setChecked(false);
            eq5dq4c1.setChecked(false);
		}
		else
            ch[3]=0;
            
            break;
		case R.id.eq5dq5c1 : if(isChecked){
            ch[4]=1;
            eq5dq5c2.setChecked(false);
            eq5dq5c3.setChecked(false);
            eq5dq5c4.setChecked(false);
            eq5dq5c5.setChecked(false);
            }
            else
            ch[4]=0;
            break;
		case R.id.eq5dq5c2 : if(isChecked){
            ch[4]=1;
            eq5dq5c1.setChecked(false);
            eq5dq5c3.setChecked(false);
            eq5dq5c4.setChecked(false);
            eq5dq5c5.setChecked(false);
            }
            else
            ch[4]=0;
            break;
		case R.id.eq5dq5c3 : if(isChecked){
            ch[4]=1;
            eq5dq5c2.setChecked(false);
            eq5dq5c1.setChecked(false);
            eq5dq5c4.setChecked(false);
            eq5dq5c5.setChecked(false);
            }
            else
            ch[4]=0;
            break;
		case R.id.eq5dq5c4 : if(isChecked){
            ch[4]=1;
            eq5dq5c2.setChecked(false);
            eq5dq5c3.setChecked(false);
            eq5dq5c1.setChecked(false);
            eq5dq5c5.setChecked(false);
            }
            else
            ch[4]=0;
            break;
		case R.id.eq5dq5c5 : if(isChecked){
            ch[4]=1;
            eq5dq5c2.setChecked(false);
            eq5dq5c3.setChecked(false);
            eq5dq5c4.setChecked(false);
            eq5dq5c5.setChecked(false);
        }
            else
            ch[4]=0;
                break;
		
		
		}
		
	}
	@Override
	public void onProgressChanged(SeekBar seekBar, int progress,
			boolean fromUser) {
		
			eq5dq6seeknumber.setText(String.valueOf(progress));
		
		
	}
	@Override
	public void onStartTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void onStopTrackingTouch(SeekBar seekBar) {
		// TODO Auto-generated method stub
		
	}
}