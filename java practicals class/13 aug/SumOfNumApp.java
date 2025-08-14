//Write a Java program and compute the sum of an integer's digits.
 import java.util.Scanner;
 
 public class SumOfNumApp{
	 public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number : ");
	int num = sc.nextInt();
	int sumofnum = (num % 10 ) + (( num / 10 ) % 10) + ((num / 10) / 10);
	System.out.println("The Sum of the Integer is " + sumofnum);
	sc.close();
 }
}
  