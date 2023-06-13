package Array1D;

import java.util.Arrays;
import java.util.Scanner;

public class Third_Min {

	//3rd Min Value
	
	 public static void main(String[] args) {
//			Scanner sc= new Scanner(System.in);
//			System.out.println("Enter The Array Size..");
//			
//			int size=sc.nextInt();
//			
//		    System.out.println("Enter The Elements...");
//		    
		    int [] arr= {5,3,2,5,3,4};
		    
//		    
//		    for(int i=0;i<arr.length;i++)
//		    {
//		    	arr[i]=sc.nextInt();
//		    	
//		    }
		    int res=0;
		    if(arr.length<=3)
		    {
		      res=arr[arr.length-1];
		    }
		    else
		    {
			int min=arr[0];
			int min1=arr[0];
		    int min2=arr[0];
			
			for(int i = 0 ; i < arr.length; i++) {
				if(arr[i] < min) {
					min2=min1;
					min1=min;
					min=arr[i];
			 }
			}
			res=min2;
	}
		    System.out.println(res+" is the 3rd minimum element");
	}
}
