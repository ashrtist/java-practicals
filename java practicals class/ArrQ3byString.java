import java.util.*;

public class ArrQ3byString
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Size of Array: ");
		int size=sc.nextInt();//First, we take the size of the array from the user.
		int a[]=new int [size];
		
		System.out.println("Enter the Array Elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();//Then, elements are entered one by one into the array.
		}
		
		String even =" "; //if we use "int" it will give sum of even numbers and odd numbers
		String odd = " ";
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				// Store even number in 'even' String with space as separator
				// This helps to print all even numbers together later
				even = even+a[i]+" ";
			}
			else
			{
				// Store odd number in 'odd' String with space as separator
				// This creates a separate list of odd numbers
				odd = odd +a[i]+" ";
			}
		}
		
		// After traversal, print grouped results
		// Headings are printed only once for clean formatted output
		System.out.print("Even values= "+even);
		System.out.print("\nOdd values= "+odd);
	}
}