package _21_02_23;

import java.util.Scanner;

public class Arr5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size...");
		int size=sc.nextInt();
		
		System.out.println("Enter The Characters...");
		char[]arr=new char[size];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next().charAt(0);
		
		}
		
		System.out.println(arr[0]+" , " +arr[arr.length-1]);
		
		
		
		
		
	}
}
