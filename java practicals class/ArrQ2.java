/*Q2. Write a Java program to calculate the sum of all elements in an array.
Input:
 Array Size = 5
 Array Elements = 2 4 6 8 10
Output:
 Sum of array elements = 30
Explanation:
Initialize a variable sum = 0.
Traverse the array and keep adding each element to sum.
After the loop ends, sum will hold the total of all array elements.
*/

import java.util.*;

public class ArrQ2
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
		
		int sum=0;
		int i=0;
		System.out.println("\nArray Elements Are: ");
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];//Traverse the array and keep adding each element to sum.
		}
		System.out.print(sum);//Finally,After the loop ends, sum will hold the total of all array elements.	
	}
}