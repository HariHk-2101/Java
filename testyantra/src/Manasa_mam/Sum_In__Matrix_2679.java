package Manasa_mam;

import java.util.Arrays;



public class Sum_In__Matrix_2679 {

	static int max(int a[]) {
		Arrays.sort(a);
		return a[a.length - 1];
	}

	public static int matrixSum(int[][] nums) {

		int sum = 0;
		if (nums.length == 1) {
			sum = nums[0][0];
		}

		else {

			for (int i = 0; i < nums.length - 1; i++) {
				int n[] = new int[nums[i].length];
				int k = 0;
				for (int j = 0; j < nums[i].length; j++) {
					n[k++] = nums[j][i];

				}

				int nn = max(n);
				sum += nn;

			}

		}
		return sum;
	}

	public static void main(String[] args) {

		// Input: nums = [[7,2,1],[6,4,2],[6,5,3],[3,2,1]]

		 int nums[][]= {{7,2,1},{6,4,2},{6,5,3},{3,2,1}};

		//int nums[][] = { { 1 } };
		System.out.println(matrixSum(nums));

	}
}
