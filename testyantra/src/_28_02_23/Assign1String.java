package _28_02_23;

import java.util.Scanner;

public class Assign1String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The 1st String...");
		
		String s1=sc.nextLine();
		
		System.out.println("Enter The 2nd String...");
		
		String s2=sc.nextLine();
		
		System.out.println("Comparing 2 Strings By Using == operator...");
		
		System.out.println(s1==s2);
		
		System.out.println("Comparing 2 Strings By Using equals()");
		
		System.out.println(s1.equals(s2));
		
		System.out.println("Comparing 2 Strings By Using CompareTo()");
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println("Comparing 2 Strings By Using equalsIgnoreCase...");
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
	}
}
