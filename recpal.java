//Christopher Ray
//Data Structures
//Project 2a - Palindrome
//This program will determine if an entered string 
//is a palindrome or not by a recursive method
 
//Editor: NetBeans IDE 8.1
package palindrome;
 
import java.util.*;
import java.lang.*;
 
public class Palindrome {
   
    public static void main(String[] args) {
        String input = "";
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        
        input = kb.nextLine();
        //the all uppercase version to ignore case
        input = input.toUpperCase(); 
        
        //a regex that removes nonalphabetical characters
        input = input.replaceAll("[^a-zA-Z0-9]", "");
        
        
        //By this time the input string has no whitespace, or nonalphabetical
        //characters
        System.out.println("Palindrome status: " + isPal(input));
    }//end main method
    
    //a recursive palindrome checking method
    static boolean isPal(String s){
        
        //empty string case
        if(s.length() == 0)
            return true;
        
        //a base case
        if(s.length() == 1)
            return true;
        
        //another base case
        if(s.length() == 2 && s.charAt(0) == s.charAt(1))
            return true;
        
        //if the characters at the beginning and end of
        //the string are the same, then the method is called
        //again with those characters removed, so a shorter
        //and shorter string is produced with each call
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPal(s.substring(1, s.length()-1));
        
        return false;
        
    }//end method isPal
    
}//end class Palindrome
