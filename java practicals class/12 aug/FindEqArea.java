import java.util.Scanner;

public class FindEqArea{
  public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Side of Equitorial Triangle: ");
	int a=sc.nextInt();
	float b= 1.73305081f;
	float area=(b / 4) * (a * a);
	System.out.println("The Area of Equitorial Triangle is : " + area);
	sc.close();
	}
  }

