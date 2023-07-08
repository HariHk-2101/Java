 package String_own_Logics;

public class Rotational_String {

	public static void main(String[] args) {

		String s = "abcdef";

		String s1 = "efabcd";

		char ch[] = s.toCharArray();
		int check = 0;

		int i = 1;

		while (i <= s.length()) {
			boolean flag = true;
			for (int j = 0; j < ch.length - 1; j++) {

				if (j < ch.length - 1) {
					char temp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = temp;

				}

			}

			for (int j = 0; j < ch.length; j++) {
				if (ch[j] != s1.charAt(j)) {

					flag = false;

					break;
				}
			}

			if (flag == true) {
				check++;
				break;
			} else {
				i++;
			}
		}
		if (check == 1) {
			System.out.println("Rotational String");
		} else {
			System.out.println("Not A Rotational String");
		}

	}
}
