import java.util.*;
public class CircleApp
{
   public static void main(String x[])
{
	System.out.println("Let's Find the Diameter, Area and Circumference Of Circle \nEnter the Radius Of Circle");
	Scanner sc=new Scanner(System.in);
	int radius=sc.nextInt();
	int diameter=2*radius;
	double cicumference=2*3.14*radius;
	double area=3.14*radius*radius;
	System.out.println("Diameter: " + diameter + "\nCircumference: " + cicumference + "\nArea: " + area);
}
}
