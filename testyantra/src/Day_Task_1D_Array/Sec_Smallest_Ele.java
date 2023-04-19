package Day_Task_1D_Array;

public class Sec_Smallest_Ele {
//26.  Find second smallest element in a n array
	public static void main(String[] args) {
		
		int a[]= {9,1,3,4};
		
		int min=a[0];
		int secmin=a[1];
		
		for (int i = 1; i < a.length; i++) {
			
			if(a[i]!=min)
			{
				if(a[i]<min)
				{
					secmin=min;
					min=a[i];
				}
				else if(a[i]<secmin)
				{
					secmin=a[i];
				}
					      
			}
		}
		System.out.println(secmin);
	}
}
