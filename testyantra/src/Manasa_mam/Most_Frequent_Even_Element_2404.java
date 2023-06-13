package Manasa_mam;

import java.util.Arrays;
import java.util.Iterator;

public class Most_Frequent_Even_Element_2404 {

	public static void main(String[] args) {

		int nums[] = { 8154, 9139, 8194, 3346, 5450, 9190, 133, 8239, 4606, 8671, 8412, 6290 };

		Arrays.sort(nums);
		System.out.println(mostFrequentEven(nums));
	}

	public static int mostFrequentEven(int[] nums) {

		int c = 0;
		int res = -1;

		if (nums.length == 1 && nums[0] % 2 == 0) {
			res = nums[0];
		}

		else {
			for (int i = 0; i < nums.length; i++) {

				int c1 = 0;

				for (int j = i; j < nums.length; j++) {

					if (nums[i] == nums[j] && nums[i] % 2 == 0) {

						c1++;
					} else if (nums[i] % 2 == 0 && (nums[i] < res || res == -1)) {
						res = nums[i];

					}

				}

				if (c1 > c) {
					c = c1;
					res = nums[i];
				}

			}
		}
		return res;

	}

}
