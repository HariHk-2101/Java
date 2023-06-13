package Array1D;

import java.util.Arrays;
import java.util.Scanner;

public class Third_Max {

	//3rd Max
	 public static void main(String[] args) {
//			Scanner sc= new Scanner(System.in);
//			System.out.println("Enter The Array Size..");
//			
//			int size=sc.nextInt();
//			
//		    System.out.println("Enter The Elements...");
//		    
		    int [] arr= {1,2};
		    
//		    for(int i=0;i<arr.length;i++)
//		    {
//		    	arr[i]=sc.nextInt();
//		    	
//		    }
		    Arrays.sort(arr);
	        int max=arr[0];
           	int max1=arr[0];
	       int max2=arr[0];
	    for(int i = 0 ; i < arr.length ; i++) {
		if(arr[i] > max) {
			max2=max1;
			max1=max;
			max=arr[i];
		}
	}
	System.out.println(max2+" is the 3rd maximum element");
}
}

