package _27_02_23;

import java.util.Scanner;

public class P9_Even_Odd_2D {

	

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
			
			int even=0;
			int odd=0;
			for(int i=0;i<row;i++)
			{
				
				for( int j=0;j<col;j++)
				{
			        if(arr[i][j]%2==0)
			        {
			            even++;
			        	
			        }
			        else
			        {
			        	 odd++;
			        	
			        }
			        
			    }

			}
			System.out.println("Even Elements are " +even );
			System.out.println("Odd Elements are " +odd );
		}
}
