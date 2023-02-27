package _21_02_23;

import java.util.Scanner;

public class Arr7 {
      public static void main(String[] args) 
      {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The size...");
		
		int size=sc.nextInt();
		
		System.out.println("Enter The Elements...");
		
		int [] arr=new int[size];
		
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+" is Even Number...");
			}
			else
			{
				System.out.println(arr[i]+" is Odd Number");
			}
		}
	}
}
