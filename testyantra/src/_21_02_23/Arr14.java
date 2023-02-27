package _21_02_23;

import java.util.Scanner;

public class Arr14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size..");
		
		int size=sc.nextInt();
		
		int arr1[]=new int [size];
		
		System.out.println("Enter The Elements...");
		
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();	
		}
		
		System.out.println("Enter Checking Element...");
		
		int check=sc.nextInt();
		
		boolean flag=false;
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==check)
			{
				flag=true;
				
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("User Input "+check+" is present In The Array..");
		}
		else
		{
			System.out.println("User Input "+check+" is Not present In The Array..");
		}
}
}
