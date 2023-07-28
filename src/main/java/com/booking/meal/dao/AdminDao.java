package com.booking.meal.dao;

import java.sql.Date;
import java.util.List;

import com.booking.meal.entity.Expense;
import com.booking.meal.entity.Meal;
import com.booking.meal.entity.User;

public interface AdminDao {

    public User getAdminForLogin(String userId);

    public List<User> getUsersList();
    public boolean addUser(User user);
    public boolean updateUser(String userId , User updatedUser);
    public boolean deleteUser(String userId);

    public List<Object> getAllExpense();
    public boolean addExpense(String date, String time, int totalExpense , String expenseDetails, String expenseBreakup);
    public boolean updateExpense(String date, String time, int totalExpense , String expenseDetails, String expenseBreakup);
    public boolean deleteExpense(String date, String time);

    public List<List<Object>> getDashboardData();

    public List<Object> getAllMeals();

    public List<List<Object>> employeeDataForExcelDownload();
    
    public List<List<Object>> getMonthlyExpenseForExcel();

    public List<Object> getAllPostBooking();
    public boolean addOrUpdatePostMealBooking(String id , Date date , String time , String menu , int mealOn , int additional, int postbook );


    public List<Integer> getAllUserIds();
}
