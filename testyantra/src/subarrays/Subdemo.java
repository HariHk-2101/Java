package subarrays;

public class Subdemo {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,4};
		
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
