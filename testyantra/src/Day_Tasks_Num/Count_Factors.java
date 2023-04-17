package Day_Tasks_Num;

public class Count_Factors {

	public static void main(String[] args) {
		
		int num=6;
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
