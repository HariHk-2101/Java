package _27_02_23;

import java.util.Scanner;

public class P8_Comparing2D_Arrays {

	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		
//		System.out.println("Enter The row size..");
//		int row=sc.nextInt();
//		System.out.println("Enter The Col Size..");
//		int col=sc.nextInt();
//		
//	 int arr[][]=new int[row][col];
	
		
//		for(int i=0;i<row;i++)
//		{
//			System.out.println("Enter The data for Row No "+(i+1));
//			
//			for(int j=0;j<col;j++)
//			{
//				arr[i][j]=sc.nextInt();
//			}
//		}
//	
//		System.out.println("Enter The 2nd Array row size..");
//		int row1=sc.nextInt();
//		System.out.println("Enter The 2nd Array The Col Size..");
//		int col1=sc.nextInt();
		
//		 int arr1[][]=new int[row1][col1];
//		for(int i=0;i<row1;i++)
//		{
//			System.out.println("Enter The data for Row No "+(i+1));
//			
//			for(int j=0;j<col1;j++)
//			{
//				arr1[i][j]=sc.nextInt();
//			}
//		}
		
		 int arr[][]=new int[2][2];
		 int arr1[][]=new int[2][2];
		if(arr.length==arr1.length && arr[0].length==arr1[0].length)
		{
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
			for( int j=0;j<arr[i].length;j++)
			{
		        if(arr[i][j]!=arr1[i][j])
		        {
		        	flag=false;
		        	break;
		        }
		        
		    }

		}
		if(flag==true)
		{
			System.out.println("2D Arrays are same...");
		}
		else
		{
			System.out.println("Not Same...");
		}
	  }
		else
			
		{
			System.out.println("Arrays lenth is Not Same..");
		}
		
		
		
	}
}
