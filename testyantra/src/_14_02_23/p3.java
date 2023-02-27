package _14_02_23;

import java.util.Scanner;

public class p3 {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Range..");
		
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(i%2==1)
			{
				System.out.print("0"+" ");
			}
			else 
			{
				System.out.print("1"+" ");
			}
		}
	}
}

