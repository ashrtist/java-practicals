//Write a Java program to convert seconds to hours, minutes and seconds. 


import java.util.Scanner;

public class TimeCheck{
  public static void main(String x[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the Time in Seconds");
  int seconds=sc.nextInt();
  int hours=seconds/3600;
  System.out.println("Time in Hours is : " + hours);
  int minutes=seconds/60;
  System.out.println("Time in Minutes is : " + minutes);
  sc.close();
  }
 }