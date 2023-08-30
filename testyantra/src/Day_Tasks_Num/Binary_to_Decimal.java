package Day_Tasks_Num;

public class Binary_to_Decimal {

	public static void main(String[] args) {

		int num = 1010100;// 20

		int pow = 0;
		int sum = 0;

		while (num > 0) {
			int fact = 1;
			for (int i = 1; i <= pow; i++) {

				fact = fact * 2;

			}

			int d = num % 10;

			int res = d * fact;

			sum = sum + res;

			num /= 10;

			pow++;
		}
		System.out.println(sum);

	}
}
