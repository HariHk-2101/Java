package Day_Task_1D_Array;

import java.util.Arrays;

public class Copy_Ele {

	// 9. Copy one array elements into another array and print it

	public static void main(String[] args) {

		int a[] = { 10, 20, 30 };
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}
