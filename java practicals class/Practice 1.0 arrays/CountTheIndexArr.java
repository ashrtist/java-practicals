import java.util.*;

public class CountTheIndexArr {
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter Element:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int evencount=0;
		int oddcount=0;
		
		for(int i=0;i<a.length;i++) {
		if(a[i]%2==0) {
			evencount++;
		}else {
			oddcount++;	
			}
		}
		System.out.print("Count of the Even values: " + evencount);
		System.out.print("\nCount of the Odd values: " + oddcount);
	}
}

