package Array1D;

import java.util.Scanner;

public class Product_Ele {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Size...");
		
		int size=sc.nextInt();
		
		System.out.println("Enter The Elements..");
		
		int [] a= new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
	
		
		int prod=1;
		
		for(int p=0;p<a.length;p++)
		{
			prod*=a[p];
		}
		
		System.out.println("The Total Product Of Elements is :"+prod);
		
		
	}
	
}
