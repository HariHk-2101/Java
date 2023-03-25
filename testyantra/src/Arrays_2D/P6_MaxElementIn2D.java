package Arrays_2D;

import java.util.Scanner;

public class P6_MaxElementIn2D {

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
		
		
		int max=arr[0][0];
		for(int i=0;i<row;i++)
		{
			
			for( int j=0;j<col;j++)
			{
		        if(arr[i][j]>max)
		        {
		        	max=arr[i][j];
		        }
		        
		    }

		}
		System.out.println("Max Value In 2D Array is "+max);
	}
}
