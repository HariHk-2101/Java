package Day_Tasks_Num;

public class Prime_Num_Range {

	public static void main(String[] args) {
		
		for(int i=10;i<=30;i++)
		{
			int num=i;
			int count=0;
			
			for(int j=1;j<=num;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}
}
