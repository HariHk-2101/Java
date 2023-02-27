 package _20_02_23;

import java.util.Scanner;

public class P8 {

	//Fibinacci Number
	
	public static int fibi(int num)
	{
		if(num<=1) 
		{
			return num;
		}
		else
		{
			
			return fibi(num-1)+fibi(num-2);
			
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number...");
		
		int num=sc.nextInt();
		
		System.out.println(fibi(num));
		
		for(int i=0;i< num;i++)
		{
			System.out.println(fibi(i));
		}
		
	}
}
