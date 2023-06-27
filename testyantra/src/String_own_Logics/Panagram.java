package String_own_Logics;

public class Panagram {

	public static void main(String[] args) {

		String s = "asdfg  hjklqwertyuiopzx   cvbnmjbnxsvwbii1111   vciv".toLowerCase();

		s = s.replace(" ", "");

		char ch[] = s.toCharArray();

		char ch1[] = new char[26];

		for (int i = 0; i < ch1.length; i++) {

			int ind = ch[i] - 97;

			ch1[ind] = ch[i];

		}
		System.out.println(ch1);

		boolean flag = true;

		for (int i = 0; i < ch1.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
					flag=true;
			}
			else
			{
				flag=false;
				break;
			}
		}

		if (flag == true) {
			System.out.println("Panagram");
		} else {
			System.out.println("Not A Panagram");
		}
	}
}
