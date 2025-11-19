import java.util.*;

public class ArrMulFuc {
	public static void main(String x[]) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=getMul(a,b); //store return value
		System.out.println("Multiplication is: " + result);
	}
	public static int getMul(int x,int y){
		return x*y;
	}
}
