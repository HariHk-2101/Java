package Programs;

import java.util.Scanner;

public class Ternary {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
			
		   System.out.println("Enter The Number 1");
			int num1=sc.nextInt();
			System.out.println("Enter The Number 2");
			int num2=sc.nextInt();
			
			String greatest = num1>num2 ? num1+" is greatest." : num2+" is greatest";
			
			System.out.println(greatest);

			
			System.out.println("=======================");
			
			String smallest = num1<num2 ? num1+" is smallest" : num2+" is smallest";
			
			System.out.println(smallest);
			
			System.out.println("=======================");
			
			System.out.println("Enter  The Value....");
			int num =sc.nextInt();
			
			String p_n =num>0 ? num+"is positive.." : num+"is negative..";
			
			System.out.println(p_n);
			
			
			System.out.println("===================");
			
			String e_o =num%2==0 ? num+" is even number" : num+" is odd number";
			
			System.out.println(e_o);
			
		}
}
