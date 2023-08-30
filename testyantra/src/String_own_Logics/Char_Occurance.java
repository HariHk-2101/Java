package String_own_Logics;

public class Char_Occurance {

	public static void main(String[] args) {
		
		String s="apple".toLowerCase();
		
		String visited="";
	        
	
		 
		for (int i = 0; i < s.length(); i++) {
			
			char ch=s.charAt(i);
			
			if(visited.indexOf(ch)==-1)
			{
				int count=1;
				for (int j = i+1; j < s.length(); j++) {
					
					if(s.charAt(i)==s.charAt(j))
					{
						count++;
					}
				}
				System.out.println(s.charAt(i)+"="+count);
				visited+=s.charAt(i);
			}
		}
		
	}
}
