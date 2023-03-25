package Pattern_Programs;

import java.util.Scanner;

public class Box_Shape {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Size...");
		int size=sc.nextInt();
		
		for(int r=1;r<=size;r++)
		{
			for(int c=1;c<=size;c++)
			{
				
			  if(r==c||r+c==size+1)
				{
					System.out.print(" "+" ");
				}
				else
				{
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}
	}
}
