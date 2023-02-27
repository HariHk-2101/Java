package _15_02_23;

import java.util.Scanner;

public class Pattern14 {
	
   public static void main(String[] args) {
	   
	    	Scanner sc= new Scanner(System.in);
			 
			System.out.println("Enter The Size..");
			int size=sc.nextInt();
		
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
			
	  
		
}
}
