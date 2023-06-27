package String_own_Logics;

public class Convert_Lower {

	public static void main(String[] args) {
		String s = "HARI";

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				int a = s.charAt(i);
				char ch = (char) (a + 32);

				System.out.print(ch + " ");
			} else {
				System.out.print(s.charAt(i) + " ");
			}
		}
	}
}
