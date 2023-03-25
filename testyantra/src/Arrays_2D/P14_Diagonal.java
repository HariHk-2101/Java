package Arrays_2D;

import java.util.Scanner;

public class P14_Diagonal {

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
		boolean flag=false;
		for(int i=0;i<row;i++)
		{
			
			for( int j=0;j<col;j++)
			{
			     if(arr[i][j]==1)
			     {
			    	flag=true;
			     }
			     else
			     {
			    	flag=false;
			    	break;
			     }
			}
			System.out.println();
			
		}
		System.out.println("Printing Elements....");
		for(int i=0;i<row;i++)
		{
			
			for( int j=0;j<col;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
	     }
		
		if(flag==true)
		{
			System.out.println("Identical Matrix..");
		}
		else
		{
			System.out.println("Not A Identical Matrix...");
		}
	}
}
