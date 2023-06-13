package Practice_Patterns;

public class Diamond {

	public static void main(String[] args) {
		
//		int n=6;
//		for(int i=1;i<=n*2-1;i++)
//		{
//			for(int j=1;j<n+i;j++)
//			{
//				if((j>n-i)&&(i+j<=n*3-1)&&(j>=i-n+1))
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
		
		int n=5;
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=1;j<=n*2-1;j++)
			{
				if (i + j == n + 1 || i == j - n + 1||i+j==n*3-1||j==i-n+1)
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
