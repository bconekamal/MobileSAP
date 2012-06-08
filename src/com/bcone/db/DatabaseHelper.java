package com.bcone.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class DatabaseHelper extends SQLiteOpenHelper {

	DatabaseHelper(Context context, String DATABASE_NAME, int DATABASE_VERSION,
			String create_stmt, String database_table) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		// List down different tables here
		// db.execSQL(LayoutDB.DATABASE_CREATE);
		// db.execSQL(MediaDB.DATABASE_CREATE);
		// db.execSQL(PlayerMasterDB.DATABASE_CREATE);
		// db.execSQL(PlaylistMasterDB.DATABASE_CREATE);
		// db.execSQL(PlaylogDB.DATABASE_CREATE);
		// db.execSQL(ScheduleDB.DATABASE_CREATE);
		// db.execSQL(TriggerMasterDB.DATABASE_CREATE);
		// db.execSQL(ZoneDB.DATABASE_CREATE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}
}