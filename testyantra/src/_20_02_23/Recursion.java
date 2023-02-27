package _20_02_23;

import java.util.Scanner;

public class Recursion {
	
	
	public static void happy(int count)
	{
		if(count<1)
		{
			return;
		}
		else
		{
			System.out.println("Happy Birthday...");
			happy(count-1);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter The Count...");
		int num=sc.nextInt();
		happy(num);
	}
}
