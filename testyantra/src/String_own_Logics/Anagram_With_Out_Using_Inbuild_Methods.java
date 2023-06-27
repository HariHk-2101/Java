package String_own_Logics;

public class Anagram_With_Out_Using_Inbuild_Methods {

	public static void main(String[] args) {

		String s = "TOP";
		String s1 = "top";
		if (s.length() != s1.length()) {
			System.out.println("Not Anagram");
		} else {
			s = convert_Cases(s);
			s1 = convert_Cases(s1);

			s = Sort(s);
			s1 = Sort(s1);

			if (compare(s, s1) == true) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}
		}
	}

	public static String convert_Cases(String ret) {

		String up = "";

		for (int i = 0; i < ret.length(); i++) {

			if (ret.charAt(i) >= 'a' && ret.charAt(i) <= 'z') {

				char ch = (char) (ret.charAt(i) - 32);

				up += ch;
			} else {
				up += ret.charAt(i);
			}
		}
		return up;
	}

	public static String Sort(String ret) {
		String up = "";
		char[] ch = new char[ret.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = ret.charAt(i);
		}

		for (int i = 0; i < ch.length; i++) {

			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] > ch[j]) {
					char temp = ch[j];
					ch[j] = ch[i];
					ch[i] = temp;
				}
			}
		}
		for (int i = 0; i < ch.length; i++) {
			up += ch[i];
		}
		return up;
	}

	public static boolean compare(String s, String s1) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s1.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
