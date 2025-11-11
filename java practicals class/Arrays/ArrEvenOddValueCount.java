import java.util.*;

public class ArrEvenOddValueCount {
	public static void main (String x[]){
		Scanner sc = new Scanner (System.in);
		int evenCount=0;
		int oddCount=0;
		System.out.println("Array Size: ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Array Elements: ");
		for(int i=0 ;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0){
			evenCount++;
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0){
			oddCount++;
			}
		}
        System.out.println("\nCount of Even Values = " + evenCount);
        System.out.println("Count of Odd Values = " + oddCount);
	}
}