import java.util.Scanner;

  public class CheckDiv{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		String msg = num % 5 == 0 && num % 11 == 0 ? " divisible " : " not divisible";
		System.out.println("The Number is : " + msg);
	}
  }
		
		