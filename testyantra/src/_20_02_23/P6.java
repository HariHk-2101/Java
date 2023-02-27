package _20_02_23;

import java.util.Scanner;

public class P6 {
	
	//Sum Of Natural Number By Using Scanner Class
	public static int sum(int num)
	{
		if(num<=1)
		{
			return num;
		}
		else 
		{
			return (num+sum(num-1));
		}
	}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number....");
		int num=sc.nextInt();
		
		System.out.println("The sum of Natural Number "+sum(num));
	}
}
