package Day_Task_1D_Array;

public class Sec_Smallest_Ele {
//26.  Find second smallest element in a n array
	public static void main(String[] args) {

		int a[] = { 1, 1, 1, 2, 2, 4, 5 };

		int min = Integer.MAX_VALUE;
		int secmin = 0;

		for (int i = 1; i < a.length; i++) {

			if (a[i] < min) {
				secmin = min;
				min = a[i];
			} else if (a[i] < secmin && a[i] != min) {
				secmin = a[i];
			}

		}

		System.out.println(secmin);
	}
}
