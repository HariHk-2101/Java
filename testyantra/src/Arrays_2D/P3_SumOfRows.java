package Arrays_2D;

import java.util.Scanner;

public class P3_SumOfRows {

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
		int count=1;
		for(int i=0;i<row;i++)
		{
			int sum=0;
			for(int j=0;j<col;j++)
			{
				
				
				 sum+=arr[i][j];
				
				
			}
			System.out.print("Sum of "+count++ +" row: "+sum);
			System.out.println();
		}
		
		
}
}
