package _22_02_23;

import java.util.Scanner;

public class P1 {

	//Finding Maximun Value In Array..
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size...");
		
		int size=sc.nextInt();
		
		System.out.println("Enter The Elements....");
		
	
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		
		System.out.println("The Maximum element in Array: "+max);
	}
}
