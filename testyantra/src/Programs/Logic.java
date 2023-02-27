package Programs;

import java.util.Scanner;

public class Logic {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("=======Rahul========");
		System.out.println("Enter The Money...");
		int money=sc.nextInt();
		System.out.println("Enter the Cost of 1 Kg Apples....");
		double cost = sc.nextDouble();
		
		double buy= money/cost;
		
		System.out.println("Rahul buys " +buy+ " KGs of apples");
		
		System.out.println("======Ram=======");
		System.out.println("Enter The Money...");
		int moneyy=sc.nextInt();
		System.out.println("Enter the Cost of 1 chocolate....");
		double costt = sc.nextDouble();
		
		int buyy= (int)( moneyy/costt);
		
		System.out.println("Ram  buys " +buyy+ " Chocolates...");
		
	}

}
