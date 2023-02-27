package _20_02_23;

import java.util.Scanner;

public class P10 {
	
	
	//Even And Odd Method Recursion...

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number...");
		int num=sc.nextInt();
		
		System.out.println(evenOdd(num));
	}

	public static int evenOdd(int num) {
		
		if(num<=0)
		{ 
		    return num;
		}
          else if(num%2==0)
         {
    	  System.out.println(num+" is the even");
          }
	  else 
	    {
		System.out.println(num+" is the odd");
		
	    }
     return evenOdd(num-1);
      
      
		
		
	}
}
