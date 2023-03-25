package Pattern_Programs;

import java.util.Scanner;

public class p3 {

public static void main(String[] args) {
		
	//0 1 0 1 0
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Range..");
		
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(i%2==1)
			{
				System.out.print("0"+" ");
			}
			else 
			{
				System.out.print("1"+" ");
			}
		}
	}
}

