package Arrays_2D;

import java.util.Scanner;

public class P15_Sparse {

	public static void main(String[] args) {
//		Scanner sc= new Scanner(System.in);
//		
//		System.out.println("Enter The row size..");
//		int row=sc.nextInt();
//		System.out.println("Enter The Col Size..");
//		int col=sc.nextInt();
//		
//	 int arr[][]=new int[row][col];

		int arr[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

		System.out.println("Printing The 1st Array Elements..");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		boolean flag = false;

		int b = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j && arr[i][j] == b) {
					flag = true;

				}
			}
		}
		if (flag == true) {
			System.out.println("Sparse");
		} else {
			System.out.println("Not Sparse");
		}

	}
}
