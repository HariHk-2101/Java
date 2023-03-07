package _06_03_23;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramProgram {

	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 
	 String s=sc.next();
	 String s1=sc.next();
	 
	 System.out.println(is_Anagram(s ,s1));
		
	}
	
	public static boolean is_Anagram(String s ,String s1) 
	{
		
	 if(s.length()!=s1.length())
	 {
		 return false;
	 }
	 else
	 {
		
		 char c[]=s.toCharArray();
		 char c1[]=s1.toCharArray();
		 
		 Arrays.sort(c);
		 Arrays.sort(c1);
		 
		 for(int i=0;i<c1.length;i++)
		 {
			 if(c[i]!=c1[i])
			 {
				 return false;
			 }
		 }
		 
	 }
		return true;
	}
}
