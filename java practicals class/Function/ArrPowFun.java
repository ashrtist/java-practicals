import java.util.*;

public class ArrPowFun {
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int b,i;
	System.out.println("Enter Base and Index: ");
	b=sc.nextInt();
	i=sc.nextInt();
	power(b,i);
}	
	public static void power(int base ,int index) //defination
	{
		int p=1;
		for(int i=1;i<=index;i++)
		{
			p = p*base;
		}
		System.out.println("Power is: " + p);
	}
}