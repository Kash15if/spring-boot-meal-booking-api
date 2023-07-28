package com.booking.meal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.booking.meal.dao.UserDao;
import com.booking.meal.entity.Meal;
import com.booking.meal.entity.User;


@Service
public class UserService implements UserDao {
    

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public User getUserDetailForLogin(int userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserDetailForLogin'");
    }

    @Override
    public boolean updateNext7DaysMealOrSnacks(List<Meal> meals) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateNext7DaysMealOrSnacks'");
    }

    @Override
    public List<Meal> getNext7DaysMealOrSnacksForUser(int userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getNext7DaysMealOrSnacksForUser'");
    }

    @Override
    public List<List<Object>> getUsersDashboadData(int userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUsersDashboadData'");
    }

    @Override
    public List<Meal> getAllMealsByUser(int userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllMealsByUser'");
    }



}
