package _04_03_23;

import java.util.Scanner;

public class CountTheString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The String...");
		
		String s=sc.nextLine();
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			count++;
		}
		System.out.println(count);
	}
}
