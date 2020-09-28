package com.sliit.channelingapp.MasterDB;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBHandler extends SQLiteOpenHelper {
    public static final String Database_Name = "channeling.db";
    private static final String crateTable = "Create table "+ RegisterDb.UserDetails.TableName +" (" +
            RegisterDb.UserDetails._ID+"INTEGER PRIMARY KEY AUTOINCREMENT," +
            RegisterDb.UserDetails.FirstName+ "TEXT," +
            RegisterDb.UserDetails.SecondName+ "TEXT," +
            RegisterDb.UserDetails.email+ "TEXT," +
            RegisterDb.UserDetails.phoneNumber+ "TEXT," +
            RegisterDb.UserDetails.birthday+"TEXT," +
            RegisterDb.UserDetails.address+"TEXT" +
            RegisterDb.UserDetails.Password+"TEXT);";
    public DBHandler(Context context) {
        super(context, Database_Name, null, 2);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(crateTable);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        /*String drop_table = "DROP TABLE IF EXISTS "+ RegisterDb.UserDetails.TableName;
        db.execSQL(drop_table);
        onCreate(db);*/
    }
    public boolean addInfoUser(UserData userData){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(RegisterDb.UserDetails.FirstName,userData.getFirst_name());
        values.put(RegisterDb.UserDetails.SecondName,userData.getSecond_name());
        values.put(RegisterDb.UserDetails.email,userData.getEmail());
        values.put(RegisterDb.UserDetails.phoneNumber,userData.getPhone_number());
        values.put(RegisterDb.UserDetails.birthday,userData.getBirthday());
        values.put(RegisterDb.UserDetails.Password,userData.getPassword());
        values.put(RegisterDb.UserDetails.address,userData.getAddress());
        long res = db.insert(RegisterDb.UserDetails.TableName,null,values);
        db.close();
        if (res == -1) {
            return false;
        } else {
            return true;
        }
    }
}