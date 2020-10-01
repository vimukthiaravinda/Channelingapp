package com.sliit.channelingapp.MasterDB;

public class UserData {
   private String first_name ,second_name ,email ,password ,address ,gender ,phone_number ,birthday;

    public UserData() {
    }

    public UserData(String first_name, String second_name, String email, String password, String address, String gender, String phone_number, String birthday) {
        this.first_name = first_name;
        this.second_name = second_name;
        this.email = email;
        this.password = password;
        this.address = address;
        this.gender = gender;
        this.phone_number = phone_number;
        this.birthday = birthday;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
