package Day_Task_1D_Array;

public class All_Ele_Pre_Or_Not {
//12.  Check whether all the elements first array are present in the second array
	
	public static void main(String[] args) {
		int a[]= {1,2,3,8,5};
		int b[]= {1,2,3,5,8};
		
		if(a.length!=b.length)
		{
			System.out.println("Both Arrays Length are  Not Same..");
		}
		else
		{
			    int temp=0;
	     	    for(int i=0;i<a.length;i++)
	        	{
	     	    	for (int j = 0; j < b.length; j++) {
						
			    	  if(a[i]==b[j])
			    	  {
			    		 temp++;
			    		  break;
			          }
			    	  
	     	    	}
	     	    }
	       
	     	    if(temp==a.length)
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
