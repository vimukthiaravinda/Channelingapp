package com.sliit.channelingapp.MasterDB;

import android.provider.BaseColumns;

public class RegisterDb {
    public RegisterDb() {}
    public static class UserDetails implements BaseColumns {
        //DATABASE DETAILS
        public static final String TableName = "user";
        public static final String FirstName = "firstname";
        public static final String SecondName = "secondname";
        public static final String email = "email";
        public static final String phoneNumber = "phonenumber";
        public static final String birthday = "birthday";
        public static final String Password = "password";
        public static final String address = "address";
        public static final String gender = "gender";
    }
}
