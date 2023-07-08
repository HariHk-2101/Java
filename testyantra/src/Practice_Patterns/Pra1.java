package Practice_Patterns;

public class Pra1 {
	public static void main(String[] args) {
		
		int n=9;
		for (int i = 1; i <=n*2-1; i++) {
			for(int j=1;j<=n*2;j++)
			{
				if(i>=j&&i<=n||i<j&&j>=n&&i>=n)
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
