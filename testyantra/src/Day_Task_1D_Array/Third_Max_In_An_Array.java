package Day_Task_1D_Array;

public class Third_Max_In_An_Array {
	// 23.Find 3rd Largest Ele In An Array
	public static void main(String[] args) {

		int a[] = { 10, 20, 40, 30, 50 };

		int max1 = 0;
		int max2 = 0;
		int max3 = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > max1) {
				max3 = max2;
				max2 = max1;
				max1 = a[i];
			} else if (a[i] > max2 && max1 != a[i]) {
				max3 = max2;
				max2 = a[i];
			} else if (a[i] > max3 && max2 != a[i] && max1 != a[i]) {
				max3 = a[i];
			}
		}
		System.out.println(max3);

	}
}
