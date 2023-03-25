package Pattern_Programs;

import java.util.Scanner;

public class Num_Square {
  public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Row Size..");
		int row=sc.nextInt();
		System.out.println("Enter The Col Size...");
		int col=sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(i==1 || i==col || j==1 ||j==4)
				{
					System.out.print(i+" ");
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
