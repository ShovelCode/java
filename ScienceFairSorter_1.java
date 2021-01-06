import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class ScienceFairSorter {
    public static void main(String[]args){
        ArrayList<OutputGroup> g = new ArrayList<OutputGroup>();
        ArrayList<String> al_subjects = new ArrayList<String>();
        ArrayList<String> al_judges = new ArrayList<String>();
        HashMap<String, OutputGroup> assignments = new HashMap<String, OutputGroup>();
        BufferedReader in = null;
        //Change these three Strings for your system.
        String judges_file = "C:\\Users\\ray_c\\text_remote\\judges.txt";
        String subjects_file = "C:\\Users\\ray_c\\text_remote\\subjects.txt";
        String assigned_projects_file = "C:\\Users\\ray_c\\text_remote\\assigned_projects.txt";
        //Create a scanner and fill up the arraylist of judges
        try{
            Scanner s = new Scanner(new File(judges_file));
            while(s.hasNext()){
                al_judges.add(s.nextLine());
            }
            s.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(new JFrame(),"File not found for Scanner, emergency shutdown!");
            System.exit(0);
        }
        //Create a scanner and fill up the arraylist of subjects
        try{
            Scanner s = new Scanner(new File(subjects_file));
            while(s.hasNext()){
                al_subjects.add(s.nextLine());
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(new JFrame(), "File not found for subjects, emergency shutdown!");
        }
        //Write to a file.
        try{
            FileWriter writer = new FileWriter(assigned_projects_file);
            for(int i = 0; i < al_subjects.size(); i++) {
            writer.write(al_subjects.get(i) + "\n");
            }
            writer.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(new JFrame(), "File not found for FileWriter, emergency shutdown!");
            System.exit(0);
        }
        //Declares end of program and exits
        JOptionPane.showMessageDialog(new JFrame(), "Program Finished");
        System.exit(1);
    }//end main method
}//end class ScienceFairSorter
