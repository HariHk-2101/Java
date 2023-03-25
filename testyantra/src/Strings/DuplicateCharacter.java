package Strings;

import java.util.Scanner;

public class DuplicateCharacter {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first String...");
		
		String s1=sc.nextLine();
		
//		char ch[]=s1.toCharArray();
//		
//		String s2="";
//		boolean flag=false;
//		for(int i=0;i<s1.length();i++)
//		{
//			if(s2.indexOf(ch[i])== -1)
//		    {
//			    for(int j=i+1;j<s1.length();j++)
//		     	{
//			 
//			      if(ch[i]==ch[j])
//			       {
//		            	flag=true;
//			            System.out.println("Duplicate character is "+ch[i]);
//			            s2+=ch[i];
//			            break;
//			       }
//			      
//			    }
//
//		    }
//		}
//		
//		if(flag==false)
//		{
//			System.out.println("There Is no Duplicate Character In "+s1);
//		}
//		
		
		
		
		boolean [] seen=new boolean[256];
		
		for(int i=0;i<s1.length();i++)
			{
			char ch=s1.charAt(i);
			
			if(seen[ch])
			{
				System.out.println(ch);
			}
			else
			{
				seen[ch]=true;
			}
         	}
	
		
	}
		
		
	
}
