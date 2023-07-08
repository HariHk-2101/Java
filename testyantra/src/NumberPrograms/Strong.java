package NumberPrograms;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number...");

		int num = sc.nextInt();
		int temp = num;

		int sum = 0;

		while (num > 0) {
			int rem = num % 10;
			int fact = 1;

			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}

			sum = sum + fact;

			num = num / 10;

		}

		if (temp == sum) {
			System.out.println("Given num " + temp + " is Strong number...");
		} else {
			System.out.println("Given num " + temp + " is Not A Strong number...");
		}

	}

}
