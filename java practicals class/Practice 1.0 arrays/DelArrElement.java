import java.util.*

public class DelArrElement {
	public static void main(String x[]){
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter the Size of Array:");
	int size=sc.nextInt();
	
	int a[]=new int[size];
	
	System.out.println("Enter the Elements in Array: ");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	
	System.out.println("Enter the Position Of Index to Delete the Value: ");
	int del=sc.nextInt();
	
	int b[]=new int[size-1];
	int j=0;
	
	for(int i=0;i<a.length;i++) {
		if(i!=del) {
		b[j]=a[i];
		j++;
		}
	}
	for(int i=0;i<b.length;i++) {
	System.out.println("New Arrays Elements Are: "+ b[i]);
	}
}
}