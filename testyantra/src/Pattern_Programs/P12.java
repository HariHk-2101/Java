package Pattern_Programs;

import java.util.Scanner;

public class P12 {

public static void main(String[] args) {
		/*
		   1
		   2 2
		   3 3 3
		 */
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Row size..");
		
		int row=sc.nextInt();
		
		
		for(int i=1;i<=row;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		}
	}
}
