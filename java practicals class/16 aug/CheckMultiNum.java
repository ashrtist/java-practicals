//Write a Java program to check whether a number is a multiple of both 3 and 5 using logical AND (&&) operator.
import java.util.*;

  public class CheckMultiNum {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : " ) ;
		int num = sc.nextInt();
		String msg = num%3==0 && num%5==0 ? "Yes Number is Multiple of Both 3 and 5" : "No Number is Not Multiple of Both 3 and 5" ;
		System.out.println(msg);
	    }
    }

