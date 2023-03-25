package Method_Recursion;

import java.util.Scanner;

public class Count_Num_Method_Rec {
	
	
	  //Count The numbers
	
      static int count=1;
      public static void main(String[] args)
      {
    	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Number...");
		int num=sc.nextInt();
		System.out.println("The count of Given Number is: "+countt(num));
	   }

	public static int countt(int num) {
		if(num<=1)
		{
			return count;
		}
		
		else
		{
			count++;
			
		  return countt(num-1) ;
		 
		}
		
	}
}
