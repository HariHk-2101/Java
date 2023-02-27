package _23_02_23;

import java.util.Scanner;

public class P6 {
	
	//pairs found.
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
	    
	    
	    System.out.println("Enter The cheking Element...");
	    int check=sc.nextInt();
	    
	    for(int i=0;i<arr.length;i++)
	    {
	    	int sum=arr[i];
	    	
	    	if(sum==check)
	    	{
	    		System.out.println("found An element "+arr[i]+" at index "+i);
	    		
	    	}
	    	else 
	    	{
	    		for(int j=i+1;j<arr.length;j++)
	    		{
	    			sum=arr[i]+arr[j];
	    			
	    			if(sum==check)
	    			{
	    				System.out.println();
	    				System.out.println("Pairs found..");
	    				
	    				System.out.println(arr[i]+" at index "+i);
	    				System.out.println(arr[j]+" at index "+j);
	    				
	    			}
	    			
	    		} 
	   
	    		
	    	}
	    	
	    }
}
}
