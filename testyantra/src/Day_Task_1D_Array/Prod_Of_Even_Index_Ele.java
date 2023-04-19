package Day_Task_1D_Array;

public class Prod_Of_Even_Index_Ele {
//14.  Product of even index array elements
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		
		int prod=1;
		for (int i = 0; i < a.length; i++) {
			
			if(i%2==0)
			{
				prod=prod*a[i];
			}
			
		}
		System.out.println("Prod of even Index Ele Are "+prod);
	}
}
