package _13_2_23;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Number...");
		
		int num=sc.nextInt();
		int temp=num;
		int temp1=num;
		
		int sum=0;
		int count=0;
		
		while(num>0)
		{
			count++;   
			num=num/10;
		}
		
		while(temp>0)
		{
			int rem=temp%10; 
			int prod=1;
			
			for(int i=1 ;i<=count;i++)
			{
				prod=prod*rem; 
			}
				sum=sum+prod;
				temp=temp/10;
		}
		
		
		if(sum==temp1)
		{
           System.out.println("Given  Number "+temp1+" is a Arm Strong Number..");
		}
		else
		{
			System.out.println("Given  Number "+temp1+" is Not A Auto morphic Number..");
		}
	}
}
