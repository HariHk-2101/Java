package LeetCode;

import java.util.Scanner;

public class LeetCode3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Dates How Many You Want....");
		
		int size=sc.nextInt();
		
		int p[]=new int[size];
		
		System.out.println("Enter The Prices");
		
		for(int i=0;i<size;i++)
		{
			p[i]=sc.nextInt();
		}
		
		
		
		System.out.println("Your profit is "+profitt(p));
	}


		public static int profitt(int []p) 
		{
		
		Scanner sc=new Scanner(System.in);
		
		int profit=0;
		
		
		System.out.println("Enter The Buy Day...");
        
		int buy=sc.nextInt();
		
		System.out.println("Enter The Sell Day...");
		
	  	int sell=sc.nextInt();
		     
	  	if(buy != 0 && sell != 0)
		{
		     for(int i=0;i<p.length;i++)
		     {
			 
			   profit = p[buy - 1] - p[sell- 1];
			 
		     }
		     return profit;
		}
	  	else
	  	{
	  		return 0;
	  	}
     }
}

