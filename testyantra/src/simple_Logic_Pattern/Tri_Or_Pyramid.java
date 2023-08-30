package simple_Logic_Pattern;

public class Tri_Or_Pyramid {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < n + i; j++) {

				if (j > n - i) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		System.out.println();

		int str = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= str; k++) {
				System.out.print("* ");
			}
			System.out.println();
			str += 2;
		}
		System.out.println();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n * 2 - 1; j++) {
				if (i + j >= n + 1 && j - i <= n - 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
}
