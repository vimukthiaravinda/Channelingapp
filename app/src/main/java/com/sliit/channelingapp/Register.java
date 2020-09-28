package com.sliit.channelingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.sliit.channelingapp.MasterDB.DBHandler;

import java.sql.Date;


public class Register extends AppCompatActivity {
    private Button onBackRegister,RegisterButton;
    private Intent intent;
    private DBHandler handler;
    private EditText FirstName,SecondName,Email,Birthday,Password,Re_password,PhoneNumber,Address;
    private RadioGroup radioGroup;
    private RadioButton male,female;
    private boolean state;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        onBackRegister = findViewById(R.id.backInReg);
        RegisterButton = findViewById(R.id.registerInReg);
        FirstName = findViewById(R.id.firstName);
        SecondName = findViewById(R.id.secondName);
        Email = findViewById(R.id.Email);
        Birthday = findViewById(R.id.Birthday);
        Password = findViewById(R.id.password);
        Re_password = findViewById(R.id.repassword);
        PhoneNumber = findViewById(R.id.Phone_Number);
        Address = findViewById(R.id.home_address);
        male = findViewById(R.id.male);
        handler = new DBHandler(this);
        Toast.makeText(this, "DB CREATED", Toast.LENGTH_SHORT).show();
    }
    public void onClickBackInReg(View view){
        intent = new Intent(this,Login.class);
        startActivity(intent);

    }
    public void onClickInRegister(View view){
        String fname,sname,ema,pnumber,bdate,pword,addres,Repassword,gender;

        fname = FirstName.getText().toString();
        sname = SecondName.getText().toString();
        ema = Email.getText().toString();
        bdate = Birthday.getText().toString();
        pnumber = PhoneNumber.getText().toString();
        pword = Password.getText().toString();
        addres = Address.getText().toString();
        Repassword = Re_password.getText().toString();
        if (male.isChecked()){
            gender = "male";
        }else {
            gender = "female";
        }
        if (pword.equals(Repassword)) {
            if (handler.addData(fname, sname, ema, pword, bdate, addres, pnumber, gender)) {
                Toast.makeText(this, "Data added", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Register.this, Profile.class);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Data non added", Toast.LENGTH_SHORT).show();
            }
         }else {
            Toast.makeText(this, "Password is not match!!!", Toast.LENGTH_SHORT).show();
        }
        }
    }
