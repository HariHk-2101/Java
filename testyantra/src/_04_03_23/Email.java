package _04_03_23;


import java.util.Arrays;
import java.util.Scanner;

public class Email {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Your mail....");
		
	    String email=sc.nextLine();
	    
	    boolean flag=false;
	    
	   
	    
	   
	    
//	   for (int i = 0; i < email.length(); i++) 
//	   
//	   {  
//		   
//		   if( email.charAt(0)>='a' && email.charAt(0)<='z')
//		   {
//			
//		     if (email.contains("@") && email.endsWith(".com") ||email.endsWith(".in")||email.endsWith(".org"))
//		     {
//			    flag=true; 
//		     }
//		     
//	      }
//	   }
//	   
//	   if(flag==true)
//	   {
//		   System.out.println("Your Mail is "+email);
//	   }
//	   else
//	   {
//		   System.out.println("Error .....Give Correct Input..");
//	   }
	    
	    
	   
	
	   
	   
	   
	  
	 
	   if(email.contains("@"))
	   {  
		   String s1[]=email.split("@");
		   
		   if( email.charAt(0)>='a' && email.charAt(0)<='z')
			   {
				
			     if (email.endsWith(".com") ||email.endsWith(".in")||email.endsWith(".org"))
			     {
			    	 System.out.println("Your Email is "+email);
			     }
			     else
			     {
			    	 System.out.println("Email is Not Valid");
			     }
		  
	           }
	       else
	      {
		   System.out.println("Email is Not Valid");
	   }
		   
		   System.out.println(Arrays.toString(s1));

	 }
	   else
	      {
		   System.out.println("Email is Not Valid");
	   }
	   
	   
	}
}
