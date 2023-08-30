package NewLogics_Arrays;

import java.util.Arrays;

public class Nth_Max {

	public static void main(String[] args) {

		int a[] = { 50, 60, 200, 49, 59 };

		Arrays.sort(a);
		
		int target = 4;
		int max = a[0];
		
		int count = 1;

		if (target > a.length || target <= 0) {
			System.out.println("Target should be in Between : ( 1  to " + a.length + " )");
		} else {
			for (int i = 1; i < a.length; i++) {

				if (max < a[i]) {
					max = a[i];
					count++;
				}

				if (count == target) {
					System.out.println(max);
					break;
				}
			}

		}
	}
}
