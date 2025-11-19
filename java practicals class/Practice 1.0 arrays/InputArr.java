import java.util.*;

public class InputArr{
	public static void main(String x[]) {
		Scanner sc = new Scanner(System.in);
	int a[]=new int[5];
	
	System.out.println("Enter Array Element");
	for(int i =0;i<a.length;i++) {
	a[i]=sc.nextInt();}
		
	System.out.println("Array Element :");
	for(int i =0;i<a.length;i++) {
		System.out.print(a[i] + " ");
	}
  }
}