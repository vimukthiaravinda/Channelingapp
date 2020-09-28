package com.sliit.channelingapp.MasterDB;

import android.provider.BaseColumns;

public class ProfileDb {
    public ProfileDb() {
    }
    public static class ProfileUser implements BaseColumns{
        //User details selection
        public static final String TABLE ="Users";
        public static final String email ="email";
        public static final String gender = "gender";
    }
}
