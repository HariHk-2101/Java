package _13_2_23;

import java.util.Scanner;

public class Multi_Table {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Number1...");
		int num1=sc.nextInt();
		System.out.println("Enter The Number 2...");
		int num2=sc.nextInt();
		
		int count=num1;
		
		for(int i=num1 ;i<=num2 ; i++)
		{
			int value=i;
			
			System.out.println(count++ +" Multiplication Table...");
			for(int j=1;j<=10;j++)
			{
			
				int multi=value*j;
				
				System.out.println(value+"*"+j+"="+multi);
			}
			
			System.out.println();
			
		}
		
	}

}
