package _18_02_23;

import java.util.Scanner;

public class Polygon {
	public static void areaOfRectangle(int a,int b)
	{
		   System.out.println("Your Area Of Rectangle is "+a*b);
	}
	
	public static void areaOfSquare(int a)
	{
		System.out.println("Your Area Of Square is "+a*a);
	}
	
	public static void areaOfCircle(double d)
	{
		System.out.println("Your Area Of Circle is "+3.14*d*d);
	}
	
	public static void areaOfTraingle(int a,int b)
	{
		System.out.println("Your Area Of Traingle is "+0.5* a*b);
	}
   public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	  
	  System.out.println(" Enter 1 to get Area Of Rectangle...");
	  System.out.println(" Enter 2 to get Area Of Square...");
	  System.out.println(" Enter 3 to get Area Of Circle...");
	  System.out.println(" Enter 4 to get Area Of Traingle...");
	  System.out.println();
	  System.out.println(" Choose Your Option...");
	  int choose =sc.nextInt();
	  
	  switch(choose)
	  {
	  case 1:{
		  areaOfRectangle(10,10);
	  }
	  break;
	  case 2:{
		  areaOfSquare(15);
	  }
	  break;
	  case 3:{
		  areaOfCircle(20.0);
	  }
	  break;
	  case 4:{
		  areaOfTraingle(25 , 30);
	  }break;
	  
	  default:
	  {
		  System.out.println("Invailid option...");
	  }
	  }
   }
}
