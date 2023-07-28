package com.booking.meal.dao;

import java.util.List;

import com.booking.meal.entity.Meal;
import com.booking.meal.entity.User;

public interface UserDao {
    
    public User getUserDetailForLogin(int userId);

    public boolean updateNext7DaysMealOrSnacks(List<Meal> meals);
    public List<Meal> getNext7DaysMealOrSnacksForUser(int userId);

    public List<List<Object>> getUsersDashboadData(int userId);

    public List<Meal> getAllMealsByUser(int userId);


    
}
