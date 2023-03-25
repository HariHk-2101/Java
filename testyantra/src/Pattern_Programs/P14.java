package Pattern_Programs;

import java.util.Scanner;

public class P14 {
        public static void main(String[] args) {
		
        	/*
        	    1
        	    1 0
        	    1 0 1
        	    
        	 */
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Row size..");
		
		int row=sc.nextInt();
		
		
		for(int i=1;i<=row;i++)
		{
		for(int j=1;j<=i;j++)
		{
			if(j%2==0)
			{
				System.out.print("0 ");
			}
			else
			{
				System.out.print("1 ");
			}
		}
		System.out.println();
		}
	}
}
