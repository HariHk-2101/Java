package Pattern_Programs;

import java.util.Scanner;

public class Rev_Left_Tri {
   public static void main(String[] args) {

   	Scanner sc= new Scanner(System.in);
		 
		System.out.println("Enter The Size..");
		int size=sc.nextInt();
	
		for(int i=1;i<=size;i++)
		   {
			
			for(int j=i;j<=size;j++)
			{
				
					System.out.print("* ");
				
				
			}
			System.out.println();
		}
}
}
