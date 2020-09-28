package com.sliit.channelingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {
    private Button RegisterButton,OnbackButton;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        RegisterButton = findViewById(R.id.regButton);
        OnbackButton = findViewById(R.id.backInLogin);
    }
    public void OnClickRegister(View view){
        intent = new Intent(this,Register.class);
        startActivity(intent);
    }
    public void OnClickBack(View view){
        intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}