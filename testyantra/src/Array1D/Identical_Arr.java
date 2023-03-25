package Array1D;

import java.util.Scanner;

public class Identical_Arr {

	//identical
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
	    
	    System.out.println("Enter The 2nd Array Size..");
	    
        int size1=sc.nextInt();
		
	    System.out.println("Enter The Elements...");
	    
	    int [] arr1=new int [size1];
	    
	    for(int i=0;i<arr1.length;i++)
	    {
	    	arr1[i]=sc.nextInt();
	    }
	    
       
		boolean flag=false;
		
		if(arr.length==arr1.length)
		{
		for(int i=0;i<arr.length;i++)
		{
		
			if(arr[i]==arr1[i])
			{
				flag =true;
			}
			else
			{
				flag=false;
			}
			
		}
	}
	    
	    if(flag==true)
	    {
	    	System.out.println("Identical");
	    }
	    else
	    {
	    	System.out.println("No identical ");
	    }
	}
	
}
