package Strings;

import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter The String...");
	
	String s=sc.next();
	
	System.out.println("Last Four Character in The Given String : "+s.substring(s.length()-4));
}
}