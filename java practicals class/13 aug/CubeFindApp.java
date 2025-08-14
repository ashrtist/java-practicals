//Write a Java program that reads a number and display the cube.

import java.util.Scanner;

public class CubeFindApp{
  public static void main(String x[]){
	Scanner sc = new  Scanner(System.in);
	System.out.print("Enter the Number : ");
	int num = sc.nextInt();
	int cubes = num*num*num;
	System.out.println("The Cube of " + num + " is " + cubes );
	sc.close();
	}
}