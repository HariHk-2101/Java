package Array1D;

import java.util.Scanner;

public class FirstArray_Ele_Present_2nd_Arr {
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
	    
	 
	  
		
		boolean flag = false;
		for(int j = 0 ; j < size ; j++)
		{
		for(int i = 0 ; i < size1 ; i++)
			{
				if(arr[j] == arr1[i])
				{
					flag = true;
				}
				else
				{
					flag = false;
				}
			}
		}
		if(flag == true)
		{
			System.out.println("All the elements of 1st are present in 2nd array");
		}
		else
		{
			System.out.println("All the elements of 1st are not present in 2nd array");
		}
        
	}
	}
	         
    


