package LeetCode;

import java.util.Scanner;

public class LeetCode4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter The String...");
	
	String s=sc.nextLine();
	
   String visited="";
	for(int i=0;i<s.length();i++)
	{
		char ch=s.charAt(i);
					
	  if( visited.indexOf(ch) == -1)
	  {
		  int count=1;

		 
		for(int j=i+1;j<s.length();j++)
		{
		
			if(s.charAt(i)==s.charAt(j))
			{
				count++;
			}
		
	   }
		 System.out.print(s.charAt(i)+""+count);
			visited+=ch;
	}
	 
	}
	
}
}

