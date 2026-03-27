/*🔥 Q5. Swap Only If Safe

👉 Swap element with next ONLY IF next exists AND next is smaller

Example:

Input: 10 50 30 40  
Output: 10 30 50 40

💡 Because:

50 > 30 → swap
others stay

👉 Focus:

Dual condition:
boundary
comparison*/

import java.util.*;

public class ArrQD
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
		System.out.println("\nArray Elements Before Swapping Are: ");
		for(int i=0;i<a.length;i++)
		{
			
			System.out.print(a[i]+" ");//Finally, using a loop, we display all elements in the same order they were entered.
		}
		
		//  0 1 2 3 4
		//  4 3 2 1 5
	
				  //3<4
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1]) //5>1
			{
				int temp=a[i]; //temp=5 
				a[i]=a[i+1];	//a[i]=1
				a[i+1]=temp;	//a[i+1]=5	
			}
		}
		
								//OUTPUT: 4 3 2 1
		System.out.println("\nArray Elements After Swapping Are: ");
		for(int i=0;i<a.length;i++)
		{
			
			System.out.print(a[i]+" ");//Finally, using a loop, we display all elements in the same order they were entered.
		}
	}
}