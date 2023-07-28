package com.booking.meal.services;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.booking.meal.dao.AdminDao;
import com.booking.meal.entity.User;

@Service
public class AdminService implements AdminDao {
    
        private final JdbcTemplate jdbcTemplate;

    @Autowired
    public AdminService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public User getAdminForLogin(String userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAdminForLogin'");
    }

    @Override
    public List<User> getUsersList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUsersList'");
    }

    @Override
    public boolean addUser(User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addUser'");
    }

    @Override
    public boolean updateUser(String userId, User updatedUser) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public boolean deleteUser(String userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

    @Override
    public List<Object> getAllExpense() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllExpense'");
    }

    @Override
    public boolean addExpense(String date, String time, int totalExpense, String expenseDetails,
            String expenseBreakup) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addExpense'");
    }

    @Override
    public boolean updateExpense(String date, String time, int totalExpense, String expenseDetails,
            String expenseBreakup) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateExpense'");
    }

    @Override
    public boolean deleteExpense(String date, String time) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteExpense'");
    }

    @Override
    public List<List<Object>> getDashboardData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDashboardData'");
    }

    @Override
    public List<Object> getAllMeals() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllMeals'");
    }

    @Override
    public List<List<Object>> employeeDataForExcelDownload() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'employeeDataForExcelDownload'");
    }

    @Override
    public List<List<Object>> getMonthlyExpenseForExcel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMonthlyExpenseForExcel'");
    }

    @Override
    public List<Object> getAllPostBooking() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllPostBooking'");
    }

    @Override
    public boolean addOrUpdatePostMealBooking(String id, Date date, String time, String menu, int mealOn,
            int additional, int postbook) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addOrUpdatePostMealBooking'");
    }

    @Override
    public List<Integer> getAllUserIds() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllUserIds'");
    }

}
