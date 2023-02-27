package _21_02_23;

import java.util.Scanner;

public class Arr13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size..");
		
		int size=sc.nextInt();
		
		int arr1[]=new int [size];
		
		int arr2[]=new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();	
		}
		 int j=0;
		for(int i=arr1.length-1;i>=0;i--)
		{
			arr2[j]=arr1[i];
			j++;
		}
		
		System.out.println("After copy The Elements... ");
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		
		
	}
}


