package NumberPrograms;

public class Start_Num_Even_Not {

	public static void main(String[] args) {

		int n = 234;
		int temp = n;

		while (n > 9) {
			n /= 10;
		}
		if (n % 2 == 0) {
			System.out.println("The Given Number " + temp + " Starts With Even");

		} else {
			System.out.println("The Given Number " + temp + " Does Not Starts With Even");

		}
	}
}
