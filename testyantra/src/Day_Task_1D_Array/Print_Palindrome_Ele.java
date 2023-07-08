package Day_Task_1D_Array;

public class Print_Palindrome_Ele {
	// 33. Check and print only the palindrome elements of an array
	public static void main(String[] args) {

		int a[] = { 121, 32, 252 };
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			int rev = 0;
			int num = a[i];

			while (num > 0) {
				int d = num % 10;

				rev = rev * 10 + d;

				num = num / 10;
			}
			if (rev == a[i]) {
				flag = true;
				System.out.print(a[i] + " ");
			}

		}
		if (flag == false) {
			System.out.println("There Is No Palindrome Ele In Array");
		}
	}
}
