package Day_Tasks_Num;

public class Perfect_Num {

	public static void main(String[] args) {
		
		int num=6;
		int sum=0;
		
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		if(num==sum)
		{
			System.out.println("Perfect Number...");
		}
		else
		{
			System.out.println("Not A perfect Num");
		}
	}
}
