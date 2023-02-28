package _27_02_23;

import java.util.Scanner;

public class P12_Transposal {

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
	   System.out.println("Before Transposal....");
		for(int i=0;i<row;i++)
		{
			for( int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		int tran[][]=new int[row][col];
		System.out.println();
		System.out.println("After Transposal ....");
		for(int i=0;i<row;i++)
		{
			for( int j=0;j<col;j++)
			{
		     tran[j][i]=arr[i][j];
			}
		}
		
		for(int i=0;i<row;i++)
		{
			for( int j=0;j<col;j++)
			{
		     System.out.print(tran[i][j]);
			}
			System.out.println();
		}
		
		
	}


}
