package Pattern_Programs;

import java.util.Scanner;

public class Pattern11 {
	
	/*
	      1
	    2 2
	  3 3 3  
	 */
   public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
		 
		System.out.println("Enter The Size..");
		int size=sc.nextInt();
	
		for(int i=1;i<=size;i++)
		{
			for(int j=size;j>=1;j--)
			{
				if(i>=j)
				{
					System.out.print(i+" ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	
}
}
