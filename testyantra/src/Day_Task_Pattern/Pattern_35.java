package Day_Task_Pattern;

public class Pattern_35 {

	public static void main(String[] args)
	{
		int n=1;
		for(int i=1;i<=5;i++)
         {
    	   for(int j=5;j>=1;j--)
    	   {
    		   if(j<=i)
    		   {
    			   System.out.print(n+" ");
    		   }
    		   else
    		   {
    			   System.out.print("  ");
    		   }
    	   }
    	   n++;
    	   System.out.println();
       }
	}
}
