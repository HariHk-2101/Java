package _28_02_23;

import java.util.Scanner;

public class AssignString {
      
	public static void main(String[] args)
	{
		
		//oneInput();
		
	    twoInputs();
	}
	
	   public static void oneInput()
	   
	   {
		   
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The String...");
		
		String s=sc.next();
		
		System.out.println("======Converting Into UpperCase======");
		
		System.out.println(s.toUpperCase());
		
		System.out.println("=======Converting Into LowerCase======");
		
		System.out.println(s.toLowerCase());
		
		
		String s1="TEST YANTRA";
		
        System.out.println("=======Converting Into LowerCase======");
		
		System.out.println(s1.toLowerCase());
		
        System.out.println("=======Reading The Data From 3rd index in UserInput ======");
		
		System.out.println(s.charAt(3));
		
		String s2="Test Program";
		
        System.out.println("=======Fetching The Data At Index 5======");
		
		System.out.println(s2.charAt(5));
		
        System.out.println("=======Finding The Length Of User Input======");
		
		System.out.println(s.length());
		
		String s3="Programs";
		
		System.out.println("=======Finding The Length Of Programs======");
		
		System.out.println(s3.length());
		
        System.out.println("=======Fectching Substring For User Input======");
		
		System.out.println(s.substring(3));
		
		String s4="Yantra";
        System.out.println("=======Fectching Substring For Yantra======");
		
		System.out.println(s4.substring(1));
		
		String s5="Bangalore";
		
		System.out.println("Checking When The 'gal' is present or Not In Bangalore");
		
		System.out.println(s5.contains("gal"));
		
		String s6="Java Programs";
		
        System.out.println("By using endsWith()");
		
		System.out.println(s6.endsWith("Programs"));
		
		String s7="Harison";
		
		System.out.println("Checking When The Given String Empty Or Not");
		
		System.out.println(s7.isEmpty());
		
	}
	   
	   public static void twoInputs()
	   {
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.println("Enter The 1st String...");
		   
		   String s=sc.nextLine();
		   
		   System.out.println("Enter The 2nd String...");
		   
		   String s1=sc.nextLine();
		   
		   System.out.println("=====Comparing 2 Strings=========");
		   
		   System.out.println(s.compareTo(s1));
		   
		   System.out.println("=====Comparing 2 Strings By Using CompareToIgnoreCase=========");
		   
		   System.out.println(s.compareToIgnoreCase(s1));
		   
		   System.out.println("Adding 2 Strings By using Concat()");
		   
		   System.out.println(s.concat(s1));
		   
		   System.out.println("Comparing 2 Strings By Using Equals Method..");
		   
		   System.out.println(s.equals(s1));
		   
		   
	   }
}
