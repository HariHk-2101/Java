package Day_Task_1D_Array;

import java.util.Arrays;

public class Rev_Array {

	// 38.Reverse Of An Array
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("2nd Method...");
		int temp = 0;
		int temp1 = a.length - 1;

		while (temp < temp1) {
			int st = a[temp];
			a[temp] = a[temp1];
			a[temp1] = st;

			temp++;
			temp1--;

		}
		System.out.println(Arrays.toString(a));
	}
}
