package Day_Task_1D_Array;

import java.util.Arrays;

public class Remove_Ele_In_Arr {
	 
// 37.  Remove an element from an array
	
	public static void main(String[] args) {
		int a[]= {1,2,3,3,4,5};
		
		int b[]=new int[a.length-1];
		
		int index=3;
		
		int j=0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(i==index)
			{
				i++;
			}
			
			b[j]=a[i];
			j++;
		}
	
		System.out.println(Arrays.toString(b));
	}
	
}
