package Pattern_Programs;

import java.util.Scanner;

public class Pattern12 {
	
	/*
	      5
	    5 4
	  5 4 3
	 */
    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
		 
		System.out.println("Enter The Size..");
		int size=sc.nextInt();
	
		for(int i=1;i<=size;i++)
		{
			int count=5;
			for(int j=size;j>=1;j--)
			{
				if(j<=i)
				{
					System.out.print(count-- +" ");
				}
				else {
					System.out.print(" "+" ");
				}
				
			}
			System.out.println();
		}
	
	}
}
