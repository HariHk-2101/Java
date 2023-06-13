package Day_Task_1D_Array;

public class Print_Prime_Ele {
//34.  Print only the prime array elements
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,7};
		
		boolean flag=false;
		for (int i = 0; i < a.length; i++) {
			 
			 int n=a[i];
			 
			 int count=0;
			 for (int j = 1; j <=n; j++) {
				
				 if(n%j==0)
				 {
					 count++;
				 }
				
			}
			 
			if(count==2)
			{
				flag=true;
				System.out.print(n+" ");
			}
			
		}
		
		if(flag==false)
		{
			System.out.println("There IS No Prime Elements");
		}
	}
}
