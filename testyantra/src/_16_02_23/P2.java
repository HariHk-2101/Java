package _16_02_23;

import java.util.Scanner;

public class P2 {
     public static void main(String[] args) {
    	 	Scanner sc= new Scanner(System.in);
   		 
    		System.out.println("Enter The Size..");
    		int size=sc.nextInt();
    	
    		for(int i=1;i<=size;i++)
    		   {
    			  int n=1;
    			for(int j=i;j<=size;j++)
    			{
    				
    					System.out.print(n++ +" ");
    				
    				
    			}
    			System.out.println();
    		}
	}
}
