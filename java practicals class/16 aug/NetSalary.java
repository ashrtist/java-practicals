//Write a Java program to calculate the net salary of an employee.
//Input: basic salary, HRA %, DA %, and tax %.

import java.util.*;

  public class NetSalary{
	public static void main(String x[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the Basic Salary :  ");
	double basic_salary = sc.nextInt();
	System.out.print("\nEnter the HRA : ");
	double HRA = sc.nextInt();
	System.out.print("\nEnter the DA : ");
	double DA = sc.nextInt();
	System.out.print("\nEnter the Tax : ");
	int tax = sc.nextInt();
	double op3 = (basic_salary/100);
	double net_salary = ((basic_salary + HRA + DA ) -op3 );
	System.out.print("The Net Salary is "  + net_salary);
	}
  }