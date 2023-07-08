package Day_Task_1D_Array;

import java.util.Arrays;

public class Merge_2_Arrays_One_By_One {

	// 24. Merge two array elements one after another

	public static void main(String[] args) {

		int a[] = { 1, 3, 5 };
		int b[] = { 2, 4, 6 };

		int c[] = new int[a.length + b.length];

		int temp = 0, temp1 = 0;
		for (int i = 0; i < c.length; i++) {

			if (temp < a.length) {
				c[i] = a[temp++];

			} else {
				c[i] = b[temp1++];
			}
		}
		System.out.println(Arrays.toString(c));
	}
}
