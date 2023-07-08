package Day_Task_1D_Array;

public class Find_Sum_Of_Odd_Array_Ind_Ele {

	//41.find sum of odd array index elements
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		
		int sum=0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(i%2==1)
			{
				sum=sum+a[i];
			}
		}
		System.out.println("Sum of Odd index Array Ele is "+sum);
		
	}
}
