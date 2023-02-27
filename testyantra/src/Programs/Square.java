package Programs;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The side..");
		
		double side=sc.nextDouble();
		
		double area =side*side;
		
		double perimeter =side*4;
		
		System.out.println("area of square :"+area);
		System.out.println( "perimeter of a square :"+perimeter);
		
		


	}

}
