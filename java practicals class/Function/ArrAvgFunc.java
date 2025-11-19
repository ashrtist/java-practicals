import java.util.*;

public class ArrAvgFunc {
	public static void main (String x[]) {
		int a[]=new int[5];	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Subjects Marks");
			for(int i=0;i<a.length;i++) {
				a[i]=sc.nextInt();
			}
		int getValue=getAvg(a);
		System.out.println("Average is: " + getValue);
	}
	public static int getAvg(int a[]){
		int total=0;
		for(int i=0;i<a.length;i++) {
			total=total+a[i];
		}
		int avg=total/a.length;
		return (avg);
	}
}