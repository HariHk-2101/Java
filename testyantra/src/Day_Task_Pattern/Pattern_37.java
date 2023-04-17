package Day_Task_Pattern;

public class Pattern_37 {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
	       {
			char ch='A';
	    	   for(int j=5;j>=1;j--)
	    	   {
	    		   if(j<=i)
	    		   {
	    			   System.out.print(ch++ +" ");
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
