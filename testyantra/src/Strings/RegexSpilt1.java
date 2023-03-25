package Strings;

import java.util.Arrays;

public class RegexSpilt1 {


	public static void main(String[] args) 
	{
	 String s="Good Mrng Test Yantra";
	 String []s1=s.split("");
	 
	 System.out.println(Arrays.toString(s1));
	 
	   for (int i = 0; i < s1.length; i++) 
	  {
  		System.out.println(s1[i]);
	  }
	
	}
}
