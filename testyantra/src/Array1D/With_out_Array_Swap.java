package Array1D;

import java.util.Arrays;

public class With_out_Array_Swap {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3,3};

		int temp = 0, temp1 = a.length - 1;

		int k = 0;
		System.out.println(Arrays.toString(a));
		int i = 0;
		while (temp < temp1) {
			k = a[i];
			a[temp] = a[temp1];
			a[temp1] = k;
			temp++;
			temp1--;
			i++;
		}

		System.out.println(Arrays.toString(a));
	}
}
