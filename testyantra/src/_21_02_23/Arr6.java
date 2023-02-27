package _21_02_23;

import java.util.Scanner;

public class Arr6 {

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
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			int temp=1;
			int num=a[i];
			
			for(int j=2;j<=num/2;j++)
			{
				if(a[i]%j==0)
				{
				    temp=0;
				}
			}
			
			if(temp==1)
			{
				System.out.println("Prime Element Are "+a[i]);
			}
			
		}
		
}
}
