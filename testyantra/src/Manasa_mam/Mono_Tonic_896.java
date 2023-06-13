package Manasa_mam;

public class Mono_Tonic_896 {

	static boolean flag=false;
	public static void main(String[] args) {
		
		int nums[]= {6,5,4,4};
		
	 
	}
	
	   public static boolean isMonotonic(int[] nums) {
	      
		   for (int i = 0; i < nums.length-1; i++) {
				
				  if(nums[i]>=nums[i+1])
				  {
					 flag= true; 
				  }
				  else
				  {
					  flag=false;
					  break;
				  }
		   }
		   return flag;
	   } 
		  public static boolean decrease(int[]nums) {
			
			 
			  for (int i = 0; i < nums.length-1; i++) {
				
				  if(nums[i]<=nums[i+1])
				  {
					 flag= true; 
				  }
				  else
				  {
					  flag=false;
					  break;
				  }
			}
			  return flag;
		  }
			  
		  
}
