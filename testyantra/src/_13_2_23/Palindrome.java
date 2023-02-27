package _13_2_23;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Number...");
		int num=sc.nextInt();
		int rev=0;
		int temp=num;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		
		if(temp==rev)
		{
			System.out.println("Given Number "+temp+" is Palindrome Number");
		}
		else
		{
			System.out.println("Given Number "+temp+" is Not a Palindrome Number");
		}
	}
}
