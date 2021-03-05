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
        
        //somewhere here the code for name of the day of the week
    }
    
     public static void main(String[]args){
        
        System.out.println("Testing!");
        Scanner s = new Scanner(System.in);
        /*
        System.out.println(testCal.getMonth());
        System.out.println(testCal.getDay());
        System.out.println(testCal.getYear());*/
        
        String userMonth;
        int userDay;
        int userYear;
        
        String prevMonth = "X Month";
        int prevDay = -1;
        int prevYear = -1;
        
        String nextMonth = "Y Month";
        int nextDay = -1;
        int nextYear = -1;
        
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
        
        if( userMonth.equals("January"))
            prevMonth = "December";
        
        if(userMonth.equals("February"))
            prevMonth = "January";
        
        if(userMonth.equals("March"))
            prevMonth = "February";
        
        if(userMonth.equals("April"))
            prevMonth = "March";
        
        if(userMonth.equals("May"))
            prevMonth = "April";
        
        if(userMonth.equals("June"))
            prevMonth = "May";
        
        if(userMonth.equals("July"))
            prevMonth = "June";
        
        if(userMonth.equals("August"))
            prevMonth = "July";
        
        if(userMonth.equals("September"))
            prevMonth = "August";
        
        if(userMonth.equals("October"))
            prevMonth = "September";
        
        if(userMonth.equals("November"))
            prevMonth = "October";
        
        if(userMonth.equals("December"))
            prevMonth = "November";
                
        if(userDay == 1)//change for leap year and alternating 31 and 32
            prevDay = 31;//again, remember to change
        else
            prevDay = --userDay;
        
        if(userMonth.equals("January") && userDay == 1)
            prevYear = --userYear;
        else
            prevYear = userYear;
        
        //these variables mutated to give values to others variables
        //so here they are reverted back.
        userYear++;
        userDay++;
        
        //so and so forth with a sequence of ifs
        
        CalendarDate2 userCal = new CalendarDate2(userMonth, userDay, userYear);
        CalendarDate2 previousDate = new CalendarDate2(prevMonth, prevDay, prevYear);
        CalendarDate2 nextDate = new CalendarDate2(nextMonth, nextDay, nextYear);
        
        System.out.println(userCal.toString());
        System.out.println(previousDate.toString());
        
    }//end main method
}//end class CalendarDate2
