package com.bcone.db;

import java.io.File;
import java.sql.Time;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteStatement;


public class SampleMasterDB {
	
	  
	  public static final String Playlist_ID = "Playlist_ID";
	  public static final String Playlist_Name="Playlist_Name";
	  public static final String Layout_ID = "Layout_ID";
	  public static final String Play_Index = "Play_Index";
	  public static final String Duration = "Duration";
	  public static final String PerHour_Limit = "Per_Hour_Limit";
	  public static final String PerDay_Limit = "Per_Day_Limit";
	  public static final String Imperssion_Limit = "Impression_Limit";
	  public static final String Create_Dt = "Create_Date";
	  public static final String Edit_Dt = "Edit_Date";
	  public static final String Status = "Status";
	  

	 
	  private DatabaseHelper mDbHelper;
	  private SQLiteDatabase mDb;
	 
	  private static final String DATABASE_NAME = "tablet.db";
	  private static final String DATABASE_TABLE = "PLAYLIST_MASTER_DB";
	  private static final int DATABASE_VERSION = 1;
	 
	  private final Context mCtx;
	  /**
	   * Database creation sql statement
	   */
	  static final String DATABASE_CREATE =
	    "create table " + DATABASE_TABLE + " (" + Playlist_ID + " text not null, "
	    + Playlist_Name +" text not null, " + Layout_ID + " text not null, "
	    + Play_Index + " text not null, "      
	    + Duration +" text not null, "      + PerHour_Limit + " text not null, "
	    + PerDay_Limit + " text not null, "   + Imperssion_Limit +" text not null, "   
	    + Create_Dt +" text not null, "       + Edit_Dt +" text not null, "
	    +Status+" text not null );";
	  
	  public SampleMasterDB(Context ctx) {
		    this.mCtx = ctx;
		  }
	  public SampleMasterDB open() throws SQLException {
		   // Log.i(TAG, "OPening DataBase Connection....");
		    mDbHelper = new DatabaseHelper(mCtx,DATABASE_NAME,DATABASE_VERSION,DATABASE_CREATE,DATABASE_TABLE);
		    mDb = mDbHelper.getWritableDatabase();
		   // mDbHelper.onCreate(mDb,DATABASE_CREATE);
		    return this;
		  }
		 
		  public void close() {
		    mDbHelper.close();
		  }
		  
		  public long createMainRecordStoreTable(String playlistid, String playlistname ,String layoutid,
				  String playindex,String duration,
				  String perhourlimit,String perdaylimit,String impressionlimit,
				  String createdt,String editdt,String status) {
			    //Log.i(TAG, "Inserting record...");
			    ContentValues initialValues = new ContentValues();
			    initialValues.put(Playlist_ID, playlistid);
			    initialValues.put(Playlist_Name,playlistname);
			    initialValues.put(Layout_ID,layoutid);
			    initialValues.put(Play_Index,playindex);
			    initialValues.put(Duration,duration);
			    initialValues.put(PerHour_Limit,perhourlimit);
			    initialValues.put(PerDay_Limit,perdaylimit);
			    initialValues.put(Imperssion_Limit,impressionlimit);
			    initialValues.put(Create_Dt,createdt);
			    initialValues.put(Edit_Dt,editdt);
			    initialValues.put(Status,status);
			    System.out.println("##################Created successfully");
			    return mDb.insert(DATABASE_TABLE, null, initialValues);
			  }
		  
		  public boolean delete_entry_MainRecordStoreTable(String playlistid) {
			  
			    return mDb.delete(DATABASE_TABLE, Playlist_ID + "=" + playlistid, null) > 0;
			  }
		  
		  public boolean delete_all_MainRecordStoreTable() {
			  
			    return mDb.delete(DATABASE_TABLE,null, null) > 0;
			  }
		  
		  public Cursor fetchAll_MainRecordStoreTable() {
			  
			    return mDb.query(DATABASE_TABLE, new String[] {Playlist_ID,Playlist_Name, Layout_ID,
			    		Play_Index,Duration,
			    		PerHour_Limit,PerDay_Limit,Imperssion_Limit,
			    		Create_Dt,Edit_Dt,Status}, null, null, null, null, null);
			  }
		  
		  public Cursor fetchMainRecordStore(String playlistid) throws SQLException {
			  
			    Cursor mCursor =
			 
			      mDb.query(true, DATABASE_TABLE, new String[] {
			    		    Playlist_ID,
			    		    Playlist_Name, 
			    		    Layout_ID,
				    		Play_Index,
				    		Duration,
				    		PerHour_Limit,
				    		PerDay_Limit,
				    		Imperssion_Limit,
				    		Create_Dt,
				    		Edit_Dt,
				    		Status}, Playlist_ID + "=" +playlistid, null,
			          null, null, null, null);
			    if (mCursor != null) {
			      mCursor.moveToFirst();
			    }
			    
			    
			    return mCursor;			 
			  }
		  public long insertMainRecordStore(
				  String playlistid,
				  String playlistname,
				  String layoutid,
				  String playindex,
				  String duration,
				  String perhourlimit,
				  String perdaylimit,
				  String impressionlimit,
				  String createdt,
				  String editdt,
				  String status)
		  {
			  if(checkDataBase(mCtx))
			  {
				  ContentValues initialValues = new ContentValues();
				    initialValues.put(Playlist_ID, playlistid);
				    initialValues.put(Playlist_Name,playlistname);
				    initialValues.put(Layout_ID,layoutid);
				    initialValues.put(Play_Index,playindex);
				    initialValues.put(Duration,duration);
				    initialValues.put(PerHour_Limit,perhourlimit);
				    initialValues.put(PerDay_Limit,perdaylimit);
				    initialValues.put(Imperssion_Limit,impressionlimit);
				    initialValues.put(Create_Dt,createdt);
				    initialValues.put(Edit_Dt,editdt);
				    initialValues.put(Status,status);
				    System.out.println("**************Inserted successfully");
				    return mDb.insert(DATABASE_TABLE,null, initialValues);  
			  }else
			  {
				  return createMainRecordStoreTable(playlistid, playlistname ,layoutid,
						  playindex,duration, perhourlimit, perdaylimit,
						  impressionlimit, createdt, editdt, status);
			  }
			    
		  }
		  public long fetchtableCount() {
			    String sql = "SELECT COUNT(*) FROM " + DATABASE_TABLE;
			    SQLiteStatement statement = mDb.compileStatement(sql);
			    long count = statement.simpleQueryForLong();
			    return count;
			}
		  
//		  public boolean updateMainRecordStore(int Id, String Name, String value) {
//			    ContentValues args = new ContentValues();
//			    args.put(KEY_NAME, Name);
//			    args.put(KEY_VALUE, value);
//			 
//			    return mDb.update(DATABASE_TABLE, args, KEY_ROWID + "=" + Id, null) > 0;
//			  }
		  
		  public boolean checkDataBase(Context context)
		  
		  {   
				String DB_PATH = "/data/data/"+context.getPackageName()+"/databases/";
				System.out.println(DB_PATH);
			    File dbFile = new File(DB_PATH + DATABASE_NAME);
			    return dbFile.exists();	    
		  }
}
