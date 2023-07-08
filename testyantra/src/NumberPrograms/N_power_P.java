package NumberPrograms;

import java.util.Scanner;

public class N_power_P {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Value 1..");

		int num1 = sc.nextInt();
		System.out.println("Enter The Value 2...");
		int num2 = sc.nextInt();

		int prod = 1;

		for (int i = 1; i <= num2; i++) {
			prod = prod * num1;
		}

		System.out.println(num1 + " power " + num2 + " is " + prod);

	}

}
