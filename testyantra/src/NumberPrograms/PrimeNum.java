package NumberPrograms;

public class PrimeNum {

	public static void main(String[] args) {

		int n = 5;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			count++;
		}
		if (count == 2) {
			System.out.println("The Given Num " + n + " Is a Prime Number");
		} else {
			System.out.println("The Given Num " + n + " Is Not a Prime Number");
		}
	}
}
