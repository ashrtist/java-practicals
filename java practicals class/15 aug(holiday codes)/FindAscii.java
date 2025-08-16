//Find the ASCII Value 

import java.util.Scanner;

	public class FindAscii{
		public static void main(String x[]){
			Scanner sc = new Scanner(System.in);
			System.out.println("________ASCII Value Finder For Character_________ ");
			char charascii = sc.next().charAt(0);
			int a = charascii ;
			System.out.println("Ascii  Value : " + a);
		}
	}