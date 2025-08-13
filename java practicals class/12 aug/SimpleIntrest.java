import java.util.Scanner;

public class SimpleIntrest{
  public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("___SIMPLE INTREST CALCULATOR___");
	System.out.print("Enter Principle Amount (The money you invest or borrow) : ");
	double P=sc.nextInt();
	System.out.print("Enter Rate Of Intrest Per Year : ");
	double R=sc.nextInt();
	System.out.print("Enter Time (in years) : ");
	double T=sc.nextInt();
	double f= P * Math.pow((1 + R/100), T);
	double CI = f-P ;
	System.out.println("The Simple Intrest will be : " + CI);
	sc.close();
	}
  }

