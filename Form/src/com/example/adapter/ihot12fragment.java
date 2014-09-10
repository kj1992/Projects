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
import android.widget.SeekBar;
import android.widget.Toast;
 
public class ihot12fragment extends Fragment implements OnClickListener {
  
	SeekBar ihotq1seek, ihotq2seek, ihotq3seek, ihotq4seek, ihotq5seek, ihotq6seek, ihotq7seek, ihotq8seek, ihotq9seek, ihotq10seek, ihotq11seek, ihotq12seek;
    CheckBox ihotq9check;
    Button ihotcancel, ihotsave;
	
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
   View rootView = inflater.inflate(R.layout.ihot12, container, false);
         ihotq1seek=(SeekBar)rootView.findViewById(R.id.ihotq1seek);
         ihotq2seek=(SeekBar)rootView.findViewById(R.id.ihotq2seek);
         ihotq3seek=(SeekBar)rootView.findViewById(R.id.ihotq3seek);
         ihotq4seek=(SeekBar)rootView.findViewById(R.id.ihotq4seek);
         ihotq5seek=(SeekBar)rootView.findViewById(R.id.ihotq5seek);
         ihotq6seek=(SeekBar)rootView.findViewById(R.id.ihotq6seek);
         ihotq7seek=(SeekBar)rootView.findViewById(R.id.ihotq7seek);
         ihotq8seek=(SeekBar)rootView.findViewById(R.id.ihotq8seek);
         ihotq9seek=(SeekBar)rootView.findViewById(R.id.ihotq9seek);
         ihotq10seek=(SeekBar)rootView.findViewById(R.id.ihotq10seek);
         ihotq11seek=(SeekBar)rootView.findViewById(R.id.ihotq11seek);
         ihotq12seek=(SeekBar)rootView.findViewById(R.id.ihotq12seek);
         ihotq9check=(CheckBox)rootView.findViewById(R.id.ihotq9check);
         ihotcancel=(Button)rootView.findViewById(R.id.ihotcancel);
         ihotsave=(Button)rootView.findViewById(R.id.ihotsave);
         ihotsave.setOnClickListener(this);
         ihotcancel.setOnClickListener(this);
         return rootView;
    }
	public void save()
	{
	  int[] x = new int[13];
	  x[0]=ihotq1seek.getProgress();
	  x[1]=ihotq2seek.getProgress();
	  x[2]=ihotq3seek.getProgress();
	  x[3]=ihotq4seek.getProgress();
	  x[4]=ihotq5seek.getProgress();
	  x[5]=ihotq6seek.getProgress();
	  x[6]=ihotq7seek.getProgress();
	  x[7]=ihotq8seek.getProgress();
	  x[8]=ihotq9seek.getProgress();
	  if(ihotq9check.isChecked())
	  {
		  x[9]=1;
	  }
	  else
		  x[9]=0;
	  x[10]=ihotq10seek.getProgress();
	  x[11]=ihotq11seek.getProgress();
	  x[12]=ihotq12seek.getProgress();
	  DatabaseHandler db=new DatabaseHandler(this.getActivity().getApplicationContext());
	  DatabaseHandler.datatable=1;
	  int z = db.adddata(new String[0],x,null);
	  if(z==1)
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
		switch(v.getId()){
		case R.id.ihotsave : save();
		                      break;
		case R.id.ihotcancel : this.getActivity().finish();
			                   break;
		}
	}
}