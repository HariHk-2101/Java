package Strings;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter The String...");
	
	String s=sc.next();
	
	
	String rev="";
	
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	
	
	
	if(rev.equals(s))
	{
		System.out.println("Given String Is palindrome..");
	}
	else
	{
		System.out.println("Given String Is Not palindrome..");
	}
	}
	
}
