package KrishnaSandeep;

import java.util.Arrays;

public class Copying_Ele_One_Arr_To_Another_Arr {

	public static void main(String[] args) {
		int [] a1= {1,2,3,4,5};
		int [] a2=new int [a1.length];
		
		for(int i=0;i<a1.length;i++)
		{
			a2[i]=a1[i];
		}
		
		System.out.println("1st Array"+Arrays.toString(a1));
		System.out.println("2nd Array"+Arrays.toString(a2));
	}
}
