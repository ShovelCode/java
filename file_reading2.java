import java.util.*;
import java.io.*;

public class reading 
{
  public static void main(String[] args) 
  {
     try 
     {
        List<Integer> column = new ArrayList<Integer>();   

        Scanner myfile = new Scanner(new FileReader("FirstPart.txt")); 

        while (myfile.hasNext()) 
        {     
            column.add(myfile.nextInt());      
        }
        myfile.close();
        System.out.println("column elements are:\n" + column); 
    } 
    catch (Exception e) 
    {   
        e.printStackTrace();  
    }
  } 
}
