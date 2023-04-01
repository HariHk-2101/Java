package Greek_For_Greek;

import java.util.Arrays;

public class pair {
	
	     long first, second;  
	     public pair(long first, long second)  
	     {  
	         this.first = first;  
	         this.second = second;  
	     }  
	   
	     
	 } 

	 class Compute
	 {
	     static pair getMinMax(long a[], long n)  
	     {
	    	 
	    	 Arrays.sort(a);
	    	 
	    	 long min= a[0];
	    	 long max=a.length-1;
	    	 
	    	 pair p =new pair(min,max);
			return p;
	         
	     }
	        
	     
	 }

