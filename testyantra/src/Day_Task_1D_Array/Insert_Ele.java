package Day_Task_1D_Array;

import java.util.Arrays;
import java.util.Iterator;

public class Insert_Ele {
	
	// 20. Insert an element to a particular index of an array

	public static void main(String[] args) {

		i 
		int a[] = { 1, 2, 4, 5 };

		int b[] = new int[a.length + 1];

		int index = 3;
		int ele = 3;
   
		if (index >= a.length) {
			System.out.println("Index Postion Invalid..");
		} else {
			int j = 0;
			for (int i = 0; i < a.length; i++) {

				if (index == i) {
					b[j] = ele;
					j++;
				}

				b[j] = a[i];
				j++;
			}

			System.out.println(Arrays.toString(b));

		}
	}

}
