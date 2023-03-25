package Strings;

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The String...");
		
		String s=sc.nextLine();
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			int ch=s.charAt(i);
			
			if(ch%2==0)
			{
				count++;
				System.out.println(c+ " ASCII Value IS "+ch);
			}
		}
		System.out.println(count+ " characters are present with even ascii Values..");
	}
}
