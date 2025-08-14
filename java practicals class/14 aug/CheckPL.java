import java.util.Scanner;

  public class CheckPL{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Cost Price");
		int num1 = sc.nextInt();
		System.out.println("Enter the Selling Price");
		int num2 = sc.nextInt();
		String msg = num1<num2 ? "Profit" : num1==num2 ? "Neither Profit Nor Loss" : "Loss" ;
		System.out.println("You are in : " + msg);
	}
  }
		
		