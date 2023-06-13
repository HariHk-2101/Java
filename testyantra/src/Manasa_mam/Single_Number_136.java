package Manasa_mam;

public class Single_Number_136
 {

	public static void main(String[] args) {
		int nums[]= {2,2,1,1,3};
		
		System.out.println(singleNumber(nums));
	}
	  public static int singleNumber(int[] nums) {
	        
	        int result=0;

	        for(int i=0;i<nums.length;i++)
	        {
	            int count=0;
	            
	            for(int j=0;j<nums.length;j++)
	            {
	                if(nums[i]==nums[j])
	                {
	                    count++;
	                }
	            }
	            if(count==1)
	            {
	                result=nums[i];
	               
	            }
	        }
	        return result;
	    }
}
