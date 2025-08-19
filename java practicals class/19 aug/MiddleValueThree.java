/* Write a Java program using the conditional (ternary) operator to find the middle value among three distinct integers p, q, and r.
Example Input:
p = 10, q = 20, r = 15 */

 import java.util.*;

	public class MiddleValueThree{
		public static void main (String x[]){
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the First Digit");
			int p = sc.nextInt();
			System.out.println("Enter the Second Digit");
			int q = sc.nextInt();
			System.out.println("Enter the Third Digit");
			int r = sc.nextInt();
			String msg = (p>q && p<r || p<q && p>r ) ? "The Middle number is "+ p : (q>p && q<r || q<p && q>r ) ? "The Middle number is  " + q : "The Middle number is " + r ;
			System.out.println(msg);
		}
	}
			