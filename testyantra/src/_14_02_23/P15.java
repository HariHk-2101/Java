package _14_02_23;

import java.util.Scanner;

public class P15 {
        public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Row size..");
		
		int row=sc.nextInt();
		
		
		for(int i=1;i<=row;i++)
		{
		for(int j=1;j<=i;j++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
			else
			{
				System.out.print("5 ");
			}
		}
		System.out.println();
		}
	}
}
