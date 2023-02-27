package _21_02_23;

import java.util.Scanner;

public class Arr4 {

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
		
		
		int cube=0;
		
		for(int i=0;i<a.length;i++)
		{
			cube=a[i]*3;
		}
		
		System.out.println("The Total Cube Of Elements is :"+cube);
		
	}
}