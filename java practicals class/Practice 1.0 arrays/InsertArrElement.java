import java.util.*

public class InsertArrElement {
	public static void main(String x[]){
	Scanner sc =new Scanner (System.in);
	System.out.println("Enter the Size of Array:");
	int size=sc.nextInt();
	
	int a[]=new int[size];
	
	System.out.println("Enter the Elements in Array: ");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	
	System.out.println("Enter the Position Of Index to Insert the Value: ");
	int pos=sc.nextInt();
	
	System.out.println("Enter The Value To Insert: ");
	int value=sc.nextInt();
	
	int b[]=new int[size+1];
	int j=0;
	
	for(int i=0;i<b.length;i++) {
		if(i==pos) {
		b[i]=value;
		}
		else {
			b[i]=a[j];
			j++;
		}
	}
	System.out.println("New Arrays Elements Are: ");
	for(int i=0;i<b.length;i++) {
	System.out.print(b[i]+ " ");
	}
}
}