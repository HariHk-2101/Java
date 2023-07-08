package String_own_Logics;

import java.util.ArrayList;
import java.util.Arrays;

public class String_Mul {

	public static void main(String[] args) {
		
		String s="1234";
		String s1="2000000000000000000";
		
		int rev=0;
		
		for(int i=s.length()-1;i>=0;i--)
		{
			int n=s.charAt(i)-48;
			
			rev=rev*10+n;
		}
	  System.out.println(rev);
	}
}
