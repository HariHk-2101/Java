package simple_Logic_Pattern;

public class Pyramid_Num {

	public static void main(String[] args) {

		int n = 5;
		for (int i = 1; i <= n; i++) {
			int k = n;
			int p = 2;
			for (int j = 1; j <= n * 2 - 1; j++) {

				if ((i + j >= n + 1 && j <= n) || (j > n && j - i <= n - 1)) {
					if (j <= n)
						System.out.print(k-- + " ");
					else
						System.out.print(p++ + " ");
				} else {
					if (j <= n) {
						System.out.print("  ");
						k--;
					} else {
						System.out.print("  ");
						p++;
						;

					}
				}

			}
			System.out.println();
		}
	}
}
