import java.lang.*;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[]args) {
		System.out.println("hello");	
		
		System.out.println("Enter two whole numbers ona line: ");
		
		int n1, n2;
		
		Scanner keyboard = new Scanner(System.in);
				n1 = keyboard.nextInt();
				n2 = keyboard.nextInt();
				
				System.out.println(n1 + n2);
	}
	
}
