import java.util.*;

public class ArrAddFun {
	public static void main (String x[]) {
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter two values: ");
	int a=sc.nextInt();
	int b =sc.nextInt();
	add(a,b); //function calling
	}
	public static void add(int a,int b) { //defination
	System.out.println("Addition is : " + a+b);
		}
}