import java.util.Scanner;

public class FindAngle{
  public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the First Angle : ");
	int a=sc.nextInt();
	System.out.print("Enter the Second Angle : ");
	int b=sc.nextInt();
	int c=(180-(a+b));
	System.out.println("The Third Angle Of Triangle is : " + c);
	sc.close();
	}
  }

