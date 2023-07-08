package String_own_Logics;

public class Print_Rainbow_Color_First_Letter {

	public static void main(String[] args) {
		
		String[]s= {"Violet","Indigo","Blue","Green","Yellow","Orange","Red"};
		
		for (int i = 0; i < s.length; i++) {
			
			String s1=s[i];
			
			System.out.print(s1.charAt(0)+" ");
		}
	}
}
