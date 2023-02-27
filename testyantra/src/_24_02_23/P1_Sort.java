package _24_02_23;

import java.util.Scanner;

public class P1_Sort {

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
	  
	    
	    for(int i=0 ;i<arr.length-1;i++)
	    {
	    	for(int j=0;j<arr.length-1-i;j++)
	    	{
	    		if(arr[j]<arr[j+1])
	    		{
	    			int temp=arr[j];
	    			arr[j]=arr[j+1];
	    			arr[j+1]=temp;
	    		}
	    	}
	    	
	      }
	    System.out.println("After Sorting The Array..");
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	    }
	
}
