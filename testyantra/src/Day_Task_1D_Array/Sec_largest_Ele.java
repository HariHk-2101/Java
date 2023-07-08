package Day_Task_1D_Array;

public class Sec_largest_Ele {

//22.  Find second largest element in a n array

	public static void main(String[] args) {
		int a[] = { 10, 5, 6, 3, 8 };

		int max = a[0];
		int secmax = 0;

		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {
				secmax = max;
				max = a[i];
			} else if (a[i] > secmax && a[i] != max) {
				secmax = a[i];
			}
		}

		System.out.println(secmax);
	}

}
