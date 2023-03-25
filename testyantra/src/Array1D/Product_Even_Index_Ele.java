package Array1D;

import java.util.Scanner;

public class Product_Even_Index_Ele{
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
		
		int prod=1;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				prod*=arr[i];
			}
		}
		
		System.out.println("The Total Product Of Elements At even Index is :"+prod);
	}
}
