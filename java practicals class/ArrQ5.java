/*Q5. Write a Java program to count even & odd values from an array.
Input:
 Array Size = 7
 Array Elements = 12 17 24 39 40 55 70
Output:
 Count of Even Values = 4
 Count of Odd Values = 3
Explanation:
Initialize counters: evenCount = 0, oddCount = 0.
For each element in the array:


If divisible by 2 → increase evenCount.
Otherwise → increase oddCount.


Final counts are displayed.
*/

import java.util.*;

public class ArrQ5
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
		
		//Initialize counters:
		int evenCount= 0;
		int oddCount= 0;
		for(int i=0;i<a.length;i++)
		{
			//For each element in the array:
			if(a[i]%2==0)
			{
				//If divisible by 2 → increase evenCount.
				evenCount++;
			}
			else
			{
				//Otherwise → increase oddCount.
				oddCount++;
			}
		}
		
		//Final counts are displayed.
		System.out.print("\n Count of Even Values = "+evenCount);
		System.out.print("\n Count of Odd Values = "+oddCount);
		
	}
}