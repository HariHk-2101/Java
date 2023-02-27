package _18_02_23;

import java.util.Scanner;

public class Calculator {
       
	  static int a=300;
	 static int b=100;
	
	public static void add() {
		System.out.println(" sum "+ a+b);
	}
    public static void sub() {
    	System.out.println(" sub "+ (a-b));
	}
    public static void mul() {
    	System.out.println(" multiplication "+a*b);
	}
    public static void mod() {
    	System.out.println(" mod "+a%b);
	}
    public static void div() {
    	System.out.println("division" +a/b);
	}
    public static void discount() {
       int  d=10;
       int a=300;
		System.out.println("You Got "+ (a*d) /100 + " % discount...");
   	}
    
    
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println(" Enter 1 to get Sums...");
		  System.out.println(" Enter 2 to get sub...");
		  System.out.println(" Enter 3 to get multiplication...");
		  System.out.println(" Enter 4 to get mod...");
		  System.out.println(" Enter 5 to get divison...");
		  System.out.println(" Enter 6 to get Discount...");
		  System.out.println();
		  System.out.println(" Choose Your Option...");
	  
	   
	   int choice=sc.nextInt();
	   
	   switch(choice)
	   {
	   case 1 :{
		      add();
	   }break;
	   case 2 :{
		      sub();
	   }break;
	   case 3 :{
		      mul();
	   }break;
	   case 4 :{
		      mod();
	   }break;
	   case 5 :{
		      div();
	   }break;
	   case 6 :{
		      discount();
	   }break;
	   
	   default :{
		   System.out.println("Invalid choice..");
	   }
	   }
	}
}
