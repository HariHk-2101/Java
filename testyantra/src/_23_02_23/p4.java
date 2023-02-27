package _23_02_23;

import java.util.Scanner;

// 
public class p4 {

	//rev program
	
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
	    
	    int a=0;
	    int b=arr.length-1;
	    
	    int temp=0;
	    
	    while(a<b)
	    {
	    	temp=arr[a];
	    	arr[a]=arr[b];
	    	arr[b]=temp;
	      
	    	a++;
	    	b--;
	    }
	    
	    System.out.println("After Reversing The Elements");

	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.println(arr[i]);
	    }
	    
	}
}
