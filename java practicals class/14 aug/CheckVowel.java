import java.util.Scanner;

  public class CheckVowel{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);
		String msg = ch=='a'|| ch=='e' || ch=='i'|| ch=='o'|| ch=='u'? "is Vowel" : "Consonant";
		System.out.println("The Number is : " + msg);
	}
  }
		
		