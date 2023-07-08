package String_own_Logics;

public class Even_Char_Seperate_With_Comma {

	public static void main(String[] args) {
		
		String s="hari";
		
		for (int i = 0; i < s.length(); i++) {
			
			if(i==0)
			{
				System.out.print(s.charAt(i));
			}
			else if(i%2==0)
			{
				System.out.print(","+s.charAt(i));
			}
		}
	}
}
