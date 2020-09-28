package com.sliit.channelingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import com.sliit.channelingapp.MasterDB.DBHandler;

public class Profile extends AppCompatActivity {
    Intent intent;
    DBHandler db;
    private String email,gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        intent = getIntent();
        email = intent.getStringExtra("email");
        gender = intent.getStringExtra("gender");
        db = new DBHandler(this);
        Toast.makeText(this, "email is :"+email, Toast.LENGTH_SHORT).show();
    }
}