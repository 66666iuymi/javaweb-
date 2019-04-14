package com.lym.entity;

public class Student {
    private int sno;
    private String sname;
    private int sage;
    private String stelephone;


    public Student() {
    }

    public Student(int sno, String sname, int sage, String stelephone) {
        this.sno = sno;
        this.sname = sname;
        this.sage = sage;
        this.stelephone = stelephone;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getStelephone() {
        return stelephone;
    }

    public void setStelephone(String stelephone) {
        this.stelephone = stelephone;
    }
}
