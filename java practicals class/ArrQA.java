/*QA.Print all elements which have a next element greater than them

Example:

Input: 10 20 15 25 5  
Output: 10 15*/

import java.util.*;

public class ArrQA
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
		
		System.out.println("\nArray Elements Are: ");
		for(int i=0;i<a.length;i++) //i 0----->4
		{
			if(a[i+1]>a[i])
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}