import java.util.*;

public class ArrModFunc {
	public static void main(String x[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a=sc.nextInt();
		int result1=getMod(a);
		System.out.println("Number " + a + " %2 is : "+ result1);
		System.out.println("Enter the Number: ");
		int b=sc.nextInt();
		int result2=getMod(b);
		System.out.println("Number " + b + " %2 is : "+ result2);
	}
	public static int getMod(int x){
		return x%2;
	}
}