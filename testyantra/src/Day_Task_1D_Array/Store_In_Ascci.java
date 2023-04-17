package Day_Task_1D_Array;

import java.util.Arrays;

//1.  Store ascii values of each char of the given string in an array
public class Store_In_Ascci {

	public static void main(String[] args) {
		
		String str="abcd";
		int [] a=new int[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			a[i]=str.charAt(i);
		}
		
		System.out.println(Arrays.toString(a));
	}
}
