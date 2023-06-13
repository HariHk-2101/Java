package LeetCode;

import java.util.Arrays;

public class Median_of_Two_Sorted_Arrays_4 {

	public static void main(String[] args) {

		int nums1[] = { 1, 2 };
		int nums2[] = { 5,4 };

		double res = 0;

		int merged[] = new int[nums1.length + nums2.length];

		int temp = 0, temp1 = 0;
		for (int i = 0; i < merged.length; i++) {

			if (temp < nums1.length) {
				merged[i] = nums1[temp++];
			} else {
				merged[i] = nums2[temp1++];
			}

		}
		Arrays.sort(merged);
		if (merged.length % 2 == 0) {
			int a = (merged.length / 2);
			int b = a - 1;
			int a1 = merged[a];
			int a2 = merged[b];

			double sum = a1 + a2;
			res=sum/2;
			System.out.println(res);
		} else {
			res=merged[merged.length/2];
			System.out.println(res);
			
		}
	}

}
