package _17_02_23;

import java.util.Scanner;

public class P10 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Size...");
		int size=sc.nextInt();
		char ch='A';
		for(int r=1;r<=size;r++)
		{
			for(int c=1;c<=size;c++)
			{
				
			 if(r==c)
			 {
				 System.out.print(ch++ +" ");
			 }
			 else
			 {
				 System.out.print(r+c +" ");
			 }
			}
			System.out.println();
		}
		
  }
}
