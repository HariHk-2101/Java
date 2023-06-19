package simple_Logic_Pattern;

public class Rhombus {

	public static void main(String[] args) {
		int n = 9;

		for (int i = n; i >= 1; i--) {

			for (int j = 1; j <= n * 2 - 1; j++) {
				if (j >= i && i >= j - n + 1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
    System.out.println("*");
		int k=9;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= k * 2 - 1; j++) {
				if (j >= i && i >= j - n + 1) {
				//if (j == i || i == j - k + 1||i==k&&j>k||i==1&&j<k) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
