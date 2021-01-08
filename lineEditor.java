//Chris R.

import java.lang.*;
import java.util.*;
import java.io.*;
import java.io.FileWriter;

public class FileEdit
{
    public static void main(String[]args)throws IOException{
        Scanner f = new Scanner(System.in);
        System.out.println("This is a line editor which file to edit?");
        String fileName = "X";
        String beginningCommand = "X";
        beginningCommand = f.next();
        if(beginningCommand.equalsIgnoreCase("edit")){
            fileName = f.next();
        }
        else{
            System.out.println("Emergency Shutdown");
            System.exit(0);
        }
        BufferedReader in = new BufferedReader(new FileReader(new File(fileName)));
        ArrayList<String> bodyOfText = new ArrayList<String>();
        Scanner s = new Scanner(new File("apoem.txt"));
        Scanner c = new Scanner(System.in);
        int commandOption1 = -1;
        int commandOption2 = -1;
        int currentLine = -1;
        String command = "X";
        String lineOfText = null;

        while (s.hasNext()){
            bodyOfText.add(s.nextLine());
        }
        s.close();
        currentLine = bodyOfText.size() - 1;

        while(!command.equalsIgnoreCase("e")){
            command = "X";
            lineOfText = null;
            commandOption1 = -1;
            commandOption2 = -1;
            
            System.out.println("Enter command: ");
            command = c.next();
            if(command.equalsIgnoreCase("e"))
                break;
            else
            if(command.equalsIgnoreCase("l")){
                printOutFile(bodyOfText);
                continue;
            }

            if(c.hasNextInt()){
                commandOption1 = c.nextInt();
                currentLine = commandOption1;
            }
            else{
                commandOption1 = -1;
            }
            
            if(c.hasNextInt()){
                    commandOption2 = c.nextInt();
            }
            else{
                commandOption2 = -1;
            }
            
            if(c.hasNext()){
                lineOfText = c.nextLine();
            }
            else{
                lineOfText = "XXX";
            }
            //lineOfText = lineOfText.substring(1);
            
            if(command.equalsIgnoreCase("i") && commandOption1 > 0){
                insert(bodyOfText, commandOption1, lineOfText.substring(1));
            }
            else
            if(command.equalsIgnoreCase("i") && commandOption1 < 0){
                insert(bodyOfText, currentLine, lineOfText.substring(1));
            }
            else
            if(command.equalsIgnoreCase("d") && commandOption1 > 0 && commandOption2 > 0){
                delete(bodyOfText, commandOption1, commandOption2);
            }
            else
            if(command.equalsIgnoreCase("d") && commandOption1 > 0){
                deleteOne(bodyOfText, commandOption1);
            }
            else
            if(command.equalsIgnoreCase("d")){
                deleteOne(bodyOfText, currentLine);
            }
            else
            if(command.equalsIgnoreCase("a")){
                append(bodyOfText, lineOfText.substring(1));
            }
            else{
                continue;
            }
        }
        
        
        FileWriter writer = new FileWriter("apoem.txt"); 
        for(int q = 0; q < bodyOfText.size(); q++) {
          writer.write(bodyOfText.get(q) + "\n");
        }
        writer.close();


        System.out.println("Program Finished");
        System.exit(1);
    }
    
    public static void printOutFile(ArrayList<String> x){
        int index = 0;
        System.out.println("\n");
        for(String i : x){
            System.out.println(x.indexOf(i) + " " + x.get(index));
            index++;
        }
        System.out.println("\n");
    }
    
    public static void insert(ArrayList<String> x, int y, String z){
        x.add(y, z);

    }
    
    public static void delete(ArrayList<String> x, int y){
        x.remove(y);
    }
    
    public static void append(ArrayList<String> x, String y){
        x.add(y);
    }
    
    public static void delete(ArrayList<String> x, int y, int z){
         x.subList(y,z).clear();
    }
    
    public static void deleteOne(ArrayList<String> x, int y){
        x.remove(y);
    }
   
}
