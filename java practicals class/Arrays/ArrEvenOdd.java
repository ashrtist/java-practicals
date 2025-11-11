import java.util.*;

public class ArrEvenOdd {
	public static void main (String x[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the values of Array : ");
		for (int i=0 ; i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.print("\nArray Elements are : ");
		for (int i=0 ; i<a.length;i++){
			System.out.print(a[i] + " ");
		}
		
			System.out.print("\nEven Values are : ");
			for (int i=0 ; i<a.length;i++){
			if (a[i]%2==0) {
				System.out.print(a[i] + " ");
			}
			}
			System.out.print("\nOdd values Are : ");
			for (int i=0 ; i<a.length;i++){
			if (a[i]%2!=0) {
				System.out.print(a[i] + " ");
			}
			}
		}
	}