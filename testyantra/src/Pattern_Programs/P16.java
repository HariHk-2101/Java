package Pattern_Programs;

import java.util.Scanner;

public class P16 {

	/*
	    A
	    A B
	    A B C
	    
	 */
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Row size..");
		
		int row=sc.nextInt();
		
		
		for(int i=1;i<=row;i++)
		{
			char ch='A';
		for(int j=1;j<=i;j++)
		{
			System.out.print(ch+" ");
			ch++;
		}
		
		System.out.println();
		}
	}
}
