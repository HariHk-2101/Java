package _27_02_23;

import java.util.Scanner;

public class P1_Matrix_Add {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The row size..");
		int row=sc.nextInt();
		System.out.println("Enter The Col Size..");
		int col=sc.nextInt();
		
	 int arr[][]=new int[row][col];
	
		
		for(int i=0;i<row;i++)
		{
			System.out.println("Enter The data for Row No "+(i+1));
			
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Printing The 1st Array Elements..");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			System.out.print(arr[i][j]+" ");
		}
			System.out.println();
		}
		System.out.println("Enter The 2nd Array row size..");
		int row1=sc.nextInt();
		System.out.println("Enter The 2nd Array The Col Size..");
		int col1=sc.nextInt();
		
		 int arr1[][]=new int[row1][col1];
		for(int i=0;i<row1;i++)
		{
			System.out.println("Enter The data for Row No "+(i+1));
			
			for(int j=0;j<col1;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Printing The 2nd Array Elements..");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
			System.out.print(arr1[i][j]+" ");
		}
			System.out.println();
		}
		
		
		int sum[][]=new int[row][col];
		  System.out.println("");
	       for(int i=0;i<row;i++)
           	{
	    	   for(int j=0;j<col;j++)
	    	   {
	    		   for(int i1=0;i1<row;i1++)
	              	{
	   	    	   for(int j1=0;j1<col;j1++)
	   	    	   {
	    	   
	    	         System.out.print(arr[i][j]+arr1[i1][j1]);
	    	   }
	    	   System.out.println();
            }
	    	   }
           	}
//	       
//	       System.out.println("sum of elememts...");
//	       for(int i=0;i<col;i++)
//          	{
//	    	   for(int j=0;j<col;j++)
//	    	   {
//	    	    System.out.print(sum[i][j]+" ");
//	    	   }
//	    	   System.out.println();
//           }
	       
	       
  }
}
