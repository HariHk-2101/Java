package NumberPrograms;

import java.util.Scanner;

public class Nth_Fibi {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number1...");
		int num1=sc.nextInt();
		
		int value1=0;
		int value2=1;
		int value3=0;
		
		for(int i=1;i<=num1;i++)
		{
			if(i==num1)
			{
				System.out.println(value1);
			}
			
		   value3=value1+value2;
		   value1=value2;
		   value2=value3;
		}
		
		
	}
}
