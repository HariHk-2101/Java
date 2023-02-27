package _24_02_23;

import java.util.Scanner;

public class P6_SumAndSub {
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
		  
		
		System.out.println("Printing The Elements,,");
     
	    for(int i=0;i<row;i++)
	    {
	    	for(int j=0;j<col;j++)
	    	{
	    		  for(int i1=0;i1<row1;i1++)
	    		    {
	    		    	for(int j1=0;j1<col1;j1++)
	    		    	{
	    		    		System.out.print( arr[i][j]+arr1[i1][j1]+" ");
	    		    		
	    		    	}
	    		    	System.out.println();
	    		    	}
	    	}
	    }
	}
}
