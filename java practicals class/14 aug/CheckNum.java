import java.util.Scanner;

  public class CheckNum{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		String msg = num > 0 ? "positive" : num < 0 ? "negative" : "Zero";
		System.out.println("The Number is : " + msg);
	}
  }
		
		