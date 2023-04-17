package Day_Task_1D_Array;


public class Find_Avg_Ele {

	//2.  Create an array of int type and find the average of those elements
	    
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int count=0;
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			count++;
			sum=sum+a[i];
		}
		
		int avg=sum/count;
		
		System.out.println("Avg of Array "+avg);
	}
}
