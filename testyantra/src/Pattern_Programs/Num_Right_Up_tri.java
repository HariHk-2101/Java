package Pattern_Programs;

import java.util.Scanner;

public class Num_Right_Up_tri {
   public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 
		System.out.println("Enter The Size..");
		int size=sc.nextInt();
	
		
		for(int i=1;i<=size;i++)
		{
			for(int j=size;j>=i;j--)
			{
				System.out.print(j+ " ");
	        }
			System.out.println();
}
}
}
