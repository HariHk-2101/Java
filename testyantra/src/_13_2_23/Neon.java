package _13_2_23;

import java.util.Scanner;

public class Neon {

	public static void main(String[] args) {
		
	
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter The Number...");
	
	int num=sc.nextInt();
	int sq=num*num;
	
	int sum=0;
	
	while(sq>0)
	{
	   int rem =sq%10;
		
	   sum=sum+rem;
		
	   sq=sq/10;
	}
	
	if(sum==num)
	{
		System.out.println("Given num "+num+" is Neon number...");
	}
	else {
		System.out.println("Given num "+num+" is Not A Neon number...");
	}
	
}
}