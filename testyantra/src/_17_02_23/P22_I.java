package _17_02_23;

import java.util.Scanner;

public class P22_I {

	 public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter The Size...");
			int size=sc.nextInt();
			for(int r=1;r<=size;r++)
			{
				for(int c=1;c<=size;c++)
				{
					if(r==1&&c==1 || r==1&&c==size||r==size&&c==1 || r==size&&c==size) {
						System.out.print("  ");
					}
				else if(r==1 || c==(size+1)/2 ||r==size)
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

