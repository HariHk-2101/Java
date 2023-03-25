package Array1D;

import java.util.Scanner;

public class Occurance_Ele_Check {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size..");
		
		int size=sc.nextInt();
		
		int arr1[]=new int [size];
		
		System.out.println("Enter The Elements...");
		
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();	
		}
		
		System.out.println("Enter Checking Element...");
		
		int check=sc.nextInt();
		
		int count=0;
		
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==check)
			{
				count++;
			
			}
		}
		
		if(count>0)
		{
		System.out.println("User Input "+check+" is Occurance "+count+" times in Array");
		}
		else
		{
			System.out.println("User Input "+check+" is Not Present In Array.");
		}
   }
}
