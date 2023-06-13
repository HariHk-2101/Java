 package Pattern_Programs;


public class Pyramid
{
  public static void main(String[] args) {
//	  Scanner sc= new Scanner(System.in);
//		 
//		System.out.println("Enter The Size..");
		int size=6;
//	
		for(int r=1;r<=size;r++)
		{
			for(int j=1;j<=size-r;j++)
			{
				System.out.print("  ");
			}
				for(int k=1;k<=2*r-1;k++)
				{
					System.out.print("* ");
				}
				
				System.out.println();
		}
		
		
}
}
