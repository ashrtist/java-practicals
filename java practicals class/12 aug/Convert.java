import java.util.Scanner;

public class Convert{
  public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Length in cm");
	int length=sc.nextInt();
	int meter=length/100;
	System.out.println("The Length in Meter is : " + meter);
	float kilometer=length/100000f;
	System.out.println("The Length in KiloMeter is : " + kilometer);
	sc.close();
	}
  }

