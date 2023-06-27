package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramOrNot {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first String...");
		
		String s1=sc.next().toLowerCase();
		
		System.out.println("Enter The Second String..");
		
		String s2=sc.next().toLowerCase();
		
		
		char [] ch1=s1.toCharArray();
		char [] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		boolean flag=false;
		
		if(ch1.length!=ch2.length)
		{
			System.out.println(s1+" & "+s2+ " is Not A Anagram...");
		}
		else
		{
		for(int i=0;i<ch1.length;i++)
		{
			
			if(ch1[i]!=ch2[i])
			{
				flag=true;
				break;
			}
	
		}
		
		if(flag==false)
		{
			System.out.println(s1+" & "+s2+ " is A Anagram...");
		}
		else
		{
			System.out.println(s1+" & "+s2+ " is Not A Anagram...");
		}
		}
		
		
		
		
		
	}
}
