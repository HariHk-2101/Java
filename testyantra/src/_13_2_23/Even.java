package _13_2_23;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number1...");
		int num1=sc.nextInt();
		
		int temp=num1;
		
		while(num1>9)
		{
			num1=num1/10;
		}
		if(num1%2==0)
			{
				System.out.println("Given Number "+temp+" Start with Even Number...");
			}
			
			else
			{
				System.out.println("Given Number "+temp+" doesn't Start with Even Number...");
			}
	}

}
