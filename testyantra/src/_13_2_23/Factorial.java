package _13_2_23;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Number...");
		
		int num=sc.nextInt();
		
		int fact=1;
		
		for(int i=1 ; i<=num;i++)
		{
			fact*=i;
		}  
		System.out.println("Given Number " +num+ " Factorial is "+fact);
	}
}
