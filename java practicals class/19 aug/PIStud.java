 /* Take percentage and income of a student:
If percentage >= 75 AND income < 200000, print "Eligible"
Else "Not Eligible" */
 
 
 import java.util.*;

	public class PIStud{
		public static void main (String x[]){
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter Percentage");
			int per = sc.nextInt();
			System.out.println("Enter the Income");
			int inc = sc.nextInt();
			String msg = (per>=(int)75 ) && (inc <= (int)200000) ? " Eligible" : " Not Eligible " ;
			System.out.println(msg);
		}
	}
			