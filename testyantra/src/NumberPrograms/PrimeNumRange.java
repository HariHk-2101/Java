package NumberPrograms;

import java.util.Scanner;

public class PrimeNumRange {

	public static void main(String[] args) {
      
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number1...");
		int num1=sc.nextInt();
		System.out.println("Enter The Number 2...");
		int num2=sc.nextInt();
		
		
		
		for(int i=num1;i<=num2 ;i++)
		{
	         
			
			boolean check=true;
			
			for(int j=2 ; j<i;j++)
			{
				if(i%j==0)
				{
					check=false;
				}
			}
			
			if(check==true)
			{
				System.out.println(i+" Is Prime Number");
			}
		}
	
		
		
		

	}

}
