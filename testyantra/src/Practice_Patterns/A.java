package Practice_Patterns;



public class A {

	public static void main(String[] args) {
		int b = 1;
		int n = 9;
		
for (int i = 1; i <= n; i++) 
{
	int a = b;
	int c = n-1;
	for (int j = 1; j <= i; j++)
	{	
		
			System.out.print(a+" ");
			a += c;
			c--;
	}
	b++;
	System.out.println();
}
	}
}
