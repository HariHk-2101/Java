package _07_03_23;

import java.util.Scanner;

public class SplitArrayPrint {
     public static void main(String[] args) {
		
	
	 Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first String...");
		
		String s1=sc.nextLine();
		
		String spl[]=s1.split(" ");
		
		for (int i = 0; i < spl.length; i++) {
			
			System.out.println(spl[i]);
		}
     }
}
