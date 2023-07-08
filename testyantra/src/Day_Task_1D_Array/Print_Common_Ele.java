package Day_Task_1D_Array;

public class Print_Common_Ele {
//8.  Check and print the common elements present in between two array 

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40 };
		int b[] = { 10, 20, 30, 40, 25 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.print(a[i] + " ");
					break;
				}
			}
		}
	}
}
