package Strings;

import java.util.Scanner;

public class FrequenceString {
public static void main(String[] args) 

{
	WithUsingToChar();
	withOutUsingToChar();
	
}
public static void WithUsingToChar() {
	

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter The String...");
	
	String s=sc.nextLine();
	
	char[] ch=s.toCharArray();
	
	int [] fre=new int [ch.length];
	
	for(int i=0;i<s.length();i++)
	{
		fre[i]=1;
		for(int j=i+1; j<ch.length;j++)
		{
			if(ch[i]==ch[j]&&ch[j]!='0')
			{
				ch[j]='0';
				fre[i]++;
			}
		}
	}
	
	for(int i=0;i<ch.length;i++)
	{
		if(ch[i]!='0')
		{
			System.out.print(ch[i]+""+fre[i]);
		}
	}

}


public static void withOutUsingToChar() {
	
System.out.println();
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
