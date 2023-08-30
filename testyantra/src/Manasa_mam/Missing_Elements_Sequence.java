package Manasa_mam;

import java.util.Arrays;

public class Missing_Elements_Sequence {

	public static void main(String[] args) {
		
		int a[]= {1,3,5,7};
		
		Arrays.sort(a);
		
		int missing=a[0];
		for (int i = 0; i < a.length; i++) {
			
			if(missing==a[i])
			{
				missing++;
			}
			else
			{
				System.out.println(missing);
				missing=a[i]+1;
			}
		}
	}
}
