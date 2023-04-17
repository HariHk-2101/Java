package Day_Tasks_Num;

public class Prime_Num_Sum_Range {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=10;i<=20;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
