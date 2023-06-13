   package Practice_Patterns;

public class Tri_Logic {

	public static void main(String[] args) {
		    
	int n=3;
//		int rows=2*n-1;
//		for(int i=1;i<=rows;i++)
//		{
//			for(int j=1;j<=n;j++)
//			{
//				if((j<=i && i<=n)||(i>n && i+j<=2*n ))
//				{
//					System.out.print("* ");
//				}
//				else
//				{
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<n+i;j++)
			{
				if(j>n-i)
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
