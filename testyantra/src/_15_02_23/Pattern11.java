package _15_02_23;

import java.util.Scanner;

public class Pattern11 {
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
