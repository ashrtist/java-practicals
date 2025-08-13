import java.util.Scanner;

public class CalTotal{
  public static void main(String x[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("___MARKS And PERCENTAGE CALCULATOR___");
	System.out.print("Enter English Marks : ");
	int eng=sc.nextInt();
	System.out.print("Enter Hindi Marks : ");
	int hin=sc.nextInt();
	System.out.print("Enter Maths Marks : ");
	int maths=sc.nextInt();
	System.out.print("Enter Science Marks : ");
	int sci=sc.nextInt();
	System.out.print("Enter Social Studies Marks : ");
	int ss=sc.nextInt();
	int max=500;
	int Total=(eng+hin+maths+sci+ss);
	float Percentage= (Total/(float)max)*100;
	System.out.println("The Total Marks Obtained Out of 500 is : " + Total);
	System.out.print("The Percentage Obtained : " + Percentage);
	sc.close();
	}
  }

