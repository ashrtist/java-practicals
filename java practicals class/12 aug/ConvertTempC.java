import java.util.Scanner;

public class ConvertTempC{
  public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Temperature in Fahrenheit ");
	int fah=sc.nextInt();
	int cel=(fah-32)*5/9;
	System.out.println("The Temperature in Celsius is : " + cel);
	sc.close();
	}
  }

