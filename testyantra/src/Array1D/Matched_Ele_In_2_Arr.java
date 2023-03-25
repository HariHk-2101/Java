package Array1D;

import java.util.Scanner;

public class Matched_Ele_In_2_Arr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The 1st Array Size...");
		
		int size1=sc.nextInt();
		
		System.out.println("Enter The Elements....");
		
		int arr1[]=new int[size1];
		
		int k=0;
		
		for( k=0;k<arr1.length;k++)
		{
			arr1[k]=sc.nextInt();
		}
		
        System.out.println("Enter The 2nd Array Size...");
		
		int size2=sc.nextInt();
		
		System.out.println("Enter The Elements....");
		
		int arr2[]=new int[size2];
		
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		
		boolean flag=false;
		
		int a=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
				
			if(arr1[i]==arr2[j])
			{
				
				a=arr1[i];
				flag =true;
				
				
			}
			
		}
		
		if(flag)
		{
			System.out.println("Matched Elements Are "+a);
		}
		else
		{
			System.out.println("Matched Elements Are Not In Array: ");
		}
		
		
		
	}
}
