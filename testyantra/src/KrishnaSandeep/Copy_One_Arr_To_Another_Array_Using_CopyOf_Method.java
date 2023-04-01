package KrishnaSandeep;

import java.util.Arrays;

public class Copy_One_Arr_To_Another_Array_Using_CopyOf_Method {

	public static void main(String[] args) {
		
		int oldArr[]= {1,2,3,4,5};
		int newArr[]=Arrays.copyOf(oldArr, oldArr.length);
		
		for(int i=0;i<newArr.length;i++)
		{
			System.out.println(newArr[i]);
		}
	}
}
