package Strings;

import java.util.Scanner;

public class GenerateNewString {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter The String...");
	
	String s=sc.next();
	
	
	
	
	for(int i=0;i<s.length();i++)
	{
		if(i%2==0)
		{
		  char c=s.charAt(i);
		  
		  int n=(int)c-32;
		  
		  char c1=(char) n;
		  System.out.println(c1+" ");
		}
		else
		{
			
			System.out.println(s.charAt(i)+" ");
	
		}
	}
	
	
	
	}
}
