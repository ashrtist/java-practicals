import java.util.*;

public class ShowArrIndex{
	public static void main (String x[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Array Size : ");
		int size =sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the Array Elements : ");
		for(int i =0 ; i<a.length ;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("\nValues at Even Index: ");
		for (int i=0 ;i<a.length ;i++) {
			if(i%2==0){
			System.out.print(a[i]+" ");
			}
		}
		System.out.println("\nValues at Odd Index: ");
		for (int i=0 ;i<a.length ;i++) {
			if(i%2!=0){
			System.out.print(a[i]+" ");
			}	
		}
		
	}
}