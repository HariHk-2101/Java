package Array1D;

import java.util.Scanner;

public class insert_Ele {
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
	    if(index>=arr.length)
	    {
	    	System.out.println("Array Index invalid..");
	    
	    }
	    else {
	    	
	    int j=0;
	    
	    
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
