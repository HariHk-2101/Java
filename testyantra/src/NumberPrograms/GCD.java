package NumberPrograms;

import java.util.Scanner;

public class GCD {
public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter The 1st value...");
		
		 int num=sc.nextInt();
		
	     System.out.println("Enter The 2nd Value...");
	     
	     int num1=sc.nextInt();
	     
		int gcd=1;
		
		for(int i=1 ;i<=num && i<=num1;i++)
		{
			if(num%i==0 && num1%i==0) {
				
				gcd=i;
				
			}
		}
		
		System.out.println("Given Numbers "+num+ " & "+num1+" GCD is "+gcd);
		}
}
