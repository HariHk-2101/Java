package Programs;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The length..");
		
		double length=sc.nextDouble();
		
		System.out.println("Enter The Breath...");
		
		double breadth =sc.nextDouble();
		
		double area =length*breadth;
		
		double perimeter =length+breadth +length+breadth;
		
		System.out.println("area of rectangle :"+area);
		
		System.out.println("perimeter of rectangle :"+perimeter);

	}

}
