package _13_2_23;

import java.util.Scanner;

public class OddRange {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter The 1st value...");
		
		 int num=sc.nextInt();
		
	     System.out.println("Enter The 2nd Value...");
	     
	     int num1=sc.nextInt();
	     int count=0;
	     
	     for(int i =num; i<=num1;i++)
	     {
	    	int value=i;
	    	if(value%2==1)
	    	{
	    		System.out.println("Odd Numbers of Given Range "+num+" & "+num1+" is "+value);
	    		
	    		count++;
	        }
	     }
	     
	     System.out.println("Total Odd Numbers Are "+count);
	}
	
}
