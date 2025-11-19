import java.util.*;

public class ReverseArr {
	public static void main(String x[]) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the Size of Array: ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.print("Enter the Array Element: " + " ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		int start=0;
		int end=a.length-1;
		while(start<end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			
			start++;
			end--;
		}
		System.out.println("Reversed Array: ");
		for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+ " ");	
		}
	}
}