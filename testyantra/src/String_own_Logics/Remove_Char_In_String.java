package String_own_Logics;

public class Remove_Char_In_String {

	public static void main(String[] args) {

		String s = "jjjavaaaaaaaavvvb";

		String vis = "";
		for (int i = 0; i < s.length(); i++) {

			int count = 0;

			char ch = s.charAt(i);

			if (vis.indexOf(ch) == -1) {
				
				for (int j = i + 1; j < s.length(); j++) {

					char ch1 = s.charAt(j);
					if (ch == ch1) {
						count++;
					}
				}

				if (count == 0) {
					System.out.println(ch);

				}
				vis += ch;
			}
		}

	}

}
