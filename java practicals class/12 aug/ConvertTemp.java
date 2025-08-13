import java.util.Scanner;

public class ConvertTemp{
  public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Temperature in Celsius");
	int Celsius=sc.nextInt();
	float Fah=(Celsius*9/5)+32f;
	System.out.println("The Temperature in Fahrenheit is : " + Fah);
	sc.close();
	}
  }

