package simple_Logic_Pattern;



public class Butterfly_prog {

	public static void main(String[] args) {
		int n=6;
		
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=1;j<=n*2-1;j++)
			{
				if((i>=j&&i<n)||(i+j<=2*n&&i>=n)||i+j>=n*2&&i<=n||i<=j&&i>=n) {
				
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