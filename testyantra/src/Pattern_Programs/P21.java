package Pattern_Programs;

import java.util.Scanner;

public class P21 {
	/*
	   Z
	   Z Y
	   Z Y X
	   
	 */
	 public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter The Row size..");
			
			int row=sc.nextInt();
			
			
			for(int i=1;i<=row;i++)
			{
				char ch='Z';	
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch-- +" ");
				
			}
			
			
			System.out.println();
			}
		}
}
