package simple_Logic_Pattern;

public class Tri_Or_Pyramid {

	public static void main(String[] args) {
		
		int n=3;
		
		for (int i = 1; i <=n; i++) {   
			for (int j = 1; j < n+i; j++) {
				
				if(j>n-i)
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
