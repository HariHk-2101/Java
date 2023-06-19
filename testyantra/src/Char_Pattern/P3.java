package Char_Pattern;

public class P3 {
 
	public static void main(String[] args) {
		int n = 3;
		char ch = 'A';
		for (int i = n; i >= 1; i--) {

			for (int j = 1; j <= n; j++) {
				if(i<=j)
				System.out.print(ch++ + " ");
				else
				{
					System.out.print("  ");
				}
			}

			System.out.println();
		}
	}
}
