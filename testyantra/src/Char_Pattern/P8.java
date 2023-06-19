package Char_Pattern;

public class P8 {

	public static void main(String[] args) {
		int n=3;
		char ch = 'Z';
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
			}
			ch--;
			System.out.println();
		}
	}
}
