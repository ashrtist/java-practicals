import java.util.Scanner;

  public class CheckEvenOdd{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		String msg = num % 2 == 0 ? "Even" : "Odd";
		System.out.println("The Number is : " + msg);
	}
  }
		
		