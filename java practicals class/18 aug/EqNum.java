//write a program to accept to two integers and check it is equal or not

import java.util.*;

 public class EqNum{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println ("Enter 2 numbers : " );
	int a = sc.nextInt();
	int b = sc.nextInt();
	String d = (a==b) ? "Numbers are Equal" : "Numbers are NOT Equal" ;
	System.out.println (d);
	}
}