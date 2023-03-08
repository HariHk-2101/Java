package _08_03_23;

import java.util.Scanner;

public class WithOutUsingLengthMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The String....");
		
		String s=sc.nextLine();
		
		int count=0;
		
		char[]ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			count++;
		}
		
		System.out.println(count);
		
	}
}
