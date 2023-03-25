package Pattern_Programs;

import java.util.Scanner;

//print
//1 0 1 0 1
//1 0 1 0 1
//1 0 1 0 1
//1 0 1 0 1
//1 0 1 0 1
public class P8 {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The Row size..");
		
		int row=sc.nextInt();
		
        System.out.println("Enter The Col size..");
		
		int col=sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
		for(int j=1;j<=col;j++)
		{
		   if(j%2==0)
		   {
			   System.out.print("0 ");
		   }
		   else
			   System.out.print("1 ");
		}
		System.out.println();
		}
	}
}
