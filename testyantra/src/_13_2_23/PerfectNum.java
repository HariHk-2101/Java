package _13_2_23;

import java.util.Scanner;

public class PerfectNum {

public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter The Number...");
		
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		for(int i=1 ;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(sum==temp)
		{
		System.out.println("Given num "+temp+" is a perfect num ");
		}
		
		else
		{
			System.out.println("Given num " +temp+ " is Not a perfect num");
		}
	}

}

