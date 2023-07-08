package NumberPrograms;

import java.util.Scanner;

public class SunnyNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The number...");

		int num = sc.nextInt();
		int sq = num + 1;
		boolean check = false;

		for (int i = 1; i <= sq / 2; i++) {
			if (i * i == sq) {
				check = true;
				break;
			}
		}

		if (check) {
			System.out.println("Given  Number " + num + " is Sunny Number");
		} else {
			System.out.println("Given  Number " + num + " is Not A Sunny Number..");
		}
	}
}
