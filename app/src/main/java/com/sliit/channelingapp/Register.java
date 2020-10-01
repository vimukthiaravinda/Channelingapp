package com.sliit.channelingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sliit.channelingapp.MasterDB.DBHandler;
import com.sliit.channelingapp.MasterDB.UserData;

public class Register extends AppCompatActivity {
    private Context context;
    private Button onBackRegister, RegisterButton;
    private Intent intent;
    private EditText First_name,Second_name,Email,Password,Birthday,phone_number;
    private EditText Address;
    private  DBHandler db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        onBackRegister = findViewById(R.id.backInReg);
        RegisterButton = findViewById(R.id.registerInReg);
        First_name = findViewById(R.id.firstName);
        Second_name = findViewById(R.id.secondName);
        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.password);
        Birthday = findViewById(R.id.Birthday);
        Address = findViewById(R.id.address);
        phone_number = findViewById(R.id.phonenumber);
        context = this;
        db = new DBHandler(context);
    }

    public void onClickBackInReg(View view) {
        intent = new Intent(this, Login.class);
        startActivity(intent);

    }

    public void onClickInRegister(View view) {
        String Fname = First_name.getText().toString();
        String Sname = Second_name.getText().toString();
        String email = Email.getText().toString();
        String password = Password.getText().toString();
        String address = Address.getText().toString();
        String birthday = Birthday.getText().toString();
        String phonenumber = phone_number.getText().toString();
        UserData userData  = new UserData();
        userData.setFirst_name(Fname);
        userData.setSecond_name(Sname);
        userData.setEmail(email);
        userData.setPassword(password);
        userData.setAddress(address);
        userData.setBirthday(birthday);
        userData.setPhone_number(phonenumber);
        boolean result = db.addInfoUser(userData);
       if (result == false){
           Toast.makeText(this, "Data is not insert", Toast.LENGTH_SHORT).show();
       }else {
           Toast.makeText(this, "Data is inserted", Toast.LENGTH_SHORT).show();
           Intent nextPage = new Intent(Register.this,Profile.class);
           nextPage.putExtra("email",userData.getEmail());
           nextPage.putExtra("password",userData.getPassword());
           startActivity(nextPage);
       }
    }
}
