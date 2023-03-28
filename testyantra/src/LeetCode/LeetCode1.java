package LeetCode;

import java.util.Scanner;

public class LeetCode1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Input..");
		
		String s=sc.next();
		
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
		for(int i=0;i<rev.length();i++)
		{
			char ch=rev.charAt(i);
			
			
			if(ch>='a'&&ch<='z')
			{
				System.out.print(++ch);
			}
				
		}
		
		
		
				
	}
}
