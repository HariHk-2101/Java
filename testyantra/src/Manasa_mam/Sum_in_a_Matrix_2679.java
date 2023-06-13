package Manasa_mam;



public class Sum_in_a_Matrix_2679 {

	public static void main(String[] args) {

		int nums[][] = { { 7, 2, 1 }, { 6, 4, 2 }, { 6, 5, 3 }, { 3, 2, 1 } };

		System.out.println(matrixSum(nums));
	}

	public static int matrixSum(int[][] nums) {

		
//		int one=0,two=0,three=0;
//
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = 0; j < nums[i].length; j++) {
//				
//				 
//				 if(j==0&&nums[i][j]>one)
//				 {
//					 one=nums[i][j];
//				 }
//				 else if(j==1&&nums[i][j]>two)
//				 {
//					 two=nums[i][j];
//				 }
//				 else if(j==2&&nums[i][j]>three)
//				 {
//					 three=nums[i][j];
//				 }
//				System.out.print(nums[i][j]+" ");
//				 
//			}
//			System.out.println();
//		}
//		
//		int sum=one+two+three;  
//		return sum;
		
		int one=0;
		int n=0;
		for (int i = 0; i < nums.length; i++) {
			 
			for (int j = 0; j < nums[i].length; j++) {
				
				
				 if(j==n)
				 {
					 one=nums[i][j];
					
				 }
				 
				 
			}
			n++;
			
		}
  return one;
	}
}
