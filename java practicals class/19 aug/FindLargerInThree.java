/* Take a three-digit number and print whether the middle digit is greater than the sum of the first and last digits using the ternary operator.

Example:
Input: num = 572 → Middle digit 7 vs (5+2)=7 → Equal or Not Greater */

 import java.util.*;

	public class FindLargerInThree{
		public static void main (String x[]){
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the Three Digit Number");
			int num = sc.nextInt();
			int a = (num / 100 ) ;
			int b = (num % 10 ) ;
			int c = ((num / 10 ) % 10) ;
			String msg = (c>a+b) ? "Greater" : ( c == a+b ) ? "Equal" : "Not Greater" ;
			System.out.println(msg);
		}
	}
			