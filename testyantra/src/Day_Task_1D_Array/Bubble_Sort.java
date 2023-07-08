package Day_Task_1D_Array;

import java.util.Arrays;

public class Bubble_Sort {
	// 4. Bubble sort of an array Elements
	public static void main(String[] args) {

		int[] a = { 5, 4, 3, 2, 1 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}

			}

		}
		System.out.println(Arrays.toString(a));
	}
}
