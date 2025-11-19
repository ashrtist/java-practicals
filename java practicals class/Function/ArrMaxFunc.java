import java.util.*;

public class ArrMaxFunc {
	public static void main (String x[]) {
		int arr[]=new int[5];
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Five Numbers: ");
	for(int i=0;i<arr.length;i++){
		arr[i]=sc.nextInt();
	}
		int getValue=getMAX(arr);
		System.out.println("The MAX is :"+getValue);
	}
	public static int getMAX(int arr[]) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return(max);
	}
}