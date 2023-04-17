package Day_Task_1D_Array;

public class All_Ele_Pre_Or_Not {
//12.  Check whether all the elements first array are present in the second array
	
	public static void main(String[] args) {
		int a[]= {10,20,30};
		int b[]= {10,20,30};
		if(a.length!=b.length)
		{
			System.out.println("Both Arrays Length are  Not Same..");
		}
		else
		{
			boolean flag=true;
	     	    for(int i=0;i<a.length;i++)
	        	{
	     	    	
			    	  if(a[i]!=b[i])
			    	  {
			    		  flag=false;
			    		  break;
			          }
	     	    }
	       
	     	    if(flag==true)
	     	    {
	     	    	System.out.println("Both Array Elements Are Present");
	     	    }
	     	    else
	     	    {
	     	    	System.out.println("Not Present");
	     	    }
		}
		
		
	}
}
