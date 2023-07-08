package NumberPrograms;

public class Factorial_Range {

	public static void main(String[] args) {
		
		int n=1;
		int n1=10;
		
		for(int i=n;i<=n1;i++)
		{
			int sum=1;
			for(int j=1;j<=i;j++)
			{
				sum=sum*j;
			}
			System.out.println(i+"="+sum);
		}
	}
}
