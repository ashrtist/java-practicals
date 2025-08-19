//Write a java program to find the maximum number between two numbers

import java.util.*;

	public class MaxFinder{
		public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number : ");
		int a = sc.nextInt();
		System.out.print("Enter the Second Number : ");
		int b = sc.nextInt();
		String msg = a>b ? "The Max Number is : " + a : a<b ? "The Max Number is :"+ b : "Values are Equal " ;
		System.out.println(msg);
		}
	}