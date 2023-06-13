package Strings;

import java.util.Scanner;

public class FrequencyOfSubStringss {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the first String...");
			
			String s1=sc.nextLine();
			
			String s2="";  
			
			String []spl=s1.split(" ");
			
			boolean flag=false;
			 
			for(int i=0;i<spl.length;i++)
			{
				
				if(s2.indexOf(spl[i])== -1)
			    {
				    for(int j=i+1;j<spl.length;j++)
			     	{
				 
				    	System.out.println(spl[i]);
				      if(spl[i]==spl[j])
				       {
			            	flag=true;
				            System.out.println("Frequency Sub string is "+spl[j]);
				            s2+=spl[i];
				           
				       }
				      
				    }
			    
			    }
				
				
			}
			
			if(flag==false)
			{
				System.out.println("There Is No frequency Sub Strings..");
			}
			
		 
			
	}
}
