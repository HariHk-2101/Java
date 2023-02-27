package _15_02_23;

import java.util.Scanner;

public class Pattern13 {
  public static void main(String[] args) {
	 
	    	Scanner sc= new Scanner(System.in);
			 
			System.out.println("Enter The Size..");
			int size=sc.nextInt();
		
			for(int i=1;i<=size;i++)
			{
				char ch='A';
				for(int j=size;j>=1;j--)
				{
					if(j<=i)
					{
						System.out.print(ch++ +" ");
					}
					else {
						System.out.print(" "+" "); 
					}
					
				}
				System.out.println();
			}
		
}
}
