package NumberPrograms;

import java.util.Scanner;

public class Perfectsquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The number...");

		int num = sc.nextInt();

		boolean check = false;

		for (int i = 1; i <= num; i++) {
			if (i * i == num) {
				check = true;
				break;
			}
		}

		if (check) {
			System.out.println("Given  Number " + num + " is Perfect Square Root");
		} else {
			System.out.println("Given  Number " + num + " is Not A perfect Square Root..");
		}
	}
}
