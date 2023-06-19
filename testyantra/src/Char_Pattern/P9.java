package Char_Pattern;

public class P9 {

	public static void main(String[] args) {
		int n = 4;
		char ch = 'A';
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (i == 1 || j == 1 || i == n || j == n)
					System.out.print(ch++ + " ");
				else
					System.out.print("  ");
			}

			System.out.println();
		}
	}
}
