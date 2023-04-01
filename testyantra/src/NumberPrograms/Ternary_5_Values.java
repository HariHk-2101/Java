package NumberPrograms;

import java.util.Scanner;

public class Ternary_5_Values {

        public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value 1...");
		int a=sc.nextInt();
		System.out.println("Enter The Value 2...");
		int b=sc.nextInt();
		System.out.println("Enter The Value 3...");
		int c=sc.nextInt();
		System.out.println("Enter The Value 4...");
		int d =sc.nextInt();
		System.out.println("Enter The Value 5 ...");
		int e=sc.nextInt();
		int result=a>b && a>c && a>d &&a>e? a : b>c&&b>d&&b>e ? b:c>d && c>e? c:d>e?d:e;
		
		System.out.println(result+" Is the largest Number...");
		

	}
}
