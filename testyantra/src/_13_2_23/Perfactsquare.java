package _13_2_23;

import java.util.Scanner;

public class Perfactsquare {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The number...");
		
		int num=sc.nextInt();
		boolean check=false;
		int i=1;
		for(i=1;i<=num;i++)
		{
			if(i*i==num)
			{
				check=true;
				break;
			}
		}
		
		if(check)
		{
			 System.out.println("Given  Number "+num+" is ");
		}
		else
		{
			System.out.println("Given  Number "+num+" is Not A square Root Number..");
		}
	}
}
