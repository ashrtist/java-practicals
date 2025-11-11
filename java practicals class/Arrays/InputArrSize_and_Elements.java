import java.util.*;

public class InputArrSize_and_Elements {
	public static void main(String x[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Array Size = ");
		
		int size = sc.nextInt(); //store size in'size' variable
		int a[]=new int[size];   //create array of 'size'
		
		System.out.println("Enter "+size+" Elements");
		for(int i =0 ; i<a.length ; i++) {
			a[i]=sc.nextInt(); //input element
		}
		
		System.out.println("Array Elements= ");
		for(int i =0 ; i<a.length ; i++){
			System.out.print(a[i] + " ");
		}
	}
}