package _17_02_23;

import java.util.Scanner;

public class P7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Size...");
		int size=sc.nextInt();
		
		for(int r=1;r<=size;r++)
		{
			for(int c=1;c<=size;c++)
			{
				if(r==1||c==1||r+c==size+1||r==c)
				{
					System.out.print("* ");
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}
