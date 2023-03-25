package Strings;

import java.util.Scanner;

public class Emailvalidation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Your mail Id....");
		
	    String email=sc.nextLine();
	    
	    boolean flag=false;
	    
	   if(email.contains("@"))
	   {
		   String s1[]=email.split("@");
		   
		  
		   String user=s1[0];
		   String domain="";
		   char ch='.';
		   
				   
		   for(int i=s1.length-1;i>0;i--)
		   {
			   domain=s1[i];
		   }
	
		    char [] dom=domain.toCharArray();
		    
		    System.out.println(dom[0]);
		    
		    if(dom[0]!=ch)
		    {
		    	
		     
		    if(user!=" " && domain!=" ")
		    {
		    	
		    	System.out.println(email);
		       if(ch<=1&&domain.contains("."))
				{
		    	   System.out.println(email);
				   if(domain.endsWith(".com") || domain.endsWith(".in")|| domain.endsWith(".org"))
				   {
					   System.out.println("Your Email Id Is "+email);
				   }
				   else
				   {
					   System.out.println("Incorrect Mail Give Correct Domain...");
				   }
		       }
		    
		       else
		       {
		    	   
		       }
		    }
	     else
	      {
		   System.out.println("Incorrect Mail Give Correct Domain...");
	      }
	  }
     else
	   {
		  System.out.println("Incorrect Mail Give Correct Domain...");
	   }  
   }	    
	else
	 {
		  System.out.println("Incorrect Mail Give Correct Domain...");
     }  
	   
  
   }

}

