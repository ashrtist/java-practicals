// Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators.
  import java.util.*;

	public class PerfectSquare{
		public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		System.out.print("The Square of the Number is : " + (num) * (num));
		double sqrt = Math.sqrt(num);
		System.out.print("\nThe Square Root of the Number is : " + sqrt );
		String msg = sqrt== (int)sqrt ? " \nThe Number is Perfect Square" : " \n The Number is NOT a Perfect Square " ;
		System.out.println(msg);
		}
	}
	