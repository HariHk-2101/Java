package LeetCode;

import java.util.Arrays;

public class Reverse_Char_Leet {

	public static void main(String[] args) {

		String s = "a-bC-dEf-ghIj";
		//"j-Ih-gfE-dCba"

		System.out.println(rev(s));

	}

	public static String rev(String s) {

		char[] ch = s.toCharArray();
		String rev = "";
		char ch1[] = new char[ch.length];
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == '-') {
				ch1[i] = ch[i]; 

			}

		}
		System.out.println(Arrays.toString(ch1));
		int j=0;
		for (int i = ch.length-1; i>=0; i--) {

			if (ch[i] != '-') {
				ch1[j] = ch[i];
                 
			}
			j++;

		}
		System.out.println(Arrays.toString(ch1));
		for (int i = 0; i < ch1.length; i++) {
			rev = rev + ch1[i];
		}
		return rev;
	}
}
