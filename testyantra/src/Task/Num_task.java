package Task;

public class Num_task {

	public static void main(String[] args) {

		int n = 2468;
		int n1 = 1357;

		// 27456381
		int count = 0;

//		while (n > 0 || n1 > 0) {
//			if (n > 0) {
//				count++;
//
//				n /= 10;
//			}
//			if (n1 > 0) {
//				count++;
//				n1 /= 10;
//			}
//		}
		System.out.println(count);
		int rev = 0;
		

		while (n > 0) {

			int d = n % 10;

			rev = rev * 10 + d;

			n /= 10;

		}
		System.out.println(rev);
		int add=0;
		while(rev>0) {
			add=(add*10)+rev%10;
			add=(add*10)+n1%10;
			n1=n1/10;
			rev=rev/10;
		}
		System.out.println(add);
	}
}
