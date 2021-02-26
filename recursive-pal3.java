//Christopher Ray
//Data Structures
//Project 2a - Palindrome

package palindrome;

import java.util.*;
import java.lang.*;

public class Palindrome {
   
    public static void main(String[] args) {
        String input = "";
        String inputCap = "";
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        
        input = kb.nextLine(); //???
        inputCap = input.toUpperCase();
        inputCap = inputCap.replaceAll("[^a-zA-Z0-9]", "");
        
        
        //By this time the input string has no whitespace, or nonalphabetical
        //characters
        System.out.println("Palindrome status: " + isPal(inputCap));
    }//end main method
    
    //a recursive palindrome checking method
    static boolean isPal(String s){
        
        if(s.length() == 1)
            return true;
        
        if(s.length() == 2 && s.charAt(0) == s.charAt(1))
            return true;
        
        if(s.charAt(0) == s.charAt(s.length()-1))
            return isPal(s.substring(1, s.length()-1));
        
        return false;
        
    }//end method isPal
    
}//end class Palindrome
