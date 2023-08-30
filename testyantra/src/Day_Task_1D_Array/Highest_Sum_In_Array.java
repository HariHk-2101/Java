package Day_Task_1D_Array;

public class Highest_Sum_In_Array {

	// 18. Print highest sum of two elemets in an array

	public static void main(String[] args) {

		int a[] = { 1,4,3,4,1,2};

		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (sum < a[i] + a[j]) {
					sum = a[i] + a[j];
				}

			}

		}
		System.out.println("Highest Sum In Array " + sum);

		

		

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (sum > a[i] + a[j]) {
					sum = a[i] + a[j];

				}

			}

		}
		System.out.println("Lowest Sum In An Array "+sum);
	}
}
