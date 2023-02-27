package _21_02_23;

import java.util.Scanner;

public class Arr3 {
	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter The Size...");
	
	int size=sc.nextInt();
	
	System.out.println("Enter The Elements..");
	
	int [] a= new int[size];
	
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	
	
	int sum=0;
	
	for(int i=0;i<a.length;i++)
	{
		sum+=a[i];
		
		
	}
	int avg=sum/a.length;
	System.out.println("The Total Avg Of Elements is :"+avg);
	
}
}
