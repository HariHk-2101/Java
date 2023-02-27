package _13_2_23;

import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter The Number...");
		
		int num=sc.nextInt();
		int temp=num;
		
		int sum=0;
		
		for(int i=1 ;i<=num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}

		}
		
		System.out.println("Given num "+temp+" product are "+sum);
	}

}
