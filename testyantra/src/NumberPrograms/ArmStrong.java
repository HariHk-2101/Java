package NumberPrograms;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Number...");
		
		int num=sc.nextInt();
	
		int temp1=num;
		
		int sum=0;
		int count=0;
		
		while(num>0)
		{
			count++;   
			num=num/10;
		}
		num=temp1;
		
		while(num>0)
		{
			int rem=num%10; 
			int prod=1;
			
			for(int i=0 ;i<count;i++)
			{
				prod=prod*rem; 
			}
				sum=sum+prod;
				num/=10;
		}
		
		
		if(sum==temp1)
		{
           System.out.println("Given  Number "+temp1+" is a Arm Strong Number..");
		}
		else
		{
			System.out.println("Given  Number "+temp1+" is Not A ArmStrong Number..");
		}
	}
}
