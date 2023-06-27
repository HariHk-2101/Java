package NumberPrograms;

import java.util.Scanner;

public class Sum_Of_Prime_In_Range {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number1...");
		int num1=sc.nextInt();
		System.out.println("Enter The Number 2...");
		int num2=sc.nextInt();
		
		int sum=0;
		
		for(int i=num1 ;i<=num2 ;i++)
		{
			 int count=0;
			
			for(int j=1 ; j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			
			if(count==2)
			{
				sum=sum+i;
			}
			
		}
		
		System.out.println("Sum of prime numbers Given range "+num1+" to "+num2+" is "+sum);
}
}
