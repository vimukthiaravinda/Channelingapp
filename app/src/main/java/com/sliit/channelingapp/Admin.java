package com.sliit.channelingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.sliit.channelingapp.MasterDB.DBHandler;
import com.sliit.channelingapp.MasterDB.UserData;

public class Admin extends AppCompatActivity {
    private Button addDoctor;
    private Context context;
    private Intent intent;
    private EditText doctor_id ,doctor_name ,spec ,hospital ,first_day ,sec_day ,third_day ,four_day;
    //private EditText Address;
    private DBHandler db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
       /* onBackRegister = findViewById(R.id.backInReg);
        RegisterButton = findViewById(R.id.registerInReg);
        First_name = findViewById(R.id.firstName);
        Second_name = findViewById(R.id.secondName);
        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.password);
        Birthday = findViewById(R.id.Birthday);
        Address = findViewById(R.id.address);
        phone_number = findViewById(R.id.phonenumber);*/
       addDoctor = findViewById(R.id.button21);
        context = this;
        db = new DBHandler(context);
    }
}

