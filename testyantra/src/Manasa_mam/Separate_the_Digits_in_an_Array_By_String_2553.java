package Manasa_mam;

import java.util.Arrays;

public class Separate_the_Digits_in_an_Array_By_String_2553 {

	public static void main(String[] args) {
		
		int nums1[] = { 32, 43, 68, 8, 100, 84, 80, 14, 88, 42, 53, 98, 69, 64, 40, 60, 23, 99 };
		
		String s="";
		
		for (int i = 0; i < nums1.length; i++) {
			
			s=s+nums1[i];
		}
		
		int a[]=new int[s.length()];
		
		for (int i = 0; i < a.length; i++) {
			
			a[i]=s.charAt(i)-48;
		}
		
		System.out.println(Arrays.toString(a));
	}
}
