package _15_02_23;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Row Size..");
		int row=sc.nextInt();
		System.out.println("Enter The Col Size...");
		int col=sc.nextInt();
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
