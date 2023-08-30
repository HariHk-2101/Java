package Vertical_patterns;

public class Vertical_Num2 {

	public static void main(String[] args) {

		int n = 4;
		
		int a=n*2-1;
		for (int i = 1; i <= n; i++) {
			
			
			
			for (int j = 1; j <= n; j++) {

				if (i + j >= n + 1) {

					System.out.print(a + " ");
					
					a=a+j;
					
				} else {
					System.out.print("  ");
				}
				
			}
		System.out.println();
		}
	}
}
