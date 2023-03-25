package Pattern_Programs;

import java.util.Scanner;

public class P1 {

	//Print Start ******
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Range..");
		
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			System.out.print("*");
		}
	}
}
