package simple_Logic_Pattern;

public class Octagon {

	public static void main(String[] args) {
		
		int n=7;
		
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <=n; j++)
			{
				if((i==1&&j>=3&&j<=5)||(i==n&&j>=3&&j<=5)||(j==1&&i>=3&&i<=5)||(j==n&&i>=3&&i<=5)||(i+j==n*2-2)||(j==i-n+3)||(i==j-n+3)||(i==2&&i==j))
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
