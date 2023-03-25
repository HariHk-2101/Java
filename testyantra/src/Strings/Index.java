package Strings;

import java.util.Scanner;

public class Index {

public static void main(String[] args) {
	
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The String...");
		
		String s=sc.next();
		System.out.println(s.charAt(0) +","+s.charAt(s.length()-1));
}

}