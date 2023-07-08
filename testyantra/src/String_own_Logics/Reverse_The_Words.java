package String_own_Logics;

class Reverse_The_Words {
	public static void main(String[] args) {

		String s = "you are my hero";

		String res = "";
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			
			if (s.charAt(i) != ' ') {

				rev += s.charAt(i);
         
			} else {
				rev += s.charAt(i);
			}

			System.out.println(rev);
		}
		System.out.println(res);
	}
}
