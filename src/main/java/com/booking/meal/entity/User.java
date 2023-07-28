package com.booking.meal.entity;

public class User {
    
    private String userid;
    private String password;
    private String name;
    private String dept;
    public String getUserid() {
        return userid;
    }
    public void setUserid(String userid) {
        this.userid = userid;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public User(String userid, String password, String name, String dept) {
        this.userid = userid;
        this.password = password;
        this.name = name;
        this.dept = dept;
    }



    
}
