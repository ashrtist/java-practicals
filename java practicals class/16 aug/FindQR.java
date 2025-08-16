//Given two integers, write a Java program to find the quotient and remainder using only arithmetic operators.
//Input: dividend = 20, divisor = 3 Output: Quotient = 6, Remainder = 2

 public class FindQR {
   public static void main(String x[]) {
	int dividend = 20 ;
	int divisor = 3 ;
	int quotient = (dividend / divisor) ;
	int remainder = (dividend % divisor) ;
	System.out.println("The quotient is : " + quotient + "\nThe remainder is : " + remainder );
	}
}
	