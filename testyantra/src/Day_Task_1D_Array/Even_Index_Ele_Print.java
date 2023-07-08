package Day_Task_1D_Array;

public class Even_Index_Ele_Print {

	// 13. Print only even index array elements in an array

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < a.length; i++) {

			if (i % 2 == 0) {
				System.out.print(a[i] + " ");
			}

		}
	}
}
