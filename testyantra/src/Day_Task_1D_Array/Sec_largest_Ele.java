package Day_Task_1D_Array;

public class Sec_largest_Ele {
	
//22.  Find second largest element in a n array
	
	public static void main(String[] args) {
		int a[]= {8,1,9,3,4,5,7,2,5};
		
		int max=a[0];
		int secmax=a[1];
		
		for (int i = 1; i < a.length; i++) 
		{
			if(max!=a[i]) {
				
			if(a[i]>max) {
				secmax=max;
				max=a[i];
			}else if(a[i]>secmax) {
				secmax=a[i];
			}
		}
			
		}
		
		System.out.println(secmax);
	}
}
