package simple_Logic_Pattern;

public class Holo_Pyramid {

	public static void main(String[] args) {
		
		int n=9;
		
		for (int i = 1; i <=n ; i++) {
			for (int j = 1; j < n*2; j++) {
				
				if(i==n||i+j==n+1||j-i==n-1)
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
