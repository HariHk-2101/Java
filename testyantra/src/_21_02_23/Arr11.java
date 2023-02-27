package _21_02_23;

import java.util.Scanner;

public class Arr11 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number...");
		
		int size=sc.nextInt();
		
		System.out.println("Enter The Elements....");
		
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{ 
			if(arr[i]%2==1)
			{
				sum+=arr[i];
			}
		}
		
		System.out.println("Sum Of Odd Elements Of an Array is "+sum);
	}
}
