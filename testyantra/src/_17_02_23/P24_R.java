package _17_02_23;

import java.util.Scanner;

public class P24_R {

	  public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter The  row Size...");
			int size=sc.nextInt();
			System.out.println("enter col size");
			int size1=sc.nextInt();
			for(int r=1;r<=size;r++)
			{
				for(int c=1;c<=size1;c++)
				{
					if(r==1&&c==size1 ) {
						System.out.print("  ");
					}
				else if(c==1 ||r==1 ||c==size1||r==(size+1)/2)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
		}
}
