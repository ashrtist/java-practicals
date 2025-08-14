import java.util.Scanner;

  public class CheckAlphaNum{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value");
		char ch = sc.next().charAt(0);
		String msg = ch>='a' && ch<='z' || ch>='A' && ch<='Z' ? "is Alphabet" : ch>='0' && ch<='9' ? "Digit" : "Special Character";
		System.out.println("The Value is : " + msg);
	}
  }
		
		