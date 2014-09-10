package com.example.form;

import java.sql.Date;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler extends SQLiteOpenHelper {
 
    // All Static variables
    // Database Version
    private static final int DATABASE_VERSION = 1;
 
    // Database Name
    private static final String DATABASE_NAME = "nahr";
 
    // Contacts table name
    public static final String TABLE_NAME1 = "patient_details";
    public static final String TABLE_NAME2 = "ihot12";
    public static final String TABLE_NAME3 = "eq5d";
    public static final String TABLE_NAME4 = "harriship";
    // Contacts Table Columns names
    private static final String KEY_ID = "id";
    public static final String KEY_SURNAME = "SURNAME";
    public static final String KEY_FORENAME = "FORENAME"; 
    public static final String KEY_DOB = "DATE_OF_BIRTH"; 
    public static final String KEY_EMAIL = "EMAIL"; 
    public static final String KEY_HOMEADDRESS="HOME";
    public static final String KEY_POSTALCODE="POST";
    public static final String KEY_CONSENT="CONSENT";
    public static final String KEY_SIGNATURE="SIGNATURE";
    public static final String KEY_DATE="DATE";
    //2nd table variables
    public static final String KEY_HIPPAIN = "HIP_PAIN";
    public static final String KEY_FLOORDIFFICULTY = "FLOOR_DIFFICULTY";
    public static final String KEY_DISTANCEDIFFICULTY = "DISTANCE_DIFFICULTY";
    public static final String KEY_GRINDINGTROUBLE = "GRINDING_TROUBLE";
    public static final String KEY_WORKTROUBLE = "WORK_TROUBLE";
    public static final String KEY_CUTTINGCONCERN = "CUTTING_CONCERN";
    public static final String KEY_ACTIVITYPAIN = "ACTIVITY_PAIN";
    public static final String KEY_PICKINGCONCERN = "PICKING_CONCERN";
    public static final String KEY_SEXTROUBLE = "SEX_TROUBLE";
    public static final String KEY_SEXTROUBLECHECK = "SEX_TROUBLE_CHECK";
    public static final String KEY_AWARETIME = "AWARE_TIME";
    public static final String KEY_FITNESSCONCERN = "FITNESS_CONCERN";
    public static final String KEY_HIPDISTRACTION = "HIP_DISTRACTION";
    //3RD TABLE VARIABLES
    public static final String KEY_MOBILITY = "MOBILITY";
    public static final String KEY_SELFCARE = "SELF_CARE";
    public static final String KEY_USUALACTIVITIES = "USUAL_ACTIVITIES";
    public static final String KEY_PAINDISCOMFORT = "PAIN_DISCOMFORT";
    public static final String KEY_ANXIETYDEPRESSION = "ANXIETY_DEPRESSION";
    public static final String KEY_HEALTHSCALE = "HEALTH_SCALE";
    public static final String KEY_HEALTHNUMBER = "HEALTH_NUMBER";
    public static int datatable=0;
    //4th TABLE VARIABLES
    public static final String KEY_NAME = "NAME";
    public static final String KEY_NHS = "NHS";
    public static final String KEY_WALKLIMP = "WALK_LIMP";
    public static final String KEY_WALKSUPPORT = "WALK_SUPPORT";
    public static final String KEY_WALKDISTANCE = "WALK_DISTANCE";
    public static final String KEY_CLIMBSTAIRS = "CLIMB_STAIRS";
    public static final String KEY_SOCKSON = "SOCKS_ON";
    public static final String KEY_CHAIRMINUTES = "CHAIR_MINUTES";
    public static final String KEY_PUBLICTRANSPORTATION = "PUBLIC_TRANSPORTATION";
    SQLiteDatabase db; 
    String CREATE_CONTACTS_TABLE;
    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        CREATE_CONTACTS_TABLE = new String();
        db=this.getWritableDatabase();
    }
 
    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
    	switch(datatable){
    	case 0: CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_NAME1 + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_SURNAME + " TEXT, " + KEY_FORENAME + " TEXT, " + KEY_DOB + " DATE, " + KEY_EMAIL + " TEXT, " + KEY_POSTALCODE + " INTEGER," + KEY_CONSENT + " BOOLEAN, " + KEY_SIGNATURE + " TEXT, " + KEY_DATE + " DATE, "
                + KEY_HOMEADDRESS + " TEXT" + ")";
        
        break;
    	case 1: CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_NAME2 + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_HIPPAIN + " INTEGER, " + KEY_FLOORDIFFICULTY + " INTEGER, " + KEY_DISTANCEDIFFICULTY + " INTEGER, " + KEY_GRINDINGTROUBLE + " INTEGER, " + KEY_WORKTROUBLE + " INTEGER," + KEY_CUTTINGCONCERN + " INTEGER, " + KEY_ACTIVITYPAIN + " INTEGER, " + KEY_PICKINGCONCERN + " INTEGER, " + KEY_SEXTROUBLE + " INTEGER, " + KEY_SEXTROUBLECHECK + " INTEGER, " + KEY_AWARETIME + " INTEGER, " + KEY_FITNESSCONCERN + " INTEGER, "
                + KEY_HIPDISTRACTION + " INTEGER" + ")";
        
        break;
    	case 2: CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_NAME3 + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_MOBILITY + " INTEGER, " + KEY_SELFCARE + " INTEGER, " + KEY_USUALACTIVITIES + " INTEGER, " + KEY_PAINDISCOMFORT + " INTEGER, " + KEY_ANXIETYDEPRESSION + " INTEGER," + KEY_HEALTHSCALE + " INTEGER, " + KEY_HEALTHNUMBER + " INTEGER, " 
                + ")";
    	        break;

    	case 3: CREATE_CONTACTS_TABLE = "CREATE TABLE " + TABLE_NAME4 + "("
                + KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_NAME + " TEXT, " + KEY_DOB + " DATE, " + KEY_NHS + " INTEGER, " + KEY_PAINDISCOMFORT + " INTEGER, " + KEY_HIPPAIN + " INTEGER," + KEY_WALKLIMP + " INTEGER, " + KEY_WALKSUPPORT + " INTEGER, " + KEY_WALKDISTANCE + " INTEGER, " + KEY_CLIMBSTAIRS + " INTEGER, " + KEY_SOCKSON + " INTEGER, " + KEY_CLIMBSTAIRS + " INTEGER, " + KEY_CHAIRMINUTES + " INTEGER, "  + KEY_PUBLICTRANSPORTATION + " INTEGER, "
                + ")";
    	        break;
    	}
    	
    	db.execSQL(CREATE_CONTACTS_TABLE);
    }
    @SuppressWarnings("deprecation")
	public int adddata(String[] s, int[] y,int[] p)
    {
    	 
    	ContentValues values = new ContentValues();
    	int x=0;
    	switch(datatable){
   	 case 0: for(int i=0;i<9;i++){
 		if(s[i]!=null)
			x=0;
 		else
 			{x=1;
 			return x;}
	}
	if(x==0){
	 values.put(DatabaseHandler.KEY_SURNAME, s[0]);
	 values.put(DatabaseHandler.KEY_FORENAME,s[1] );
	 values.put(DatabaseHandler.KEY_EMAIL,s[2] );
	 values.put(DatabaseHandler.KEY_HOMEADDRESS,s[3]);
	 values.put(DatabaseHandler.KEY_POSTALCODE,s[4]);
	 values.put(DatabaseHandler.KEY_SIGNATURE,s[5]);
	 values.put(DatabaseHandler.KEY_CONSENT,Boolean.valueOf(s[6]) );
	 values.put(DatabaseHandler.KEY_DOB,s[7] );
	 values.put(DatabaseHandler.KEY_DATE,s[8] );
	 db.insert(TABLE_NAME1, null,values);
	}break;
   	 case 1: for(int j=0; j<13; j++){
   		 if(y[j]==0)
   		 { x=1;
   		     return x;}
   		 else
   			 x=0;
   		    
   	 }
	 values.put(DatabaseHandler.KEY_HIPPAIN,y[0]);
	 values.put(DatabaseHandler.KEY_FLOORDIFFICULTY,y[1]);
	 values.put(DatabaseHandler.KEY_DISTANCEDIFFICULTY,y[2]);
	 values.put(DatabaseHandler.KEY_GRINDINGTROUBLE,y[3]);
	 values.put(DatabaseHandler.KEY_WORKTROUBLE,y[4]);
	 values.put(DatabaseHandler.KEY_CUTTINGCONCERN,y[5]);
	 values.put(DatabaseHandler.KEY_ACTIVITYPAIN,y[6]);
	 values.put(DatabaseHandler.KEY_PICKINGCONCERN,y[7]);
	 values.put(DatabaseHandler.KEY_SEXTROUBLE,y[8]);
	 values.put(DatabaseHandler.KEY_SEXTROUBLECHECK,y[9]);
	 values.put(DatabaseHandler.KEY_AWARETIME,y[10]); 
	 values.put(DatabaseHandler.KEY_FITNESSCONCERN,y[11]);
	 values.put(DatabaseHandler.KEY_HIPDISTRACTION,y[12]);
 	 db.insert(TABLE_NAME2, null,values);
 	break;
   	case 2: 		
   	 for(int l=0;l<7;l++){
   		 if(p[l]!=0)
   			 x=0;
   		 else{
   			 x=1;
   			 return x;
   		 }
   	 }
   	 
   	 values.put(DatabaseHandler.KEY_MOBILITY,p[0]);
   	 values.put(DatabaseHandler.KEY_SELFCARE,p[1]);
   	 values.put(DatabaseHandler.KEY_USUALACTIVITIES,p[2]);
   	 values.put(DatabaseHandler.KEY_PAINDISCOMFORT,p[3]);
   	 values.put(DatabaseHandler.KEY_ANXIETYDEPRESSION,p[4]);
   	 values.put(DatabaseHandler.KEY_HEALTHSCALE,p[5]);
   	 values.put(DatabaseHandler.KEY_HEALTHNUMBER,p[6]);
   	 db.insert(TABLE_NAME3, null,values);
     
   	 break;
   	case 3: for(int i=0;i<9;i++){
 		if(s[i]!=null)
			x=0;
 		else
 			{x=1;
 			return x;}
	}
	if(x==0){
	 values.put(DatabaseHandler.KEY_NAME, s[0]);
	 values.put(DatabaseHandler.KEY_DOB, new Date(0,0,0).parse(s[1]) );
	 values.put(DatabaseHandler.KEY_NHS,Integer.valueOf(s[2]) );
	 values.put(DatabaseHandler.KEY_HIPPAIN,Integer.valueOf(s[3]) );
	 values.put(DatabaseHandler.KEY_WALKLIMP,Integer.valueOf(s[4]));
	 values.put(DatabaseHandler.KEY_WALKSUPPORT,Integer.valueOf(s[5]));
	 values.put(DatabaseHandler.KEY_WALKDISTANCE,Integer.valueOf(s[6]));
	 values.put(DatabaseHandler.KEY_CLIMBSTAIRS,Integer.valueOf(s[7]) );
	 values.put(DatabaseHandler.KEY_SOCKSON,Integer.valueOf(s[8]) );
	 values.put(DatabaseHandler.KEY_CHAIRMINUTES,Integer.valueOf(s[9]));
	 values.put(DatabaseHandler.KEY_PUBLICTRANSPORTATION,Integer.valueOf(s[10]));
	 db.insert(TABLE_NAME4, null,values);
	 break;
	}
   }
   	 return x;
    } 
    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME1);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME2);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME3);
 
        // Create tables again
        onCreate(db);
    }
}