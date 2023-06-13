package NumberPrograms;

import java.util.Scanner;

public class Ternary3Operator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value 1...");
		int a=sc.nextInt();
		System.out.println("Enter The Value 2...");
		int b=sc.nextInt();
		System.out.println("Enter The Value 3...");
		int c=sc.nextInt();
		
		
		int result=(a>b)?a:(b>c)?b:c;
		
		System.out.println(result+" Is the largest Number...");
		

	}

}
