package _15_02_23;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Row Size..");
		int row=sc.nextInt();
		System.out.println("Enter The Col Size...");
		int col=sc.nextInt();
		
		char ch='A';
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(i==1 || j==col || j==1 ||i==row)
				{
					System.out.print(ch++ +" ");
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
