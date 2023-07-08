package subarrays;

import java.util.Arrays;

public class Subdemo {

	public static void main(String[] args) {
		
		int [] a= {7,3,2};
		
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		int p = a.length*(a.length+1)/2;
		
		System.out.println("Sub array Possibilities are "+p);
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				
				for(int k=i;k<=j;k++)
				{ 
					System.out.print(a[k]);
					
					
				}
				System.out.println();
				
			}
			
		}
		
	}
}
