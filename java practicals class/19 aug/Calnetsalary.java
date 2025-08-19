/*Write a Java expression using arithmetic and assignment operators to calculate net salary if:
basicSalary = 35000
taxRate = 12%
 Find netSalary. */

	public class Calnetsalary{
		public static void main (String x[]){
			int bs = 35000;
			int tax = (bs * 12/100) ;
			int netsal = (bs-tax) ;
			System.out.println("The Net Salary is : " + netsal);
		}
	}
			