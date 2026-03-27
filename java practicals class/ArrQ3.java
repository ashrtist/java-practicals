/*Q3. Write a Java program to display even & odd values from an array.
Input:
 Array Size = 6
 Array Elements = 11 20 33 42 55 60
Output:
 Even Values = 20 42 60
 Odd Values = 11 33 55
Explanation:
Traverse the array element by element.
If an element is divisible by 2, it is even. Otherwise, it is odd.
Separate lists are displayed for even and odd values.
*/

import java.util.*;

public class ArrQ3
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
		
		System.out.print("\nEven Values= ");
		for(int i=0;i<a.length;i++)//Traverse the array element by element.
		{
			if(a[i]%2==0)//If an element is divisible by 2, it is even.
			{
				System.out.print(a[i]+" ");
			}
		}	
		System.out.print("\nOdd Values= ");
		for(int i=0;i<a.length;i++)//Traverse the array element by element.
		{
			if(a[i]%2!=0)//Otherwise, it is odd.
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}