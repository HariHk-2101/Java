package _28_02_23;

import java.util.Scanner;

public class Assign2String {

	public static void main(String[] args) {
		user();
//		rainbow();
//		normal();
		
		
	}
		public static void user()
		{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The String...");
		
		String s=sc.nextLine();
		
        System.out.println("======Converting Into UpperCase======");
		
		System.out.println(s.toUpperCase());
		
		System.out.println("======After Reversing The String=====");
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
		System.out.println("========Concatinate with 2 Strings=======");
		
		System.out.println("Enter The First String...");
		String s1=sc.nextLine();
		System.out.println("Enter The First String...");
		String s2=sc.nextLine();
		System.out.println(s1.concat(s2));
		
	    System.out.println("=======Finding String Length=======");
	    	System.out.println(s.length());
	   }
		
		public static void rainbow(){
			String v="Violet";
			String i="Indigo";
			String b="Blue";
			String g="Green";
			String y="Yellow";
			String o="Orange";
			String r="red";
			
			System.out.println(v.charAt(0));
			System.out.println(i.charAt(0));
			System.out.println(b.charAt(0));
			System.out.println(g.charAt(0));
			System.out.println(y.charAt(0));
			System.out.println(o.charAt(0));
			System.out.println(r.charAt(0));
		}
		
		public static void normal()
		{
			String t="TestYantra";
			
			System.out.println("=========Part Of String..==========");
			
			System.out.println(t.substring(2,7));
			
			String s=" Test Yantra";
			
			System.out.println("=========Space Removing..==========");
			
			System.out.println(s.trim());
			
		    System.out.println("======Converting Into LowerCase======");
			
			System.out.println(t.toLowerCase());
			
			System.out.println("========Seperating Words...========");
			String s1="Test Yantra";
		
			String[]st=s1.split(" ");
			
			for(int i=0;i<st.length;i++)
			{
				System.out.println(st[i]);
			}
			
		
			
			
		}
}
