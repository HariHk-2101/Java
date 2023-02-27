package _16_02_23;

import java.util.Scanner;

public class P1 {
   public static void main(String[] args) {

   	Scanner sc= new Scanner(System.in);
		 
		System.out.println("Enter The Size..");
		int size=sc.nextInt();
	
		for(int i=1;i<=size;i++)
		   {
			
			for(int j=i;j<=size;j++)
			{
				
					System.out.print("* ");
				
				
			}
			System.out.println();
		}
}
}
