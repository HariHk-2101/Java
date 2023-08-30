package Day_Task_1D_Array;

import java.util.Arrays;

public class Insertion_Sort_Array {

	public static void main(String[] args) {
		
		int a[] = {2,18,5,7,11};//5
		
		int b[]=new int[a.length+1];//
		
		
		for (int i = 1; i < a.length; i++) {
			
			int temp=a[i];
			int j=i-1;
			
			while(j>=0&&a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		System.out.println(Arrays.toString(a));
		
	}
}
