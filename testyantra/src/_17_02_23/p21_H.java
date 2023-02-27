package _17_02_23;

import java.util.Scanner;

public class p21_H {
     public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Size...");
		int size=sc.nextInt();
		for(int r=1;r<=size;r++)
		{
			for(int c=1;c<=size;c++)
			{
				if(c==1 || r==(size+1)/2 ||c==size)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
