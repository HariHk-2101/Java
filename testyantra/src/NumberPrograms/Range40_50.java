package NumberPrograms;

import java.util.Scanner;

public class Range40_50 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number1...");
		int num1=sc.nextInt();
		System.out.println("Enter The Number 2...");
		int num2=sc.nextInt();
		
		int sum=0;
		
		for(int i=num1 ;i<=num2 ;i++)
		{
			int value =i;
			
			boolean check=true;
			
			for(int j=2 ; j<value;j++)
			{
				if(value%j==0)
				{
					check=false;
				}
			}
			
			if(check==true)
			{
				sum=sum+value;
			}
			
		}
		
		System.out.println("Sum of prime numbers Given range "+num1+" to "+num2+" is "+sum);
}
}
