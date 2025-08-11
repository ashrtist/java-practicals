import java.util.*;
public class AreaOfRectangle
{
  public static void main(String x[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("AREA OF RECTANGLE APP  \nEnter Length Of the rectangle: ");
	int length=sc.nextInt();
	System.out.println("Enter Length Of the rectangle: ");
	int breath=sc.nextInt();
	int area=length*breath;
	System.out.println("The Area Of Rectangle is: "+area);
}
}