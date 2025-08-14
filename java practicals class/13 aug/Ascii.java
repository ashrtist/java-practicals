//Write a Java program to print the ASCII value of a given character.


import java.util.*;

public class Ascii{
  public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Character : ");
	char a=sc.next().charAt(0);
	int b = a;
	System.out.println("The ASCII Value is : " + b);
	}	
}