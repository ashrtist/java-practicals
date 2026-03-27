/*Q6. Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found".*/

import java.util.*;

public class ArrQ6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();
		
		int a[]=new int[size];
		
		System.out.println("Enter the Elements in Array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("\nElements Are: ");
		int i=0;
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nEnter the Element to Search: ");
		int SearchKey=sc.nextInt();
		int SkeyIndex=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==SearchKey)
				//We traverse the array and compare each element with the search key. 
				//If it matches, print "found" with index; otherwise print "not found".*/
			{
				System.out.println("\nElement "+ SearchKey+ " Found At "+ i);
				SkeyIndex=i;
				break;
			}
		}
		//Swapping the Searched Element to the Next position
		//10 20 30 40 50
		if(SkeyIndex!=-1 && SkeyIndex<a.length)
		{
			int temp=a[SkeyIndex+1];
			a[SkeyIndex+1]=a[SkeyIndex];
			a[SkeyIndex]=temp;
		}
		System.out.println("\nElements Are: ");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}