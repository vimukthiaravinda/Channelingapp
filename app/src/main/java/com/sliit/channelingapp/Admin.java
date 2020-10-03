package com.sliit.channelingapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

public class Admin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
    }
}
// K.V Ariyaratne
class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "channeling.db";
    public static final String col_1 = "Doctor_id";
    public static final String col_2 = "DoctorName";
    public static final String col_3 = "Admin_sepcial";
    public static final String col_4 = "Hospital";
    public static final String col_5 = "FirstDay";
    public static final String col_6 = "SecondDay";
    public static final String col_7 = "ThirdDay";
    public static final String col_8 = "fourthday";


    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + col_1);
        onCreate(db);
    }

    public boolean insertData(String Doctor_id, String DoctorName, String Admin_sepcial, String Hospital, String FirstDay, String SecondDay, String ThirdDay, String fourthday) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col_1, Doctor_id);
        contentValues.put(col_2, DoctorName);
        contentValues.put(col_3, Admin_sepcial);
        contentValues.put(col_4, Hospital);
        contentValues.put(col_5, FirstDay);
        contentValues.put(col_6, SecondDay);
        contentValues.put(col_7, ThirdDay);
        contentValues.put(col_8, fourthday);
        long result = db.insert(col_1, null, contentValues);
        return true;
    }


}
