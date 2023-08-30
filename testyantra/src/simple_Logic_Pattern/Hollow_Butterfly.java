package simple_Logic_Pattern;

public class Hollow_Butterfly {

	public static void main(String[] args) {
		int n=7;
		
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=1;j<=n*2-1;j++)
			{
				if(j==1||j==n*2-1||i==j||i+j==n*2) {
				
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
