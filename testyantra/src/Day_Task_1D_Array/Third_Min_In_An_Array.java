package Day_Task_1D_Array;

public class Third_Min_In_An_Array {
//27.Find Third Smallest Ele In an Array

	public static void main(String[] args) {

		int a[] = { 2, 3, 2, 3, 4, 5 };

		int min1 = Integer.MAX_VALUE;
		int min2 = 0;
		int min3 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min1) {
				min3 = min2;
				min2 = min1;
				min1 = a[i];

			} else if (a[i] < min2 && min1 != a[i]) {
				min3 = min2;
				min2 = a[i];
			} else if (a[i] < min3 && min2 != a[i] && min1 != a[i]) {
				min3 = a[i];
			}

		}
		System.out.println(min3);
	}
}
