package Day_Tasks_Num;

public class Nth_Fibi {

	public static void main(String[] args) {

		int num = 6;

		int a1 = 0, b1 = 1, c1 = 0;
		for (int i = 1; i <= num; i++) {

			System.out.print(a1 + " ");

			c1 = a1 + b1;
			a1 = b1;
			b1 = c1;
		}
		System.out.println();

		
		
		int a = 0, b = 1, c = 0;
		for (int i = 1; i <= num; i++) {
			if (num == i) {
				System.out.println("Nth Fibi Is " + a);
			}

			c = a + b;
			a = b;
			b = c;
		}
	}
}
