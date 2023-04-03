package Day_Tasks;

public class Sum_Of_Factors {

	public static void main(String[] args) {
		
		int num=5;
		
		int sum=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
			sum+=i;
			}
		}
		System.out.println(sum);
	}
}
