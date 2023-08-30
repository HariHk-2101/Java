package Day_Tasks_Num;

public class Neon_Num {

	public static void main(String[] args) {
		
		int n=9;
		
		int sq=n*n;
		
		int sum=0;
		
		while(sq!=0)
		{
			int rem=sq%10;
			
			sum=sum+rem;
			
			sq/=10;
		}
		
		if(sum==n)
		{
			System.out.println("Neon");
		}
		else
		{
			System.out.println("Not Neon");
		}
	}
}
