import java.util.*;

public class SearchArr {
	public static void main (String x[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Size : ");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the Elements: ");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the element to search: ");
		int search=sc.nextInt();
		
		boolean found=false;
		int index=-1;
		
		for(int i =0;i<a.length;i++) {
			if(a[i]==search) {
				found=true;
				index=i;
				break;
			}
		}
		if(found) {
			System.out.println("Element " +search+" Found at "+ index);
		} else {
			System.out.println("Element Not Found");
		}
	}
}

