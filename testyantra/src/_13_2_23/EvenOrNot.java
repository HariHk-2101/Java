package _13_2_23;

import java.util.Scanner;

public class EvenOrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number1...");
		int num1=sc.nextInt();
		
		int temp=num1;
		
		int rev=0;
		while(num1!=0)
		{
			int rem=num1%10;
			rev=rev*10+rem;
			num1=num1/10;
		}
		
		if(rev%2==0)
		{
			System.out.println("Given Number "+temp+" Start with Even Number...");
		}
		
		else
		{
			System.out.println("Given Number "+temp+" doesn't Start with Even Number...");
		}
		
		}
	}

