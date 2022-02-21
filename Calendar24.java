//Christopher Ray
//COSC 3420.xxx
//Project 1
//Due February 10
//This program simulates a calendar that can point
//to any date and determine the date before and
//after that day.

//Editor used: NetBeans 8.1
package calendardate2;

import java.lang.*;
import java.util.*;


class CalendarDate2 {

    //field variables
    public String month;
    public int day;
    public int year;
 
    //default constructor
    public CalendarDate2(){
	
        this.month = "January";
        this.day = 1;
        this.year = 2012;
    }//end CalendarDate()

    public CalendarDate2(String month){
        this.month = month;
        this.day = 1;
        this.year = 2012;
    }

    public CalendarDate2(int day){
        this.day = day;
        this.month = "January";
        this.year = 2012;
    }

    public CalendarDate2(int day, int year){
        this.day = day;
        this.year = year;
        this.month = "January"
    }

    public CalendarDate2(String month, int day, int year){
        this.month = month;
        this.day = day;
        this.year = year;
    }

    /****       getters    *****/
    public String getMonth(){
        return month;
    }//end getMonth()

    public int getDay(){
        return day;
    }//end getDay()

    public int getYear(){
        return year;
    }//end getYear()
    
    //overloaded toString method inherited from Object
    public String toString(){
        String wholeDate = this.getMonth() + " " + this.getDay() + ", " + this.getYear();
        return wholeDate;
    }
    
     public static void main(String[]args){
        
        System.out.println("Testing!");

        CalendarDate2 testCal = new CalendarDate2("February");
        Scanner s = new Scanner(System.in);
        /*
        System.out.println(testCal.getMonth());
        System.out.println(testCal.getDay());
        System.out.println(testCal.getYear());*/
        
        String userMonth;
        int userDay;
        int userYear;
        
        System.out.println("Enter month");
        try{
            userMonth = s.next();
        }
        catch(Exception e){
         System.out.println("That's not even a string.");
         System.out.println("Enter month");
         userMonth = s.next();
        }
        
        System.out.println("Enter day");
        try{
            userDay = s.nextInt();
        }
        catch(Exception e){
            System.out.println("Not a number");
            userDay = s.nextInt();
        }
        
        System.out.println("Enter year");
        try{
            userYear = s.nextInt();
        }
        catch(Exception e){
            System.out.println("Not a number.");
            userYear = s.nextInt();
        }
        
        
        CalendarDate2 userCal = new CalendarDate2(userMonth, userDay, userYear);
        CalendarDate2 previousDay = new CalendarDate2();
        CalendarDate2 nextDay = new CalendarDate2();
        System.out.println(userCal.getYear());
        System.out.println(userCal.toString());
        
    }//end main method
}//end class CalendarDate2
