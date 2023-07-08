package NumberPrograms;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number...");

		int num = sc.nextInt();
		int temp1 = num;
		int count = 0;

		while (num > 0) {
			count++;
			num /= 10;
		}

		if (count % 2 == 0) {
			count /= 2;
			int n = 1;
			for (int i = 1; i <= count; i++) {
				n *= 10;
			}
			int mod = temp1 % n;
			int div = temp1 / n;
			int sum = mod + div;
			int square = sum * sum;

			if (square == temp1) {
				System.out.println("Given num " + temp1 + " is Tech Number..");
			} else {
				System.out.println("Given num " + temp1 + " is Not A tech Number...");
			}
		} else {
			System.out.println("Given num " + temp1 + " is Not A tech Number...");
		}

	}
}
