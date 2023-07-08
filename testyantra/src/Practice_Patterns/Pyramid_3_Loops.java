package Practice_Patterns;

public class Pyramid_3_Loops {

	public static void main(String[] args) {
		
//		int n=5;
//		int st=n*2-1;
//		for(int i=n;i>=1;i--)
//		{
//			
//			for(int j=1;j<=n-i;j++)
//			{
//				System.out.print("  ");
//			}
//			for(int k=1;k<=st;k++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//			st-=2;
//		}
//		
  		int n=5;
		int st=1;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=st;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			st+=2;
		}
	}
}
