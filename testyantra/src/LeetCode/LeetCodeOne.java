package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class LeetCodeOne {

	public static int ele(int[]nums)
	{
		Arrays.sort(nums);
		
		int k=0;
	
		for(int j=1;j<nums.length;j++)
			{
				if(nums[k]!=nums[j])
				{
					k++;
				}
				
				nums[k]=nums[j];
				
			}
	
	return k+1;
	}		
	

	
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("Enter The Array Size,..");
//		int size=sc.nextInt();
//		int[]nums =new int[size];
//		
//	    System.out.println("Enter The Elements...");
//	    for(int i=0;i<nums.length;i++)
//	    {
//	    	nums[i]=sc.nextInt();
//	    }
//	    int target=sc.nextInt();
		
		int nums[]= {0,0,1,1,1,2,2,3,3,4};
		
	
	    LeetCodeOne lc=new LeetCodeOne();
	    
	    int n =  lc.ele(nums);
	    
	    for(int i=0;i<nums.length;i++)
	    {
	    	System.out.print(nums[i]+" ");
	    }
	}
	
	
//    public int removeDuplicates(int[] nums) {
//        
//        int i =0 ;
// 	for(int j=1; j<nums.length ; j++){
// 		if(nums[i] !=nums[j]){
// 			i++;
//         }
//             nums[i] = nums[j];
//     }
//     
//     return (i+1);
//     
//     }
//	
//	public static void main(String[] args) {
//	
//		int nums[]= {0,0,1,1,1,2,2,3,3,4};
//		
//		
//		int[] expectedNums = new int[nums.length]; // The expected answer with correct length
//
//		LeetCode2 lc=new LeetCode2();
//	    
//		int k = lc.removeDuplicates(nums); // Calls your implementation
//
//		System.out.print(k+" ");
//		assert k == expectedNums.length;
//		for (int i = 0; i < k; i++) {
//		    assert nums[i] == expectedNums[i];
//		  System.out.print(nums[i]+" ");
//		}
//	
//	}

}
