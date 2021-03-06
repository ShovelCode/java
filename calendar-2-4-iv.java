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
        
        prevDay = userDay - 1;
        prevMonth = userMonth;
        prevYear = userYear;
        
        nextDay = userDay + 1;
        nextMonth = userMonth;
        nextYear = userYear;
        
        
        if( userMonth.equals("January") && userDay == 1)
            prevMonth = "December";
       // else
         //   prevMonth = "January";
        
        if(userMonth.equals("February") && userDay == 1)
            prevMonth = "January";
        //else
          //  prevMonth = "February";
        
        if(userMonth.equals("March") && userDay == 1)
            prevMonth = "February";
        //else
          //  prevMonth = "March";
        
        if(userMonth.equals("April") && userDay == 1)
            prevMonth = "March";
       // else
      //      prevMonth = "April";
               
        if(userMonth.equals("May") && userDay == 1)
            prevMonth = "April";
       // else
         //   prevMonth = "May";
        
        if(userMonth.equals("June") && userDay == 1)
            prevMonth = "May";
      //  else
        //    prevMonth = "June";
        
        if(userMonth.equals("July") && userDay == 1)
            prevMonth = "June";
       // else
      //      prevMonth = "July";
        
        if(userMonth.equals("August") && userDay == 1)
            prevMonth = "July";
       // else
       //     prevMonth = "August";
        
        if(userMonth.equals("September") && userDay == 1)
            prevMonth = "August";
      //  else
        //    prevMonth = "September";
        
        if(userMonth.equals("October") && userDay == 1)
            prevMonth = "September";
  //      else
    //        prevMonth = "October";
        
        if(userMonth.equals("November") && userDay == 1)
            prevMonth = "October";
  //      else
    //        prevMonth = "November";
        
            
        if(userMonth.equals("December") && userDay == 1)
            prevMonth = "November";
//        else
  //         prevMonth = "!!!!";

        if(userDay == 1 && (userMonth.equals("February") || userMonth.equals("April") || userMonth.equals("June") || userMonth.equals("August") || userMonth.equals("November") ))//change for leap year and alternating 31 and 32
            prevDay = 31;
        
        if(userMonth.equals("January") && userDay == 1){
            prevDay = 31;
            prevMonth = "December"; 
            prevYear = userYear - 1;
        }
        
        if(userDay == 31 && userMonth.equals("January")){ 
            nextDay = 1;
            nextMonth = "February";
        }
        
        if(userDay == 28 || userDay == 29 && userMonth.equals("February")){
            nextDay = 1;
            nextMonth = "March";
        }
        
        if(userDay == 31 && userMonth.equals("March")){
            nextDay = 1;
            nextMonth = "April";
        }
        
        if(userDay == 30 && userMonth.equals("April")){
            nextDay = 1;
            nextMonth = "May";
        }
        
        if(userDay == 31 && userMonth.equals("May")){
            nextDay = 1;
            nextMonth = "June";
        }
        
        if(userDay == 30 && userMonth.equals("June")){
            nextDay = 1;
            nextMonth = "July";
        }
        
        if(userDay == 31 && userMonth.equals("July")){
            nextDay = 1;
            nextMonth = "August";
        }
        
        if(userDay == 30 && userMonth.equals("August")){
            nextDay = 1;
            nextMonth = "October";
        }
        
        if(userDay == 31 && userMonth.equals("October")){
            nextDay = 1;
            nextMonth = "November";
        }
        
        if(userDay == 30 && userMonth.equals("November")){
            nextDay = 1;
            nextMonth = "December";
        }
        
        if(userDay == 31 && userMonth.equals("December")){
            nextDay = 1;
            nextMonth = "January";
            nextYear = userYear + 1;
        }
          

        CalendarDate2 userDate = new CalendarDate2(userMonth, userDay, userYear);
        CalendarDate2 previousDate = new CalendarDate2(prevMonth, prevDay, prevYear);
        CalendarDate2 nextDate = new CalendarDate2(nextMonth, nextDay, nextYear);
        
        System.out.println(userDate.toString());
        System.out.println("Day before: " + previousDate.toString());
        System.out.println("Day after: " + nextDate.toString());
        
    }//end main method
}//end class CalendarDate2
