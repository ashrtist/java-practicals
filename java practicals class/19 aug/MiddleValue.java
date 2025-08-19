//Take two integers m and n. Use the ternary operator to print whether the absolute difference between them is greater than 10 or not.
//Example Input:
//m = 25, n = 12

  import java.util.*;

	public class MiddleValue{
		public static void main (String x[]){
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the First Digit");
			int a = sc.nextInt();
			System.out.println("Enter the Second Digit");
			int b = sc.nextInt();
			String msg = (a - b > (int)10 ) ? " Greater Than 10 " : " Not Greater Than 10 " ;
			System.out.println(msg);
		}
	}
			