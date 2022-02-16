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
		ArrayList<String> al_subjects = new ArrayList<String>();
		ArrayList<String> al_judges = new ArrayList<String>();
		ArrayList<Judge> the_judges = new ArrayList<Judge>();
		ArrayList<String> chemistryProjects = new ArrayList<String>();
		ArrayList<String> behavioralSlashSocialScienceProjects = new ArrayList<String>();
		ArrayList<String> lifeScienceProjects = new ArrayList<String>();
		ArrayList<String> mathematicsSlashPhysicsProjects = new ArrayList<String>();
		ArrayList<String> environmentalScienceProjects = new ArrayList<String>();
		ArrayList<String> earthSlashSpaceScienceProjects = new ArrayList<String>();
		int chemistryCount = 0;
		int behavioralSlashSocialScienceCount = 0;
		int lifeScienceCount = 0;
		int mathematicsSlashPhysicsCount = 0;
		int environmentalScienceCount = 0;
		int earthSlashSpaceScienceCount = 0;
		//Change these three Strings for your system.
		String subjects_file          = null;
		String judges_file            = null;
		String assigned_projects_file = "C:\\Users\\ray_c\\text_remote\\assigned_projects.txt";
		//Get the file of subjects
		try{
			subjects_file = JOptionPane.showInputDialog(new JFrame(), "Subject File (fully qualified C:\\...):");
			subjects_file = subjects_file.replace("\\", "\\\\");
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(new JFrame(), "Problem!");
			System.exit(0);
		}
		//Get the file of judges
		try{
			judges_file = JOptionPane.showInputDialog(new JFrame(), "Judges file (fully qualified like C:\\...:");
			judges_file = judges_file.replace("\\", "\\\\");
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(new JFrame(), "Problem with judge file!");
			System.exit(0);
		}
		//Create a scanner and fill up the arraylist of subjects
		try{
			Scanner s = new Scanner(new File(subjects_file));
			while(s.hasNext()){
				al_subjects.add(s.nextLine());
			}
			s.close();
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(new JFrame(),"File not found for subjects, emergency shutdown!");
			System.exit(0);
		}
		try{
			//Create a scanner and fill up the arraylist of judges
			Scanner s = new Scanner(new File(judges_file));
			while(s.hasNext()){
				al_judges.add(s.nextLine());
			}
			s.close();
			//Now go through that whole arraylist and make a Judge object out of every line
			for(int i = 0; i < al_judges.size(); i++){
				String name = (al_judges.get(i).split(":"))[0];
				boolean a = false;
				boolean b = false;
				boolean c = false;
				boolean d = false;
				boolean e = false;
				boolean f = false;
				String[] topics = (al_judges.get(i).split(":"))[1].split(",");
				for(int k = 0; k < topics.length; k++){
					if(topics[k].trim().equalsIgnoreCase("Chemistry"))
							a = true;
					else if(topics[k].trim().equalsIgnoreCase("Behavioral/Social Science"))
							b = true;
						else if(topics[k].trim().equalsIgnoreCase("Life Science"))
								c = true;
							else if(topics[k].trim().equalsIgnoreCase("Mathematics/Physics"))
									d = true;
								else if(topics[k].trim().equalsIgnoreCase("Environmental Science"))
										e = true;
									else if(topics[k].trim().equalsIgnoreCase("Earth/Space Sciene"))
											f = true;
				}//end for loop of k
				the_judges.add(new Judge(name,a,b,c,d,e,f));
			}//end of loop of i
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(new JFrame(), "File not found for judges, emergency shutdown!");
			System.exit(0);
		}
		//count subjects
		try{
			for(int i = 0; i < al_subjects.size(); i++){
				String s = al_subjects.get(i);
				String[]ss = s.split(" ");
				
				if(ss.length > 2 && ss[1].trim().equalsIgnoreCase("Behavioral/Social")){
					behavioralSlashSocialScienceCount++;
					behavioralSlashSocialScienceProjects.add(ss[0]);
				}
				else if(ss.length > 2 && ss[1].trim().equalsIgnoreCase("Environmental")){
					environmentalScienceCount++;
					environmentalScienceProjects.add(ss[0]);
				}
				else if(ss.length > 2 && ss[1].trim().equalsIgnoreCase("Life")){
					lifeScienceCount++;
					lifeScienceProjects.add(ss[0]);
				}
				else if(ss.length > 2 && ss[1].trim().equalsIgnoreCase("Earth/Space")){
					earthSlashSpaceScienceCount++;
					earthSlashSpaceScienceProjects.add(ss[0]);
				}
				else if(ss[1].trim().equalsIgnoreCase("Chemistry")){
					chemistryCount++;
					chemistryProjects.add(ss[0]);
				}
				else if(ss[1].trim().equals("Mathematics/Physics")){
					mathematicsSlashPhysicsCount++;
					mathematicsSlashPhysicsProjects.add(ss[0]);
				}
				
			}
			System.out.println("Chemistry: " + chemistryCount + chemistryProjects.size());
			System.out.println("Behavioral/Social Science: " + behavioralSlashSocialScienceCount + behavioralSlashSocialScienceProjects.size());
			System.out.println("Life Science: " + lifeScienceCount + lifeScienceProjects.size());
			System.out.println("Environmental Science: " + environmentalScienceCount + environmentalScienceProjects.size());
			System.out.println("Mathematics/Physcis: " + mathematicsSlashPhysicsCount + mathematicsSlashPhysicsProjects.size());
			System.out.println("Earth/Space Science: " + earthSlashSpaceScienceCount + earthSlashSpaceScienceProjects.size());
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(new JFrame(), "Problem counting subjects, emergency shutdown!");
			System.exit(0);
		}
		//Write to a file.
		try{
			FileWriter writer = new FileWriter(assigned_projects_file);
			//write the chemistry projects
			int copies = chemistryProjects.size()/6 + 1;
			for(int i = 0; i < copies; i++){
				writer.write("Chemistry_" + ((copies)-1+i) + " ");
				int amountOfJudges = 0;
				for(int j = 0; j < the_judges.size(); j++){
					if(the_judges.get(j).canJudgeChemistry == true && amountOfJudges < 3){
						writer.write(the_judges.remove(j).name+",");
						amountOfJudges++;
					}
				
				}
				writer.write("\n");
				
				writer.write("Projects:");
				if(chemistryProjects.size() >= 6){
					for(int k = 0; k < 6; k++){
						writer.write("doot");
						chemistryProjects.remove(k);
					}
				}
				else if(chemistryProjects.size()<6){
					for(int n = 0; n < chemistryProjects.size(); n++){
						writer.write("doot");
						
					}
				}
						
				writer.write("\n");
			}
	     	writer.close();
		}//end try block
		catch(Exception e){
			JOptionPane.showMessageDialog(new JFrame(), "Problem writing file, emergency shutdown!");
			System.exit(0);
		}
		//Declares end of program and exits
		JOptionPane.showMessageDialog(new JFrame(), "Program Finished");
	    System.exit(1);
	}//end main method
}//end class ScienceFairSorter
