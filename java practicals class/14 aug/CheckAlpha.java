import java.util.Scanner;

  public class CheckAlpha{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);
		String msg = ch>='a' && ch<='z' || ch>='A' && ch<='Z' ? "is Alphabet" : "Not Alphabet";
		System.out.println("The Number is : " + msg);
	}
  }
		
		