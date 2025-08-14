import java.util.Scanner;

  public class CheckTriangleValid{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Angle");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Angle");
		int num2 = sc.nextInt();
		System.out.println("Enter the Third Angle");
		int num3 = sc.nextInt();
		String msg = num1 + num2 + num3 == 180 ? "Valid" : "Not Valid";
		System.out.println("The Triangle is : " + msg);
	}
  }
		
		