package Strings;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 
//		 System.out.println("Enter The String..");
//		 String s=sc.nextLine();
//		 
//		 String []s1=s.split(" ");
//		 
//		 int count=0;
//		 
//		 System.out.println("With Split Method..");
//		 for(int i=0;i<s1.length;i++)
//		 {
//			 count++;
//		 }
//		 System.out.println(count+" Words Is Present In Given String");
//		 
		 System.out.println();
		 System.out.println("With Out Split Method...");
		 
		 System.out.println("Enter The string..");
		 String s2=sc.nextLine();
		 
		 int count1=1;
		
		 for(int i=0;i<s2.length()-1;i++)
		 {
			
			 
			 if(s2.charAt(i)==' ' && (s2.charAt(i+1)!=' '))
			 {
				 count1++;
			 }
		 }
		 System.out.println(count1);
		 
		 
	}
}
