package Day_Task_1D_Array;

public class Identical_2_Arrays {

	// 19. Check whether two arrays are identiical or not

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };

		int b[] = { 1, 2, 3, 4 };

		if (a.length != b.length) {
			System.out.println("2 Arrays Are Not Identical");
		} else {
			boolean flag = true;
			for (int i = 0; i < b.length; i++) {

				if (a[i] != b[i]) {
					flag = false;
					break;
				}
			}

			if (flag == true) {
				System.out.println("2 Arrays Are Identical...");
			} else {
				System.out.println("2 Arrays Are Not Identical...");
			}
		}

	}
}
