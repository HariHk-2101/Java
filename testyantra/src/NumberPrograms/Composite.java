package NumberPrograms;

import java.util.Scanner;

public class Composite {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter The Number...");
		
        int num=sc.nextInt();
        
        boolean check=true;
        
        for(int i=2;i<num;i++)
        {
        	if(num%i==0)
        	{
        		check=false;
        	}
        }
        
       if(check==false)
       {
    	   System.out.println(num+" is A composite Number..");
       }
       else
       {
    	   System.out.println(num+" is Not composite Number...");
       }
}
}
