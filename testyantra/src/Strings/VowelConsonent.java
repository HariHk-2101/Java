package Strings;

import java.util.Scanner;

public class VowelConsonent {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The String...");
		
		String s=sc.next();
		
		int count =0;
		int count1=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
			else
			{
				count1++;
			}
		}
		System.out.println("number Of vowels is "+count);
		System.out.println("number Of consonent is "+count1);
	}
}
