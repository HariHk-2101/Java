package Pattern_Programs;

import java.util.Scanner;

public class P19 {

	/*
	    Z
	    Y X
	    W V U
	    
	 */
	 public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter The Row size..");
			
			int row=sc.nextInt();
			
			char ch='Z';
			for(int i=1;i<=row;i++)
			{
				
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				--ch;
			}
			 
			
			System.out.println();
			}
		}
}
