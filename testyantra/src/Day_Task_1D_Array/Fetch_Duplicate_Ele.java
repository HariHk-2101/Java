package Day_Task_1D_Array;

public class Fetch_Duplicate_Ele {

	//17.  Fetch duplicates elements from an array
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,4,2};
		
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]==a[j])
				{
					count++;
				}
			}
			
			if(count>=1)
			{
				System.out.print(a[i]+" ");
			}
			
		}
	}

}
