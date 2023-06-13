package Practice_Patterns;


public class Tri {
public static void main(String[] args) {
	
	int or=0;
	int n=3;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=(n-1)+n;j++)
		{
			if(i+j>=n+1 && i+j<=(n+1)+or)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		or=or+2;
		System.out.println();
	}
}
}
