package Char_Pattern;

public class P1 {

	public static void main(String[] args) {

		int n = 3;
		char ch = 'A';
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				System.out.print(ch++ + " ");
			}

			System.out.println();
		}
	}
}
