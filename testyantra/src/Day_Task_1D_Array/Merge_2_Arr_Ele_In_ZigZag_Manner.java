package Day_Task_1D_Array;

import java.util.Arrays;

public class Merge_2_Arr_Ele_In_ZigZag_Manner {

	// 42.Merge 2 array ele in zigzag manner

	public static void main(String[] args) {

		int a[] = { 1, 3, 5 };
		int b[] = { 2, 4, 6, 7 };

		int c[] = new int[a.length + b.length];

		int temp = 0, temp1 = 0;

		for (int i = 0; i < c.length; i++) {

			if (temp < a.length) {
				c[i] = a[temp++];
				i++;
			}
			if (temp1 < b.length) {
				c[i] = b[temp1++];
			}
		}
		System.out.println(Arrays.toString(c));
	}
}
