package Array1D;

import java.util.Scanner;

public class Third_Min {

	//3rd Min Value
	
	 public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter The Array Size..");
			
			int size=sc.nextInt();
			
		    System.out.println("Enter The Elements...");
		    
		    int [] arr=new int [size];
		    
		    for(int i=0;i<arr.length;i++)
		    {
		    	arr[i]=sc.nextInt();
		    	
		    }
			int min=arr[0];
			int min1=arr[0];
			int min2=arr[0];
			for(int i = 0 ; i < size ; i++) {
				if(arr[i] < min) {
					min2=min1;
					min1=min;
					min=arr[i];
			 }
	}
		System.out.println(min2+" is the 3rd minimum element");
	}
}
