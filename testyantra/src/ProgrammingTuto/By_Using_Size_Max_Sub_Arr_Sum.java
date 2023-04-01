package ProgrammingTuto;

public class By_Using_Size_Max_Sub_Arr_Sum {

	public static int getSum(int arr[],int k) {
		
		int start=0,sum=0,maxSum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		
		if(i>=k -1)
		{
			maxSum=Math.max(sum, maxSum);
			sum = sum - arr[start];
			start++;
		}
	    }
		return maxSum;
	}
	public static void main(String[] args) {
		
		/*
		    {2,1,5}=8
		    {1,5,1}=7
		    {5,1,3}=9
		    {1,3,2}=6
		 */
		int [] arr = {2,1,5,1,3,2};
		int k =3;
		int result =getSum(arr,k);
		System.out.println(result);
	}
}
