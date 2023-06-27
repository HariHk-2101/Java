package String_own_Logics;

public class Count_Num_Of_Words {

	public static void main(String[] args) {

		String s = "   . gf ugd ugu  ..... fff   efb fhe  hdhhd . Jjj   ".toUpperCase();

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			for (int j = 33; j <= 64; j++) {
				char ch = (char) j;
				if (s.charAt(i) == ch) {
					s = s.replace(s.charAt(i), ' ');
					break;
				}

			}

		}

		for (int i = 0; i < s.length(); i++) {
			if (i == 0 && s.charAt(i) != ' ' || s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
				count++;
			}

		}
		System.out.println(count);

	}
}
