package _23_02_23;

import java.util.Scanner;

public class P11 {

	//Highest Sum
	
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
	
	
	int sum1 = 0;
	int n=0;
	int n1=0;
	for( int i = 0 ; i < arr.length ; i++) 
	{
		for( int j = i+1 ; j < arr.length ; j++) 
		{
			int sum = arr[i] + arr[j];
			if(sum > sum1)
			{
				n = arr[i];
				n1 = arr[j];
				sum1 = sum;
			}
		}
	}
	System.out.println(n+"+"+n1+"="+sum1+" is the highest sum");
}
}
