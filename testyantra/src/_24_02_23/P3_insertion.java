package _24_02_23;

import java.util.Scanner;

public class P3_insertion {
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
	    
	    
	    int arr1[]=new int[arr.length+1];
	    System.out.println("Enter The Element..");
	    int ele=sc.nextInt();
	    System.out.println("Enter The Index..");
	    int index=sc.nextInt();
	  
	    int j=0;
	    if(j<=arr1.length)
	    {
	    for(int i=0;i<arr.length;i++)
	    {
	    	
	    	if(j==index)
	    	{
	    		
	    	  arr1[j]=ele;
	    		j++;	  
	        }
	    	
	    	arr1[j]=arr[i];
	        j++;
	    }
	  
	    for(int i=0;i<arr1.length;i++)
	    {
	    	
	    	System.out.print(arr1[i]+" ");
	    }
	  }  
	}
}
