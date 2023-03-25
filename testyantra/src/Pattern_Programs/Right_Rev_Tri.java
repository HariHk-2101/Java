package Pattern_Programs;

import java.util.Scanner;

public class Right_Rev_Tri {
	
        public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 
		System.out.println("Enter The Size..");
		int size=sc.nextInt();
	
		  System.out.println("1st Logic..");
		for(int i=size;i>=1;i--)
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
		
		System.out.println(" 2nd Logic... Using Decrement");
		
		for(int i=size;i>=1;i--)
		   {
			
			for(int j=size;j>=1;j--)
			{
				if(i>=j)  
				{
					System.out.print("* ");
				}
				else {
					System.out.print(" "+" ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println("3 Logic..Using increament");
		for(int i=1;i<=size;i++)
		   {
			
			for(int j=1;j<=size;j++)
			{
				if(i<=j)  
				{
					System.out.print("* ");
				}
				else {
					System.out.print(" "+" ");
				}
				
			}
			System.out.println();
		}
		
		System.out.println();
}
}
