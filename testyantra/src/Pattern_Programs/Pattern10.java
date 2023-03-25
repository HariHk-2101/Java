package Pattern_Programs;

import java.util.Scanner;

public class Pattern10 {
	/*
	        1
	      1 2
	    1 2 3
	 */
		public static void main(String[] args) {
			 Scanner sc= new Scanner(System.in);
			 
				System.out.println("Enter The Size..");
				int size=sc.nextInt();
			
				for(int i=1;i<=size;i++)
				{
					int count=1;
					for(int j=size;j>=1;j--)
					{
						if(j<=i)
						{
							System.out.print(count++ +" ");
						}
						else {
							System.out.print(" "+" ");
						}
						
					}
					System.out.println();
				}
			
		}
}
