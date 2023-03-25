package Method_Recursion;

import java.util.Scanner;

public class Reverse_Method_Rec {

	//Reverse Number
	static int sum=0;
	public static int reverse(int num) {
		
		
		if(num<=0) 
		{
			return sum;
		}
		else
		{
//		
			int rev=num%10;
			sum=sum*10+rev;
			num/=10; 
			
			return reverse(num);
		
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number...");
		
		int num=sc.nextInt();
		
		System.out.println("After Reverse The Number:"+reverse(num));
	}
}
