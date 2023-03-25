package NumberPrograms;

import java.util.Scanner;

public class Perfactsquare {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The number...");
		
		int num=sc.nextInt();
		
		boolean check=false;
		
		for(int i=1;i<=num;i++)
		{
			if(i*i==num)
			{
				check=true;
				break;
			}
		}
		
		if(check)
		{
			 System.out.println("Given  Number "+num+" is Perfect Square NUmber");
		}
		else
		{
			System.out.println("Given  Number "+num+" is Not A perfect Squre Number..");
		}
	}
}
