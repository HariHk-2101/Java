package Programs;

import java.util.Scanner;

public class Typecasting {

	public static void main(String[] args) {
		
		System.out.println("Enter The Byte Value....");
		Scanner sc = new Scanner(System.in);
		
		
		
		byte num =sc.nextByte();
		System.out.println("========Type Casting Byte=========");
		short s =num;
		System.out.println(num+"Converting into short...");
		
		int i =num;
		System.out.println(num+"Converting into int...");
		
		long l =num;
		System.out.println(num+"Converting into long...");
		float f =num;
		System.out.println(num+"Converting into float...");
		double d =num;
		System.out.println(num+"Converting into double...");
		
		
		System.out.println("Enter The Short Value....");
		
		System.out.println("=========Type Casting Short===========");
		short num1 =sc.nextShort();
		
		char ch=(char) num1;
		System.out.println(num1+"Converting into char...");
		
		int i1 =num1;
		System.out.println(num1+"Converting into int...");
		
		long l1 =num1;
		System.out.println(num1+"Converting into long...");
		float f1 =num1;
		System.out.println(num1+"Converting into float...");
		double d1 =num1;
		System.out.println(num1+"Converting into double...");
		
		System.out.println("Enter The Double Value....");
		System.out.println("=========Type Casting double===========");
		double num3 =sc.nextDouble();
		
		char ch2=(char) num3;
		System.out.println(num3+"Converting into char...");
		
		byte b1=(byte)num3;
		System.out.println(num3+"Converting into byte...");
		
		short s1=(short)num3;
		System.out.println(num3+"Converting into byte...");
		
		
		int i2 =(int)num3;
		System.out.println(num3+"Converting into int...");
		
		long l2 =(long)num3;
		System.out.println(num3+"Converting into long...");
		
		float f2 =(float)num3;
		System.out.println(num3+"Converting into float...");
		
		
		

	}

}
