package Day_Task_1D_Array;

public class Check_Repeated_Ele {

	// 7. Check what are the repeated elements are present in an array

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 3, 2 };

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(a[i]);
			}
		}
	}
}
