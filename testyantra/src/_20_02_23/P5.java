package _20_02_23;

import java.util.Scanner;

public class P5 {

	//Factors 
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Number...");
		
		int num=sc.nextInt();
		
		System.out.println(fact(num));
	}

	public static int fact(int num) {
		
		if(num<=1)
		{
			return num;
		}
		else
		{
			return (num*fact(num-1));
		}
		
		
	}
}
