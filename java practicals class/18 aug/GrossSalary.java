//write a program to input basic salary of the employee and calculate its gross salary according to following:
//basic_salary <= 10000 , hra = 20 da = 80 % ;basic salary <= 20000 , hra = 25 da = 90 % ;basic salary > 20000 , hra = 30  da = 95 %

import java.util.*;

 public class GrossSalary{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println ("Enter Basic Salary : " );
	double basic_salary = sc.nextInt();
	
	System.out.println ("Enter Basic Salary : " );
	double d = ((basic_salary>0 && basic_salary <= 10000) ? (basic_salary + (basic_salary*0.2 ) + (basic_salary*0.8)): (basic_salary> 10000 && basic_salary <= 20000) ? (basic_salary + (basic_salary*0.25 ) + (basic_salary*0.90)) : (basic_salary + (basic_salary*0.30 ) + (basic_salary*0.95))) ;
	System.out.println( "The Gross Salary is " + d ) ;
	}
}