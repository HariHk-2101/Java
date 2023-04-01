package KrishnaSandeep;

	import java.util.Arrays;

	public class Sorted_array_square {
	    
	 public static int[] sum(int a[])
	{
			int[] s=new int[a.length];
			int first=0;
			int last=a.length-1;
			int sq_ind=a.length-1;
			
    while(first<=last)	
    {
	 if(a[first]*a[first]>a[last]*a[last])
	 {
		 s[sq_ind--]=a[first]*a[first];
				first++;		
	 }
	 else
	 {
		 s[sq_ind--]=a[last]*a[last];
		 last--;
	 }
  }		
     return s;
   } 
		public static void main(String[] args) {
			int []a= {2,5,7};
	        int []sq=sum(a);
	        System.out.println(Arrays.toString(sq));
		}

	}


