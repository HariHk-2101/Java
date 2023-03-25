package Pattern_Programs;

import java.util.Scanner;

public class P13 {
 
	/*
	   1
	   2 3
	   4 5 6
	   
	 */
        public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Row size..");
		
		int row=sc.nextInt();
		
		int temp=1;
		for(int i=1;i<=row;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print(temp++ + " ");
		}
		System.out.println();
		}
	}
}
