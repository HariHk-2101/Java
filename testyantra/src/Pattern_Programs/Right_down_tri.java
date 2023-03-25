package Pattern_Programs;

import java.util.Scanner;

public class Right_down_tri {
	  public static void main(String[] args) {
			 Scanner sc= new Scanner(System.in);
			 
				System.out.println("Enter The Size..");
				int size=sc.nextInt();
			
				for(int i=1;i<=size;i++)
				{
					for(int j=size;j>=1;j--)
					{
						if(i>=j)
						{
							System.out.print("* ");
						}
						else {
							System.out.print(" "+" ");
						}
					}
					System.out.println();
				}
			
}

}