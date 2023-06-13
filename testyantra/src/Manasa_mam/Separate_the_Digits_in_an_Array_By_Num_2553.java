package Manasa_mam;

import java.util.Arrays;

public class Separate_the_Digits_in_an_Array_By_Num_2553 {

	public static void main(String[] args) {

		// [13,25,83,77]
		// [3,2,4,3,6,8,8,1,0,0,8,4,8,0,1,4,8,8,4,2,5,3,9,8,6,9,6,4,4,0,6,0,2,3,9,9]
		// [3,2,4,3,6,8,8,10,0,8,4,8,0,1,4,8,8,4,2,5,3,9,8,6,9,6,4,4,0,6,0,2,3]
		// [3,2,4,3,6,8,8,1,0,8,4,8,0,1,4,8,8,4,2,5,3,9,8,6,9,6,4,4,0,6,0,2,3]
		int nums1[] = { 32, 43, 68, 8, 100, 84, 80, 14, 88, 42, 53, 98, 69, 64, 40, 60, 23, 99 };
		// int nums1[]= {1,25,83,77};
		// Output: [1,3,2,5,8,3,7,7]
		Separate_the_Digits_in_an_Array_By_Num_2553 s = new Separate_the_Digits_in_an_Array_By_Num_2553();
		int a[] = s.separateDigits(nums1);

//		for (int i = 0; i < a.length; i++) {
//
//			System.out.print(a[i] + " ");
//		}

		System.out.println(Arrays.toString(a));
	}

	public int[] separateDigits(int[] a) {
//		int count = 0;
//		for (int i = 0; i < nums.length; i++) {
//
//			int num = nums[i];
//
//			while (num > 0) {
//				count++;
//				num /= 10;
//			}
//		}
//        System.out.println(count);
//        
//		int nums2[] = new int[count];
//		
//		for(int i=0;i<nums.length;i++)
//		{
//			
//		
//		}
//
//			
//		
//	
//	return nums2;

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			while (n != 0) {
				count++;
				n /= 10;
			}
		}

		int a1[] = new int[count];
		int a2[] = new int[a1.length];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			while (n != 0) {
				int d = n % 10;
				a1[j] = d;
				j++;
				n /= 10;

			}

		}
		
		int z = 0;
		int x = 0;
		for (int i = 0; i < a.length; i++) {
			int count1 = 0;
			int n = a[i];
			while (n != 0) {
				count1++;
				n /= 10;
			}

			int v[] = new int[count1];
		
			for (int l = 0; l < v.length; l++) {
				v[l] = a1[z];
				z++;

			}
			
			for (int r = v.length - 1; r >= 0; r--) {
				a2[x] = v[r];
				x++;
			}
     
		}
		return a2;

	}

}
