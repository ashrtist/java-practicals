import java.util.Scanner;

public class Reverse {
	public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number : "); 
	int num=sc.nextInt();
	System.out.println("The Actual Number is : " + num);
	int m=((num%10)*100);
	System.out.println("The Reverse Number is : " + m);
	}
}
	