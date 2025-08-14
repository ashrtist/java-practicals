import java.util.Scanner;

  public class CheckLeap{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year");
		int year = sc.nextInt();
		String msg = (year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0 ? " It is Leap Year " : " It is Not Leap Year";
		System.out.println(msg);
	}
  }
		
		