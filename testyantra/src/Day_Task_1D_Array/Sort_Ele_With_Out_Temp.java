package Day_Task_1D_Array;

import java.util.Arrays;

public class Sort_Ele_With_Out_Temp {

	//31.  Sorting of an array elements without temporary variable
	
	public static void main(String[] args) {
		
		int a[]= {1,3,5,2,4};
		
		for (int i = 0; i < a.length; i++) 
		{
			for(int j=i+1;j< a.length;j++)
			{
			    if(a[i]>a[j])
			    {
				a[i]=a[i]+a[j];
				a[j]=a[i]-a[j];
				a[i]=a[i]-a[j];
			   }
			
			}
		}
		
		System.out.println(Arrays.toString(a));
	}
}
