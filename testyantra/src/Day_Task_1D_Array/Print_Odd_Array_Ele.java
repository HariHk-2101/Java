package Day_Task_1D_Array;

public class Print_Odd_Array_Ele {
//      16.Print_Odd_Array_Ele

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 1) {
				System.out.print(a[i] + " ");
			}
		}

	}

}
