//write a program to find maximum number between 3 numbers

import java.util.*;

 public class FMNum{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println ("Enter 3 numbers : " );
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	String d = (a>b && a>c) ? "A is Greater " : (b>a && b>c )? "B is Greater" : "C is Greater" ;
	System.out.println (d);
	}
}