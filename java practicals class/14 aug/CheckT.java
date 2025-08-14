import java.util.Scanner;

  public class CheckT{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = sc.nextInt();
		System.out.println("Enter the Third Number");
		int num3 = sc.nextInt();
		String msg = num1==num2 && num2==num3 ? "Equilateral" : num1==num2 || num1==num3 ? "Isosacles" : "Saclene" ;
		System.out.println("The Triangle is : " + msg);
	}
  }
		
		