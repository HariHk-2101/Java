package Array1D;

import java.util.Scanner;

public class Five_Multiply_Ele {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Size...");
		
		int size=sc.nextInt();
		
		System.out.println("Enter The Values...");
		
		int[]arr=new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%5==0)
			{
				System.out.println(arr[i]+" is Multilple by 5");
			}
		}
	}
}
