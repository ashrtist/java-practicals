/*Q4. Write a Java program to display even & odd index values from an array.
Input:
 Array Size = 6
 Array Elements = 5 10 15 20 25 30
Output:
 Values at Even Index = 5 15 25
 Values at Odd Index = 10 20 30
Explanation:
Index starts from 0.
Even index positions are 0, 2, 4, ….
Odd index positions are 1, 3, 5, ….
We print the values according to their index category.
*/

import java.util.*;

public class ArrQ4
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
		
		String evenIndex = " ";
		String oddIndex = " ";
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				evenIndex=evenIndex+i+" ";
			}
			else
			{
				oddIndex=oddIndex+i+" ";
			}
		}
		
		//We print the values according to their index category.
		System.out.print("\nValues at Even Index= "+evenIndex);
		System.out.print("\nValues at Odd Index= "+oddIndex);
	}
}