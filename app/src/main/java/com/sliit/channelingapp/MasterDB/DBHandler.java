package com.sliit.channelingapp.MasterDB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;
import android.widget.Toast;

import com.sliit.channelingapp.Register;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class DBHandler extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ChannelingDatabase.db";
    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //DATA BASE IS CREATE FOR USER -- "VIMUKTHI ARAVINDA"
        String SQL_CREATE_DATABASE_ENTRIES = "CREATE TABLE "+RegisterDb.UserDetails.TableName+"(" +
                RegisterDb.UserDetails._ID+"INTEGER PRIMARY KEY AUTOINCREMENT," +
                RegisterDb.UserDetails.FirstName+ "TEXT," +
                RegisterDb.UserDetails.SecondName+ "TEXT," +
                RegisterDb.UserDetails.email+ "TEXT," +
                RegisterDb.UserDetails.phoneNumber+ "TEXT," +
                RegisterDb.UserDetails.birthday+"NUMERIC," +
                RegisterDb.UserDetails.Password+"TEXT," +
                RegisterDb.UserDetails.address+"TEXT," +
                RegisterDb.UserDetails.gender+"TEXT)";
        //DATABASE EXECUTE
        db.execSQL(SQL_CREATE_DATABASE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }
    // INSERT DATA TO DATA BASE --- "VIMUKTHI ARAVINDA"
    public boolean addData(String firstName, String secondName,String email,String password,String BirthDate,String address,String Phone_number,String Gender){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues value = new ContentValues();
        value.put(RegisterDb.UserDetails.FirstName,firstName);
        value.put(RegisterDb.UserDetails.SecondName,secondName);
        value.put(RegisterDb.UserDetails.email,email);
        value.put(RegisterDb.UserDetails.phoneNumber,Phone_number);
        value.put(RegisterDb.UserDetails.birthday,BirthDate);
        value.put(RegisterDb.UserDetails.Password,password);
        value.put(RegisterDb.UserDetails.address,address);
        value.put(RegisterDb.UserDetails.gender,Gender);
        long state = db.insert(RegisterDb.UserDetails.TableName,null,value);
        db.close();
        if (state == -1){
            return false;
        }
        return true;
       }
     public List<AllData> get_data_from_User(int id, String email){
        List<AllData> all = new ArrayList<AllData>();
        SQLiteDatabase getDataDb = this.getReadableDatabase();
        ContentValues contentValues = new ContentValues();
        String selectQuery = "select * from "+ RegisterDb.UserDetails.TableName +" where "+ RegisterDb.UserDetails._ID +"="+id+" and "+ RegisterDb.UserDetails.email +" = "+email;
        Cursor cursor = getDataDb.rawQuery(selectQuery,null);
        if (cursor.moveToNext()){
            do {
                AllData allData = new AllData();
                allData.setFirstName(cursor.getString(1));
                allData.setSecondName(cursor.getString(2));
                allData.setEmail(cursor.getString(3));
                allData.setPhoneNumber(cursor.getString(4));
                allData.setBirthday(cursor.getString(5));
            }while (cursor.moveToNext());
        }
        return all;
     }
    }

