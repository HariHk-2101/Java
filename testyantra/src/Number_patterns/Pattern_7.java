package Number_patterns;

public class Pattern_7 {

	public static void main(String[] args) {
//		int n=3;
//		int num=4;
//		int num1=0;
//		
//		for(int i=n;i>=1;i--)
//		{
//			
//			for(int j=1;j<=n;j++)
//			{
//				
//				if(i<=j)
//				{
//					if(i==j) {
//					System.out.print(num +" ");
//					 num=i-1;
//					}
//					 else {
//						
//						num1=num+j+1;
//						System.out.print(num1 +" ");
//						
//						
//					 }
//				}
//				else
//				{
//					System.out.print("  ");
//				}
//			  
//			}
//			
//			System.out.println();
//		}
		
	    int n=4;
		
		for(int i=n;i>=1;i--)
		{
			int a=n*2-1;
			
			for(int j=1;j<=n;j++)
			{
				if(i<=j) {
					
				System.out.print(a+" ");
				
				}
				else
				{
					System.out.print("  ");
				}
			}
			
			System.out.println();
		}
	}
}
