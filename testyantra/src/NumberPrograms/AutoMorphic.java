package NumberPrograms;

import java.util.Scanner;

public class AutoMorphic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number.....");

		int num = sc.nextInt();
   
		int temp = num;

		int sq = num * num;

		while (num > 0) {

			if (num % 10 != sq % 10)
			{
				break;
			}
			num = num / 10; 
			sq = sq / 10;
		}
		if (num == 0) {
			System.out.println("Given  Number " + temp + " Auto morphic Number..");
		} else {
			System.out.println("Given  Number " + temp + " Not Auto morphic Number..");
		}

	}
}
