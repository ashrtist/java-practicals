import java.util.*;

  public class CheckSpy { 
	public static void main(String x[]) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Number : ");
		int a = sc.nextInt();
		String msg = ((a % 10) + ((a/10) % 10) + ((a/100)%10) + (a/1000)) == ((a % 10) * ((a/10) % 10) * ((a/100)%10) * (a/1000)) ? "Spy Number" : "Not a Spy Number" ;
		System.out.println("It is " + msg );
		}
	}