package Day_Task_Pattern;

public class Pattern_36 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
	       {
			int n=5;
	    	   for(int j=5;j>=1;j--)
	    	   {
	    		   if(j<=i)
	    		   {
	    			   System.out.print(n-- +" ");
	    		   }
	    		   else
	    		   {
	    			   System.out.print("  ");
	    		   }
	    	   }
	    	  
	    	   System.out.println(); 
	       }
	}
}
