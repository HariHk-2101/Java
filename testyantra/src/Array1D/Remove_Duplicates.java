package Array1D;

import java.util.Arrays;

public class Remove_Duplicates {

	public static void main(String[] args) {

		int num[] = { 10, 10, 20, 20, 30, 30, 30 };
		System.out.println(Arrays.toString(num));
		for (int i = 0; i < num.length; i++) {

			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					num[j] = -1;
				}
			}
			if (num[i] != -1) {
				System.out.println(num[i]);
			}

		}
		System.out.println(Arrays.toString(num));
	}
}
