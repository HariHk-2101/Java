package LeetCode;

import java.util.Arrays;

public class Intersection_of_Two_Arrays_349 {

	public static void main(String[] args) {

		int nums1[] = { 1, 2, 2, 1 };

		int nums2[] = { 2, 2 };
		int dup=0;

		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] == nums2[j]&&dup!=nums1[i]) {

					nums2[j] = -1;
					dup=nums2[j];
					break;
				}
			}
			
		}
      System.out.println(Arrays.toString(nums2));
	}
}
