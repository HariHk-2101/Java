package Number_patterns;

public class Diamond_Num {

	public static void main(String[] args) {
		int n =3;
		int c = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j < n + i; j++) {
				if ((j > n - i && j % 2 == 1 && i % 2 == 1) || (j > n - i && j % 2 == 0 && i % 2 == 0)) {
					System.out.print(c++ + " ");
				}
				else
				{
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}
}
