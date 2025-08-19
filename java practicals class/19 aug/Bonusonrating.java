//If performance rating > 8, give 15% bonus; else if rating > 5, give 10% bonus; otherwise, no bonus. Use relational operators to implement logic.

import java.util.*;

	public class Bonusonrating{
		public static void main (String x[]){
			Scanner sc = new Scanner (System.in);
			System.out.print("Enter the Performance Rating : ");
			int a = sc.nextInt();
			String msg = (a>8) ? "15 % bonus" : (a>5) ? "10 % Bonus" : "No Bonus" ;
			System.out.println(msg);
		}
	}