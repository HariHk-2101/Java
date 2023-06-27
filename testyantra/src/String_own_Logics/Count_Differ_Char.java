package String_own_Logics;

public class Count_Differ_Char {

	public static void main(String[] args) {
		
		String s="Hari@123".toLowerCase();
		
		int v=0;
		int c=0;
		int sc=0;
		int n=0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch=s.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					v++;
				}
				else
				{
					c++;
				}
			}
			else if(ch>='0'&&ch<='9')
			{
				n++;
			}
			else
			{
				sc++;
			}
		}
		
		System.out.println("vowels count is "+v);
		System.out.println("Consonents is "+c);
		System.out.println("Special char count is "+sc);
		System.out.println("Num count is "+n);
	}
}
