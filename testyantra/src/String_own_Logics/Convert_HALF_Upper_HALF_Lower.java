package String_own_Logics;

public class Convert_HALF_Upper_HALF_Lower {

	public static void main(String[] args) {
		String s="abcde";
		int n=s.length();
		for (int i = 0; i < s.length(); i++) {
			
			
			if(i<n/2)
			{
				if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
					 //int a=s.charAt(i);
					 char ch=(char)(s.charAt(i)-32);
					 
					 System.out.print(ch+" ");
					}
					else
					{
						System.out.print(s.charAt(i)+" ");
					}
			}
			else
			{
				if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
					// int a=s.charAt(i);
					 char ch=(char)(s.charAt(i)+32);
					 
					 System.out.print(ch+" ");
					}
					else
					{
						System.out.print(s.charAt(i)+" ");
					}
			}
		}
	}
}
