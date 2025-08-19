//WAP to read the age of the candidate and determine wheather he is eligible to vote 

//write a program to find maximum number between 3 numbers

import java.util.*;

 public class Vote{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println ("Enter Your Age : " );
	int a = sc.nextInt();
	String d = (a>=18 ) ? "Candidate is Eligible for Vote" : "Candidate is not Eligible for Vote";
	System.out.println (d);
	}
}