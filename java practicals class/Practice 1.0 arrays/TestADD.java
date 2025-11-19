import java.util.*;
public class TestADD 
{
	public static void main(String x[]) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter two values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		add(a,b); //calling
	}
	public static void add(int x,int y) //defination
	{
		System.out.println("Addition is: " +(x+y));
	}
}