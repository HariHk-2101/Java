package LeetCode;

public class LeetCode2 {

	
    public int removeDuplicates(int[] nums) {
        
        int i =0 ;
 	for(int j=1; j<nums.length ; j++){
 		if(nums[i] !=nums[j]){
 			i++;
         }
             nums[i] = nums[j];
     }
     
     return (i+1);
     
     }
	
	public static void main(String[] args) {
	
		int nums[]= {0,0,1,1,1,2,2,3,3,4}; 
		
		
		int[] expectedNums = new int[nums.length]; 

		LeetCode2 lc=new LeetCode2();
	    
		int k = lc.removeDuplicates(nums); 

		System.out.print(k+" ");//Printing Length
		assert k == expectedNums.length;
		for (int i = 0; i < k; i++) {
		    assert nums[i] == expectedNums[i];
		  System.out.print(nums[i]+" ");//Printing elements
		}
	
	}
}
