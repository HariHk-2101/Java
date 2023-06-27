package String_own_Logics;

import java.util.Arrays;



  class Reverse_The_Words {
	public static void main(String[] args) {

		String s="you are my hero";
		
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			if (i == 0 && s.charAt(i) != ' ' || s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
				count++;
			}
  
		}
		
		
		char ch[]=s.toCharArray();
		String str[]=new String[count];
		int j=0;
		
		String temp="";
		
		while(count>0) {
			
			System.out.println(j);
		for (int i=j ; i < ch.length ; i++) {
			
			if(ch[i]!=' ')
			{
			   temp=temp+ch[i];
			   j++;
			}
			else
			{
				
				break;
			}
			
		}
		for (int i=str.length-1 ; i >=0 ; i--) {
			  str[i]=temp;
		}
		  count--;
		}
		System.out.println(Arrays.toString(str));
		System.out.print(temp+" ");
	}
}
