package NumberPrograms;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The  Number...");

		int num = sc.nextInt();
		int temp = num;
		while (true) {

			int sum = 0;
			while (num > 0) {
				int rem = num % 10;
				sum += rem * rem;
				num /= 10;
			}

			num = sum;

			if (num == 1) {
				System.out.println("The Given Number " + temp + " is Happy number");
				break;
			} else if (num == 4) {
				System.out.println("The Given Number " + temp + " is Sad number");
				break;
			}

		}
	}
}
