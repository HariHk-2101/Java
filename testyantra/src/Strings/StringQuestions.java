package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class StringQuestions {

	public static void main(String[] args) {
		
//	index();
//		seperated();
//		contains();
//		Compare();
//		rev();
//		palindrome();
		even();
//		length();
//		 sum();
//		print();
//		spaces();
//		UpperCase();
//		LC_SC();
	}
	
	public static void index() {
		
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The String...");
		
		String s=sc.next();
		
		System.out.println(s.charAt(3));
		
		
	}
	
	public static void seperated() {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The String...");
		
		String s=sc.next();
		
		System.out.println(s.charAt(0)+","+s.charAt(s.length()-1));
      }
     public static void contains() {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The String...");
		
		String s=sc.next();
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch=='a')
			{
				System.out.println(" 'a' character present in "+i+" index");
			}
		}
     }
     
     public static void Compare() {
 		
 		
 		Scanner sc=new Scanner(System.in);
 		
 		System.out.println("Enter The 1st String...");
 		
 		String s=sc.next();
 		
        System.out.println("Enter The 2st String...");
 		
 		String s1=sc.next();
 		
 		
 		
 		
 		if(s.equals(s1))
 		{
 			System.out.println("String1 :"+s+"\nString2 :"+s1+"\n2 Strings Are same");
 		}
 		else
 		{
 			System.out.println("String1 :"+s+"\nString2 :"+s1+"\n2 Strings Are Not same");
 		}
     }
 		
 		 public static void rev() {
 	 		
 	 		
 	 		Scanner sc=new Scanner(System.in);
 	 		
 	 		System.out.println("Enter The 1st String...");
 	 		
 	 		String s=sc.next();
 	 		System.out.println("Before Reverse The String: "+s);
 	 		
 	 		String rev="";
 			
 			for(int i=s.length()-1;i>=0;i--)
 			{
 				rev=rev+s.charAt(i);
 			}
 			System.out.println("After Reverse The String: "+rev);
 		}
 	 		
 		 public static void palindrome() {
  	 		
  	 		
  	 		Scanner sc=new Scanner(System.in);
  	 		
  	 		System.out.println("Enter The 1st String...");
  	 		
  	 		String s=sc.next();
  	 		
  	 		
  	 		String rev="";
  			
  			for(int i=s.length()-1;i>=0;i--)
  			{
  				rev=rev+s.charAt(i);
  			}
  		
  			if(s.equals(rev))
  			{
  				System.out.println("True");
  			}
  			else
  			{
  				System.out.println("false");
  			}
  		}
 		 
 		 public static void even() {
   	 		
   	 		
   	 		Scanner sc=new Scanner(System.in);
   	 		
   	 		System.out.println("Enter The 1st String...");
   	 		
   	 		String s=sc.nextLine();
   	 		
   	 		for(int i=0;i<s.length();i++)
   	 		{
   	 			char ch=s.charAt(i);
   	 			 
   	 			
   	 			if(i%2==0)
   	 			{
   	 				
   	 				
   	 				System.out.print(ch+" Even index Charcaters");
   	 				
   	 				
   	 			}
   	 			else
   	 			{
   	 				System.out.println(ch+" Odd Index Characters");
   	 			}
   	 		}
 		
 		 }
 		 
 		 public static void length() {
    	 		
    	 		
    	 		Scanner sc=new Scanner(System.in);
    	 		
    	 		System.out.println("Enter The 1st String...");
    	 		
    	 		String s=sc.next();
    	 		
    	 		
    	 		System.out.println("The Given User input Length is "+s.length());
 		 }
 		 
 		 
 		 public static void sum() {
 	 		
 	 		
 	 		Scanner sc=new Scanner(System.in);
 	 		
 	 		System.out.println("Enter The 1st String...");
 	 		
 	 		String s=sc.next();
 	 		
            System.out.println("Enter The 2st String...");
 	 		
 	 		String s1=sc.next();

 	 		
 	 		
 	 		System.out.println("The Summestion Of 2 Strings Is "+(s.length()+s1.length()));
		 }
 		 
 		     public static void print() {
 	 		
 	 		
 	 		Scanner sc=new Scanner(System.in);
 	 		
 	 		System.out.println("Enter The 1st String...");
 	 		
 	 		String s=sc.next();
 	 		
 	 	      int count=1;
 	 	    System.out.println("The length of String is "+s.length());
 	 	
 	 	    for(int i=0;i<s.length();i++)
 	 		{
 	 			System.out.println("===================================");
 	 			System.out.println("Printing "+count++ +" : "+ s);
 	 		}
 		 }
 		 
 		    public static void spaces() {
 	 	 		
 	 	 		
 	 	 		Scanner sc=new Scanner(System.in);
 	 	 		
 	 	 		System.out.println("Enter The 1st String...");
 	 	 		
 	 	 		String s=sc.nextLine();
 	 	 		
 	 	 	      int count=0;
 	 	 	    System.out.println("The length of String is "+s.length());
 	 	 	
 	 	 	    for(int i=0;i<s.length();i++)
 	 	 		{
 	 	 	    	char ch=s.charAt(i);
 	 	 	    	
 	 	 	    	if(ch==' ')
 	 	 	    	{
 	 	 	    		count++;
 	 	 	    	}
 	 	 	    	
 	 	 	
 	 	 		}
 	 	 	    System.out.println("Count Of spaces is "+count);
 		    }
     
 		   public static void UpperCase() {
	 	 		
	 	 		
	 	 		Scanner sc=new Scanner(System.in);
	 	 		
	 	 		System.out.println("Enter The 1st String...");
	 	 		
	 	 		String s=sc.nextLine();
	 	 		
	 	 	      int count=0;
	 	 	    System.out.println("The length of String is "+s.length());
	 	 	
	 	 	    for(int i=0;i<s.length();i++)
	 	 		{
	 	 	    	char ch=s.charAt(i);
	 	 	    	
	 	 	    	if(ch>='A'&&ch<='Z')
	 	 	    	{
	 	 	    		count++;
	 	 	    	}
	 	 	    	
	 	 	
	 	 		}
	 	 	    System.out.println("Count Of UpperCases is "+count);
		    }
 		   
 		   
 		  public static void LC_SC() {
	 	 		
	 	 		
	 	 		Scanner sc=new Scanner(System.in);
	 	 		
	 	 		System.out.println("Enter The 1st String...");
	 	 		
	 	 		String s=sc.nextLine();
	 	 		
	 	 	      int count=0;
	 	 	      int count1=0;
	 	 	     
	 	 	      int countn=0;
	 	 	    System.out.println("The length of String is "+s.length());
	 	 	
	 	 	    for(int i=0;i<s.length();i++)
	 	 		{
	 	 	    	char ch=s.charAt(i);
	 	 	    	
	 	 	    	if(ch>'A'&&ch<='Z')
	 	 	    	{
	 	 	    	     continue;
	 	 	    	}
	 	 	    
	 	 	    	
	 	 	    
	 	 	    	else if(ch>='a'&&ch<='z')
	 	 	    	{
	 	 	    		count++;
	 	 	    	}
	 	 	    	else	
	 	 	    	{
	 	 	    		count1++;
	 	 	    	}
	 	 	    	
	 	 	    	
	 	 	
	 	 		}
	 	 	    System.out.println("Count Of LowerCases is "+count);
	 	 	  System.out.println("Count Of SpecialCharacter is "+count1);
		    }
 		  
 		  
 		        public static void WithOutInBuilt() {
	 	 		
	 	 		
	 	 		Scanner sc=new Scanner(System.in);
	 	 		
	 	 		System.out.println("Enter The 1st String...");
	 	 		
	 	 		String s=sc.nextLine();
	 	 		
	 	 		
	 	 		for(int i=0;i<s.length();i++)
	 	 		{
	 	 			
	 	 			
	 	 		}
	 	 		
 		 }
	 	 		
    
		
}
