package _20_02_23;

import java.util.Scanner;

public class P12 {

	//power
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The N Value..");
		
		int n=sc.nextInt();
		
		System.out.println("Enter The P value..");
		
		int p=sc.nextInt();
		
		System.out.println(power(p,n));
	}

	public static int power(int p,int n) {
		
		if(p==0)
		{
			return 1;
		}
		else
		{
			return n*power(p-1 ,n);
		}
	
	}
}
