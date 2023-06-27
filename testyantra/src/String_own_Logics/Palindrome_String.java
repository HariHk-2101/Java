package String_own_Logics;

public class Palindrome_String {

	public static void main(String[] args) {
		String s="madam";
		
		System.out.println("With Out Converting To Char");
		String s1="";
		for (int i = s.length()-1; i >= 0; i--) {
			
			s1+=s.charAt(i);
			
		}
		
		if(s.equals(s1))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		System.out.println();
		
		System.out.println("Converting To Char");
		char ch[]=s.toCharArray();
		
		int temp=0;int temp1=s.length()-1;
		boolean flag=true;
		while(temp<temp1)
		{
			if(ch[temp]!=ch[temp1])
			{
				flag=false;
				break;
			}
			temp++;
			temp1--;
		}
		if(flag==true)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindome");
		}
	}
}
