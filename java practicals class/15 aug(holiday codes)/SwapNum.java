import java.util.Scanner;

	public class SwapNum { 
      public static void main(String x[]) { 
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		System.out.println("The Numbers Before Swapping is a= " + a + " and b= " + b ) ;
		int c = a;
		a = b;
		b = c;
		System.out.println("The Numbers After Swapping is a= " + a + " and b= " + b ) ;
	  }
	}
		
	  