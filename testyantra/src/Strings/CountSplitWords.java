package Strings;

import java.util.Scanner;

public class CountSplitWords {

	public static void main(String[] args) {
		
		
		 Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the first String...");
			
			String s1=sc.nextLine();
			
			String spl[]=s1.split(" ");
			
			int count=0;
			
			
			for (int i = 0; i < spl.length; i++) {
				
			count++;
			
			}
			
			System.out.println(count +" Elements In present In Array");
	}
}
