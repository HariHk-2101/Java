package Strings;

import java.util.Scanner;

public class UpperAndLower {

public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The String...");
		
		String s=sc.next();
		
		String s1=s.substring(0,(s.length()/2));
		
		String lc=s1;
		
        String s2=s.substring(s.length()/2);
		
		String uc=s2;
		
		System.out.print(lc.toLowerCase());
		
		System.out.println(uc.toUpperCase());
		
		}
		
		
		
}

