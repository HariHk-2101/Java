package Array1D;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter The Array Size..");
//		
//		int size=sc.nextInt();
//		
//	    System.out.println("Enter The Elements...");
//	    
//	    int [] arr=new int [size];
//	    
//	    for(int i=0;i<arr.length;i++)
//	    {
//	    	arr[i]=sc.nextInt();
//	    }
		int arr[]= {9,11,2,8,1,3};
	    
	    for(int i=0 ;i<arr.length-1;i++)
	    {
	    	
	    int small=i;
	    
	     for(int j=i+1;j<arr.length;j++)
	     {
	    	if(arr[j]<arr[small])
	    	{
	    		small=j;
	    	}
	     }   
	  
	     int temp = arr[small];
	     arr[small]=arr[i];
	     arr[i]=temp;
	     System.out.println(Arrays.toString(arr));
	    }
	    
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	}
}
