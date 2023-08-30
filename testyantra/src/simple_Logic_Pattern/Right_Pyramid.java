package simple_Logic_Pattern;

public class Right_Pyramid {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((i>=j&&i<=n)||(i+j<=2*n&&i>n)) {
				
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
