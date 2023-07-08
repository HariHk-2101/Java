package Day_Task_1D_Array;

import java.util.Scanner;

public class Check_Occurance {

	// 10. Check occurance of user given element in an array

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 30, 40, 20, 30 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key");
		int key = sc.nextInt();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (key == a[i]) {
				count++;
			}
		}
		System.out.println(key + " present in " + count + " times");
	}
}
