/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignnments.chapter8assignment;

/**
 *
 * @author HP
 */
public class Date {
    private int month; // 1-12
    private int day; // 1-31 based on month
    private int year; // any year

    private static final int[] daysPerMonth =
        { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // constructor: confirm proper value for month and day given the year
    public Date(int month, int day, int year) {
        // check if month in range
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException(
                "month (" + month + ") must be 1-12");

        // check if day in range for month
        if (day <= 0 ||
            (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day +
                ") out-of-range for the specified month and year");

        // check for leap year if month is 2 and day is 29
        if (month == 2 && day == 29 && !(year % 400 == 0 ||
            (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day +
                ") out-of-range for the specified month and year");

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf(
            "Date object constructor for date %s%n", this);
    }
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
    
    public void nextDay(){
        if(day==daysPerMonth[month]){
            if(month<12){
                month++;
                day=1;
            }
            else{
                year++;
                month=1;
                day=1;
            }
        }
        else{
            day++;
        }
        System.out.println(toString());
    }

    // return a String of the form month/day/year
    
}
//Fig. 8.7 
//to perform error checking on the initializer values for instance 
//variables month, day and year (currently it validates only the month and day).
//Provide a method nextDay to increment the day by one. Write a program that tests
//method nextDay in a loop that prints the date during each iteration to illustra
//that the method works correctly. Test the following cases: 
//a) incrementing into the next month and 
//b) incrementing into the next year. 


    

