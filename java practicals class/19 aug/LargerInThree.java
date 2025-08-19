/* Take a three-digit number and print the larger digit among first and last digit using ternary operator. */

 import java.util.*;

	public class LargerInThree{
		public static void main (String x[]){
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the Three Digit Number");
			int num = sc.nextInt();
			int a = (num / 100 ) ;
			int b = (num % 10 ) ;
			int msg = (a>b) ? + a : + b ;
			System.out.println(msg);
		}
	}
			