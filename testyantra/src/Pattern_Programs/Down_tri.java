package Pattern_Programs;

import java.util.Scanner;

public class Down_tri {
	 public static void main(String[] args) {
		   Scanner sc= new Scanner(System.in);
			 
		 		System.out.println("Enter The Size..");
		 		int size=sc.nextInt();
		 	
		 		for(int r=size;r>=1;r--)
		 		{
		 			for(int j=1;j<=size-r;j++)
		 			{
		 				System.out.print(" "+" ");
		 			}
		 				for(int k=1;k<=2*r-1;k++)
		 				{
		 					if(k==1||r==size|| k==2*r-1)
							{
								System.out.print("* ");
							}
							else
							{
								System.out.print(" "+" ");
							}
		 				}
		 				
		 				System.out.println();
		 		}
	}
}

