package Pattern_Programs;

import java.util.Scanner;

public class P10 {

	/*  *
	    * *
	    * * *
	 */
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Row size..");
		
		int row=sc.nextInt();//4
	
		
		for(int i=1;i<=row;i++)
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
		}
	}
}
