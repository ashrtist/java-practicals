import java.util.*;

public class CopyArr {
	public static void main(String x[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size of Array: ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		int b[]=new int[size];
		
		
		System.out.println("Enter the Elements: ");
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.print("Elements in a[i] are : ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
		System.out.print("\nElements in b[i] are :  ");
		for(int i=0;i<b.length;i++) {
			b[i]=a[i];
			System.out.print(b[i] + " ");
		}
	}
}