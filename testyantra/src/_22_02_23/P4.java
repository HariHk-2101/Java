package _22_02_23;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The 1st Array Size...");
		
		int size1=sc.nextInt();
		
		System.out.println("Enter The Elements....");
		
		int arr1[]=new int[size1];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
        System.out.println("Enter The 2nd Array Size...");
		
		int size2=sc.nextInt();
		
		System.out.println("Enter The Elements....");
		
		int arr2[]=new int[size2];
		
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		
		int arr3[]=new int[arr1.length+arr2.length];
		
		int temp1=0 ,temp2=0;
		
		for(int i=0;i<arr3.length;)
		{
			if(temp1<arr1.length)
			{
				arr3[i]=arr1[temp1++];
			    i++;
			}
			if(temp2<arr2.length)
			{
				arr3[i]=arr2[temp2++];
				i++;
			}
				
		}
		
		for(int i=0;i<arr3.length;i++)
		{
		  System.out.print(arr3[i]+ " ");
		}
}
}
