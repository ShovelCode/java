

package HelloWorldPackage;

import java.util.Scanner;
import java.math.BigInteger;

/**
 * @author christopherray
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n1, n2, sum;
	//	BigInteger sum2;
		
		Scanner s = new Scanner(System.in);
		System.out.println("hello world, enter two ints");
		n1 = s.nextInt();
		n2 = s.nextInt();
		sum = n1 + n2;
	//	sum2 = new BigInteger(sum);
		System.out.println(sum);
		System.out.println(s.toString()); //Meinong Jungle test
	//	System.out.println(sum2.toString());
		s.close();
	}

}
