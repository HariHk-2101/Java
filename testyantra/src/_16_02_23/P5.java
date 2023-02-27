package _16_02_23;

import java.util.Scanner;

public class P5 {
   public static void main(String[] args) {
	 	Scanner sc= new Scanner(System.in);
		 
			System.out.println("Enter The Size..");
			int size=sc.nextInt();
		
			for(int i=1;i<=size;i++)
			   {
				
				for(int j=1;j<=size-i;j++)
				{
					
						System.out.print(" "+" ");
				}
				
				for(int s=1;s<=i;s++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			
			System.out.println();
			
			System.out.println("Another Logic..");
			
			for(int i=1;i<=size;i++)
			{
				
				for(int j=size;j>=1;j--)
				{
					if(j<=i)
					{
						System.out.print("* ");
					}
					else {
						System.out.print(" "+" ");
					}
					
				}
				System.out.println();
			}
}
}
