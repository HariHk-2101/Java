package LeetCode;

import java.util.Arrays;

public class Sort_an_Array_912 {

	public static void main(String[] args) {
		
		int nums[]= {5,2,3,1};
		
	    int a[]=sort(nums);
		
		for(int i=0;i<nums.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
		
	public static int[] sort(int nums[]) {
		
		Arrays.sort(nums);
		
		int a[]=new int[nums.length];
		
		for (int i = 0; i < nums.length; i++) {
			
			a[i]=nums[i];
		}
		
		return a;
	}
}
