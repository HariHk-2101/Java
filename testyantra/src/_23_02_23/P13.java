package _23_02_23;

import java.util.Scanner;

public class P13 {

	//Common Element
	
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
	    
	    boolean flag=true;
	    for(int j = 0 ; j < arr.length ; j++)
	    {
			for(int i = 0 ; i < arr1.length ; i++) 
			{
			if(arr[j]==arr1[i]) 
			{
				flag=false;
				System.out.println(arr[j]+" is the common element");
			}
        }
	 }
	    if(flag==true)
	    {
	    	System.out.println("There Is no Common element");
	    }
	}
}