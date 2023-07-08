package Day_Task_1D_Array;

public class Pairs_Sum_10 {

	// 32. Check which pair of elements have sum as 10 in an array

	public static void main(String[] args) {

		int a[] = { 8, 5, 2, 5, 4, 6 };
		boolean flag = false;
		int num = 10;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] + a[j] == num) {
					flag = true;
					System.out.println(a[i] + " & " + a[j] + " is The Sum Of " + num);
				}
			}
		}

		if (flag == false) {
			System.out.println("No Pairs Found");
		}
	}
}
