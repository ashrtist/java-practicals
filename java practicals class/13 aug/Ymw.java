//Write a Java program to convert days to years, month and week.

import java.util.*;

public class Ymw{
  public static void main(String x[]){
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter Number of Days : ");
	int days=sc.nextInt();
	int years = days/365 ;
	int months = days/30 ;
	int weeks = days/7 ;
	System.out.print("It will be " + years + "Years\n");
	System.out.print("It will be " + months + "Months\n");
	System.out.print("It will be " + weeks + "Weeks");
	sc.close();
  }
}
