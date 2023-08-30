package Day_Task_2D_Array;

public class Addition_Of_Each_Col {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
		
		
		int k=0;
		for (int i = 0; i < a.length; i++) {
			int sum=0;
			for (int j = 0; j < a[i].length; j++) {
				
				sum+=a[i][j];
				
				
			}
			
			System.out.println(sum);
		}
	}
}
