/*QB Upgrade:
Print elements which are:

greater than previous
AND smaller than next

Example:

Input: 10 20 15 25 5  
Output: 20 15

This will test:

i-1 AND i+1
boundary conditions on BOTH sides*/

/*QA.Print all elements which have a next element greater than them

Example:

Input: 10 20 15 25 5  
Output: 10 15*/

import java.util.*;

public class ArrQB
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
		
		//  0  1  2  3  4 
		// 10 20 15 25 5
				 //25
		for(int i=1;i<a.length-1;i++) //i 1----->4
		{
			if(a[i]>a[i-1] || a[i]<a[i+1]) //
			{
				System.out.print(a[i]+" "); // 20 15 25
			}
		}
	}
}