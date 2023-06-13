package LeetCode;

public class Rev_Leet {

	public static void main(String[] args) {

		int x = 1534236469;

		System.out.println(rev(x));

	}

	public static int rev(int x) {

				int rev = 0;

		if (x < Integer.MAX_VALUE/2 && x > Integer.MIN_VALUE/2) {
			while (x > 0 || x < 0) {
				int d = x % 10;
				rev = rev * 10 + d;
				x /= 10;
			}

		}
	
		return rev;
	}
}
