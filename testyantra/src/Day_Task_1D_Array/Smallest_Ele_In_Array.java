package Day_Task_1D_Array;

public class Smallest_Ele_In_Array {
//25.  Find smallest element in a n array
	
	public static void main(String[] args) {
		
		int a[]= {2,31,1,1,2,4};
		
		int min=a[0];
		for (int i = 0; i < a.length; i++) {

			if(a[i]<min)
			{
				min=a[i];
			}
			}
		
		System.out.println(min);
	}
}
