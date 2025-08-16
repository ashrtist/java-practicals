// write a java program to display your name,age and city 

import java.util.Scanner;

	public class Info{
	  public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("_____Enter the Information Given______");
		System.out.print("Enter Your Name : ");
		String name = sc.next();
		System.out.print("Enter Your age : ");
		int age = sc.nextInt();
		System.out.print("Enter Your City : ");
		String city = sc.next();
	  }
	}