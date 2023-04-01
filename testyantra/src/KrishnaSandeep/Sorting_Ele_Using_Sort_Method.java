package KrishnaSandeep;

import java.util.Arrays;

public class Sorting_Ele_Using_Sort_Method {

	public static void main(String[] args) {
		int a[]= new int[]{10,30,20,40};
		
		System.out.println("Before Sorting "+Arrays.toString(a));
		
	    Arrays.sort(a);
	    
	    System.out.println("After Sorting.. "+Arrays.toString(a));
	}
}
