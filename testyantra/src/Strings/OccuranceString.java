package Strings;

public class OccuranceString {

	public static void main(String[] args) {
		String in="aaaaabaccaaa";
		
		char target='b';
		
		int count =0;
		
		for(int i=0;i<in.length();i++)
		{
			char ch=in.charAt(i);
			
			if(ch==target)
			{
				count++;
			}
		}
		System.out.println("Output is "+count);
	}
}
