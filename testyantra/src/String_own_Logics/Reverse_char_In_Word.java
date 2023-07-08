package String_own_Logics;

public class Reverse_char_In_Word {

	public static void main(String[] args) {

		String s = "Your My Hero";
           s=s+" ";
		String res = "";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) != ' ') {
				s1 = s1+s.charAt(i);
			
			}
			else
			{
				
				for (int j = s1.length()-1; j >=0; j--) {
					    res+=s1.charAt(j );
				}
				res+=s.charAt(i);
				s1="";
			}
			
		}
		System.out.println(res);
		

	}
}
