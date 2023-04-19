package Day_Task_1D_Array;

public class Find_Large_Ele {

	//21.  Find largest element in a n array
	
	public static void main(String[] args) {
		
		int a[]= {1,7,2,33,4,99,5};
	
		int l=0;
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>l)
			{
				l=a[i];
				
			}
			}
		
		System.out.println(l);
	}
	
	
}
