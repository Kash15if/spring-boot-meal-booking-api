package com.booking.meal.entity;

public class Meal {
    
    private int UserId;
    private String Date;
    private String  Time;
    private String Menu;
    private int Meal_On;
    private int Extra_Meal;
    private int postbook;
    private int roti;

    

    public Meal(int userId, String date, String time, String menu, int meal_On, int extra_Meal, int postbook,
            int roti) {
        UserId = userId;
        Date = date;
        Time = time;
        Menu = menu;
        Meal_On = meal_On;
        Extra_Meal = extra_Meal;
        this.postbook = postbook;
        this.roti = roti;
    }

    
    public int getUserId() {
        return UserId;
    }
    public void setUserId(int userId) {
        UserId = userId;
    }
    public String getDate() {
        return Date;
    }
    public void setDate(String date) {
        Date = date;
    }
    public String getTime() {
        return Time;
    }
    public void setTime(String time) {
        Time = time;
    }
    public String getMenu() {
        return Menu;
    }
    public void setMenu(String menu) {
        Menu = menu;
    }
    public int getMeal_On() {
        return Meal_On;
    }
    public void setMeal_On(int meal_On) {
        Meal_On = meal_On;
    }
    public int getExtra_Meal() {
        return Extra_Meal;
    }
    public void setExtra_Meal(int extra_Meal) {
        Extra_Meal = extra_Meal;
    }
    public int getPostbook() {
        return postbook;
    }
    public void setPostbook(int postbook) {
        this.postbook = postbook;
    }
    public int getRoti() {
        return roti;
    }
    public void setRoti(int roti) {
        this.roti = roti;
    }

    
}
