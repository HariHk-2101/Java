package Pattern_Programs;

import java.util.Scanner;

public class P7 {

public static void main(String[] args) {
		/* 1 1 1 
		   2 2 2 
		   3 3 3 
		 */
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Row size..");
		
		int row=sc.nextInt();
		
        System.out.println("Enter The Col size..");
		
		int col=sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
		for(int j=1;j<=col;j++)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		}
	}
}
