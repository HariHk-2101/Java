package Day_Tasks_Num;

public class Factors_Sum_Given_Num {

	public static void main(String[] args) {
		
		int num=10;
		int sum=0;
		
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
				
				
			}
		}
		System.out.println(sum);
	}
}
