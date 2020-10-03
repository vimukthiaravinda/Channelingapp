package com.sliit.channelingapp.MasterDB;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;


public class DBHandler extends SQLiteOpenHelper {
    public static final String Database_Name = "channeling.db";
    public DBHandler(Context context) {
        super(context, Database_Name, null, 1);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table user(firstname text,secondname text,email text,phonenumber text,birthday text,password text,address text)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists user");
    }
    public boolean addInfoUser(UserData userData){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("firstname",userData.getFirst_name());
        values.put("secondname",userData.getSecond_name());
        values.put("email",userData.getEmail());
        values.put("phonenumber",userData.getPhone_number());
        values.put("birthday",userData.getBirthday());
        values.put("password",userData.getPassword());
        values.put("address",userData.getAddress());
        long res = db.insert("user",null,values);
        db.close();
            if (res == -1) {
                return false;
            }
            return true;
        }
    public List<UserData> get_Info(String email){
        List<UserData> userInputs = new ArrayList<UserData>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM user WHERE email = '"+email+"';",null);
        if (cursor.moveToFirst()){
            do {
                UserData usd = new UserData();
                    usd.setFirst_name(cursor.getString(0));
                    usd.setSecond_name(cursor.getString(1));
                    usd.setEmail(cursor.getString(2));
                    usd.setPhone_number(cursor.getString(3));
                    usd.setBirthday(cursor.getString(4));
                    usd.setPassword(cursor.getString(5));
                    usd.setAddress(cursor.getString(6));
                userInputs.add(usd);
            }while (cursor.moveToNext());
        }
        return  userInputs;
    }
    }
