import java.util.*;

public class SumOfArray {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size: ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		int sum=0;
		System.out.println("Enter the Element: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}