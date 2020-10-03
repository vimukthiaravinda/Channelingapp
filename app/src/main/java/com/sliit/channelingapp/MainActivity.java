package com.sliit.channelingapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sliit.channelingapp.MasterDB.doctordata;

public class MainActivity extends AppCompatActivity {
    private Button LoginMainButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginMainButton = findViewById(R.id.LoginMainButton);

    }

    //bu


    public void OnClickLogin(View view){
        Intent LoginIntent = new Intent(this,Login.class);
        startActivity(LoginIntent);
    }
}