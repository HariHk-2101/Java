package Day_Task_1D_Array;

public class Find_Large_Ele {

	// 21. Find largest element in a n array

	public static void main(String[] args) {

		int a[] = { 15, 2, 3, 55, 3 };

		int l = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] > l) {
				l = a[i];

			}
		}

		System.out.println(l);
	}

}
