package _15_02_23;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Size..");
		int size=sc.nextInt();
	
		
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=size;j++)
			{
				if(i==1 || j==size || j==1 ||i==size ||i==j||i+j==size+1)
				{
					System.out.print("* ");
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
