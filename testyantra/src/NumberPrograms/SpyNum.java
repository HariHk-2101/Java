  package NumberPrograms;

import java.util.Scanner;

public class SpyNum {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the num...");
		
		int num=sc.nextInt();
		int temp=num;
		
		int sum=0;
		int prod=1;
		
		 while(num>0)
		 {
			
			int rem = num%10;
			
			sum=rem+sum;
			prod=prod*rem;
			
			num=num/10;
		
	   	}
			if(sum==prod) {
				System.out.println("Given num "+temp+" is Spynumber...");
			}
			
			else
			{
				System.out.println("Given num "+temp+" is Not A Spynumber...");
			}
	}

}
