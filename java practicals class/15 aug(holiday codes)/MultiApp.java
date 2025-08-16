//Multiplying the two floating values

import java.util.Scanner;

	public class MultiApp{
		public static void main(String x[]){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the first value : ") ;
			double num1 = sc.nextDouble();
			System.out.print("Enter the second value : ") ;
			double num2 = sc.nextDouble();
			double result = ( num1 * num2 );
			System.out.println("The Multiplication of the Given Number is : " + result);
		}
	}