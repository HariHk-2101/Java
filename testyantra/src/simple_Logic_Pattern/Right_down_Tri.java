package simple_Logic_Pattern;

public class Right_down_Tri {

	public static void main(String[] args) {
		
		int n=5;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				
				if(i<=j)
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
