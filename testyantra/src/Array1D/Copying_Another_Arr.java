package Array1D;

import java.util.Scanner;

public class Copying_Another_Arr {

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
		 
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr1[i];
		}
		
		System.out.println("After copy The Elements... ");
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}
		
		
	}
}
