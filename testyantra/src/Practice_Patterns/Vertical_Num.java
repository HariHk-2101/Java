package Practice_Patterns;

public class Vertical_Num {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 1; i <= n; i++) {
			int a = i;
			int c = n - 1;
			for (int j = 1; j <= i; j++) {

				System.out.print(a + " ");
				a += c;
				c--;
			}

			System.out.println();
		}
	}
}
