package _14_02_23;

import java.util.Scanner;

public class P13 {
 
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
