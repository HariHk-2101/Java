package _13_2_23;

import java.util.Scanner;

public class AutoMorphie {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number.....");
		
		int num=sc.nextInt();
		
		int temp=num;
		
		int sq=num*num;
		
		boolean check=true;
		
		while(num>0) {
			
			if(num%10==sq%10)
			{
			num=num/10;
			sq=sq/10;
		   }
			else {
				check=false;
				break;
			}
	
	  }
		if(check)
		{
			System.out.println("Given  Number "+temp+" Auto morphic Number..");
		}
		
		else
		{
			System.out.println("Given  Number "+temp+" Not Auto morphic Number..");
		}
	
}
}
