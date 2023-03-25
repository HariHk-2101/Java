package Array1D;

import java.util.Scanner;

public class Delete_Ele {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter the array elements... ");
		for (int i = 0; i < size; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The array elements are... ");
		for (int i = 0; i < size; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("Enter the removing index... ");
		
		int index=sc.nextInt();
		
		if(index>=arr.length)
		{
		System.out.println("Array Index Invalid...");
		}
		else
		{
		int [] arr1= new int[arr.length];
		
		int j=0;
		
		for (int i = 0; i < arr.length; i++)
		{
	       if(i!=index) 
	       {
			arr1[j]=arr[i];
			j++;
	       }
		}
	    	   
	
		System.out.println("=====Updated array elements are... =====");
		for (int k = 0; k < arr.length-1; k++) 
		{
			System.out.print(arr1[k]+" ");
		}
	}
		}
}
	
