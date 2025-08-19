//Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50)

import java.util.*;

	public class Marks{
		public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Marks (Out Of 100): ");
		int marks = sc.nextInt();
		String msg = marks>=90 && marks<=100 ? marks + ":Excellent" : marks>=75 && marks<=100 ? marks + ": Good" : marks>=50 && marks<=100  ? marks + ": Average" : marks<=50 && marks<=100 ? marks + ": Poor " + "You Are failed" : "Enter valid Marks" ;
		System.out.println(msg);
		}
	}