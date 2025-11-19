import java.util.*

public class DisNonZeroArrElement {
	public static void main(String x[]){
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter the Size of Array:");
	int size=sc.nextInt();
	
	int a[]=new int[size];
	
	System.out.println("Enter the Elements in Array: ");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Elements Without Zero Values Are: ");
	for(int i=0;i<a.length;i++) {
		if(a[i]!=0) {
		System.out.print(a[i] + " ");
		}
    }
  }
}