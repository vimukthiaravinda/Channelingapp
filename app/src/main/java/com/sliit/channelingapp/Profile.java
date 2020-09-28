package com.sliit.channelingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import com.sliit.channelingapp.MasterDB.DBHandler;

public class Profile extends AppCompatActivity {
    EditText firstName,secondName,emailEdit;
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
        firstName = findViewById(R.id.firstName);
        secondName = findViewById(R.id.secondName);
        db = new DBHandler(this);
        Toast.makeText(this, "email is :"+email, Toast.LENGTH_SHORT).show();
       /* Cursor cursor = db.get_data_from_User(gender,email);
        StringBuilder stringBuilder = new StringBuilder();
        while (cursor.moveToNext()){
            firstName.setText(stringBuilder.append(cursor.getString(1)));
            secondName.setText(stringBuilder.append(cursor.getString(2)));
        }*/
    }
}