package mostfrequentelement;

import java.util.*;

public class MostFrequentElement {
	
	public static void main(String[]args){
		int [] elements = {1,3,4,1,5,2,3,6,6,6,4,1,2,6,2,3,1,2,1,5,5,1,1,5,4};
		int mostFrequent = 0;
		int amount = 0;
		ArrayList<Integer> theList = new ArrayList<Integer>();
		//Iterator<Integer> theListViewer = theList.iterator();
		
		for(int i = 0; i < elements.length; i++){
			theList.add(elements[i]);
		}
		
		System.out.println(theList);
	
		
		int[] numCount = new int[7];
				
		for(Integer a : theList){
			if( a==1)
				numCount[a]++;
			if( a==2)
				numCount[a]++;
			if( a==3)
				numCount[a]++;
			if(a==4)
				numCount[a]++;
			if(a==5)
				numCount[a]++;
			if(a==6)
				numCount[a]++;
			
		}
		
		for(int j = 0; j < numCount.length; j++)
			System.out.print(numCount[j] + " ");
                
                System.out.println();
		
		for(int k = 0; k < numCount.length; k++){
			if(numCount[k] > amount){
				mostFrequent = k;
				amount = numCount[k];
			}
		}
		System.out.println("The most frequent element is " + mostFrequent + " which occurs " + amount + " times");
	}
}
