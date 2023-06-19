package Practice_Patterns;

public class Pattern {

	public static void main(String[] args) {
		
		int n=4;
		
		for(int i=1;i<=n;i++)
		{
			int a=i;
			int b=n-1;
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(a+" ");
				a=a+b;
				b--;
			}
			
			System.out.println();
		}
	}
}
