package Array1D;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = { 9, 11, 2, 8, 1, 3 };

		for (int i = 0; i < arr.length - 1; i++) {

			int small = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[small]) {
					small = j;
				}
			}

			int temp = arr[small];
			arr[small] = arr[i];
			arr[i] = temp;

		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
