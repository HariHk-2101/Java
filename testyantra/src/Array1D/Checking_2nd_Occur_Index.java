package Array1D;

import java.util.Scanner;

public class Checking_2nd_Occur_Index {

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
		
		System.out.println("Enter The Check Number..");
		int check=sc.nextInt();
		
		int count=0;
		
		boolean flag=false;
		int j;
		for(j=0;j<arr1.length;j++)
		{
			if(arr1[j]==check)
			{
				count++;
			}
			if(count==2)
				{
					flag=true;
					break;
				}
				
		}
		
		if(flag)
		{
		System.out.println("Second Occurance in "+j+" index position");
		}
		else
		{
		System.out.println("There Is No Second Occurance..");
		}
	}
}


