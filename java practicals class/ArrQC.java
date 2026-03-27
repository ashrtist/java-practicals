/*Q3. First Occurrence Only

👉 Print index of first occurrence of element

Example:

Input: 10 20 30 20 40  
Search: 20  
Output: 1

👉 Focus:

Use break
Avoid unnecessary checks*/

import java.util.*;

public class ArrQC
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
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");//Finally, using a loop, we display all elements in the same order they were entered.
		}
		
		System.out.println("\nEnter the Search key: ");
		int Skey=sc.nextInt();
		
		
		//  0  1  2  3  4
		// 10 20 30 20 40 
		
		boolean Found=false;
		for(int i=0 ;i<a.length;i++)
		{
			if(a[i]==Skey)
			{
				System.out.println("Search key First Occurence is at Index: "+i);
				Found=true;
				break;
			}
		}
		if(!Found)
		{
			System.out.println("Element not Found!!!");
		}
	}
}