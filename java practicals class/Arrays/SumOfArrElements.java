import java.util.*;

public class SumOfArrElements {
	public static void main(String x[]) {
		Scanner sc = new Scanner (System.in);
		int sum =0;
		System.out.print("Enter the Size of Array: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter "+size + " Elements :");
		for(int i =0; i<a.length;i++){
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum of Array is " + sum);
	}
}