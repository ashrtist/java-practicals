//Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.

import java.util.*;

	public class PassFail{
		public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Marks (Out Of 100): ");
		int marks = sc.nextInt();
		String msg = marks>=40 && marks<=100 ? " PASS " : marks<40 ? " FAIL " : "Please Enter Valid Marks" ;
		System.out.println(msg);
		}
	}