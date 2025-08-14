//Write a Java program to reverse a number without using loop.
//Input a number: 123 Reverse number: 321

import java.util.Scanner;

public class RevApp{
  public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter The Number To Reverse it");
	int num = sc.nextInt();
	int reverse = (num % 10) + ((num / 10)) + (num % 10 );
	System.out.println("The Reverse of the given number is : " + reverse);
	sc.close();
  }
}

