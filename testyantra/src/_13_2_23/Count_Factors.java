package _13_2_23;

import java.util.Scanner;

public class Count_Factors {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number..");
		int num= sc.nextInt();
		int count=0;
		
		for(int i=2 ;i<=num ;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
		System.out.println("Number Of Factors are "+count);
	}
}
