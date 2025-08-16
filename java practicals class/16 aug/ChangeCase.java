import java.util.*;

  public class ChangeCase { 
	public static void main(String x[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Character : ");
		char ch = sc.next().charAt(0);
		/*int num1 = ch;
		int num2 = ch;*/
		int a = 32 ;
		/*String msg1 = num1>=65 && num1<=91 ? "The Toggle Character is " : "Enter Valid" ;
		System.out.println((char)(num1+a));
		String msg2 = num2>=97 && num2<=123 ? "The Toggle Character is " : "Enter Valid" ;
		System.out.println((char)(num2-32));*/
		ch=(ch>='A'&&ch<='Z')?(char)((int)ch+a):(char)((int)ch-a);
		System.out.println("Toggle is = :"+ch);
		}
	}