package Strings;


import java.util.Arrays;
import java.util.Scanner;

public class InItCase {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the first String...");
			
			String s1=sc.nextLine();
			
			String out="";
			
			String spl[]=s1.split("");
			
			System.out.println(Arrays.toString(spl));
		     
			
			for (int i=0;i<spl.length;i++) {
				
				if(i==0 && s1.charAt(i)!=' ' || s1.charAt(i)!=' ' && s1.charAt(i-1)==' ')
				{
			        out+=spl[i].toUpperCase();
			    }
				else
				{
					out+=spl[i].toLowerCase();
				}
			}
			System.out.println(out);
	}
}
