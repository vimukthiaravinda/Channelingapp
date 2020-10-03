package com.sliit.channelingapp.MasterDB;

public class doctordata {

    private String doctor_id ,doctor_name ,spec ,hospital ,first_day ,sec_day ,third_day ,four_day;

    public doctordata(){


    }

    public doctordata(String doctor_id,String doctor_name, String spec,String hospital, String first_day, String sec_day ,String third_day,String four_day) {
     this.doctor_id=doctor_id;
     this.doctor_name=doctor_name;
     this.spec=spec;
     this.hospital=hospital;
     this.first_day=first_day;
     this.sec_day=sec_day;
     this.third_day=third_day;
     this.four_day=four_day;
    }

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getFirst_day() {
        return first_day;
    }

    public void setFirst_day(String first_day) {
        this.first_day = first_day;
    }

    public String getSec_day() {
        return sec_day;
    }

    public void setSec_day(String sec_day) {
        this.sec_day = sec_day;
    }

    public String getThird_day() {
        return third_day;
    }

    public void setThird_day(String third_day) {
        this.third_day = third_day;
    }

    public String getFour_day() {
        return four_day;
    }

    public void setFour_day(String four_day) {
        this.four_day = four_day;
    }
}
