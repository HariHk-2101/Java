package LeetCode;

public class Missing_Num_Leet {

	public static void main(String[] args) {
		 
		int[] nums= {1,2,3,5};
		  
		Missing_Num_Leet m1=new Missing_Num_Leet();
		   
		  System.out.println(m1.missingNumber(nums));
	}
	   public int missingNumber(int[] nums) {
	        
	        int sum=0;
	         int i=1;
	         int j=0;
	    
	        do{
	             if(i==nums[j])
	             {
	                 i++;
	                 j++;
	             }
	             while(i<nums[j])
	             {
	                 sum=i;
	                 i++;
	             }

	        }
	        while(j<nums.length-1);
	        return sum;
	    }
}
