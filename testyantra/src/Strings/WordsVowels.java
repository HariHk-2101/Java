package Strings;

import java.util.Scanner;

public class WordsVowels {
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The String...");
		
		String s=sc.nextLine();
	     
		
		
		
	   int count =0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			
			if(i==0 && ch!=' ' || s.charAt(i)!=' ' && s.charAt(i-1)==' ')
			{
			
			
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				count++;
			}
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
			}
			
		}
			
	}
		System.out.println(count+" ");
	}
}
