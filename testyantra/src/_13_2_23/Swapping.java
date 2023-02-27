package _13_2_23;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The 1st value...");
		int num1=sc.nextInt();
		
		System.out.println("Enter The 2nd Value..");
		int num2=sc.nextInt();
		
		System.out.println("With Using Temp Variable....");
		System.out.println("before Swapping the Number.."+ num1 +" & "+num2);
		int temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("After Swapping the Number.."+ num1 +" & "+num2);
		
		System.out.println();
		
		System.out.println("WithOut Using Temp Variable....");
		System.out.println("Enter The 1st value...");
		int num3=sc.nextInt();
		
		System.out.println("Enter The 2nd Value..");
		int num4=sc.nextInt();
		
		
		
		System.out.println("before Swapping the Number.."+ num3 +" & "+num4);
		
		num3=num3+num4;
		num4=num3-num4;
		num3=num3-num4;
		
		System.out.println("After Swapping the Number.."+ num3 +" & "+num4);
	}

}
