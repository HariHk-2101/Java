package Day_Tasks;

public class Tech_Num {

	public static void main(String[] args) {
		int num=2025;
		int count=0;
		int temp=num;
		while(num>0)
		{
			count++;
			num/=10;
		}
		if(count%2==0)
		{
			count/=2;
			int n=1;
			for(int i=1;i<=count;i++)
			{
				n*=10;
			}
			
			int mod=temp%n;
			int div=temp/n;
			int sum=mod+div;
			int sq=sum*sum;
			
			if(sq==temp)
			{
				System.out.println("Tech Num");
			}
			else
			{
				System.out.println("Not Tech Num");
			}
			
		}
		else
		{
			System.out.println("Not A Tech Number...");
		}
	}
}
